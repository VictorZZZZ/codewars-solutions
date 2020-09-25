package kata.pingpong;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class PingPong {
    private static int me = 0;
    private static int opponent = 0;

    public static List<Score> result(String winOrLose) {
        List<Score> result = new ArrayList<>();
        result.addAll(checkGamesResults(winOrLose, 11));
        result.addAll(checkGamesResults(winOrLose, 21));
        return result;
    }

    private static List<Score> checkGamesResults(String winOrLose, int pointSystem) {
        resetGame();
        List<Score> result = new ArrayList<>();
        for (int i = 0; i < winOrLose.length(); i++) {
            increaseWinner(winOrLose.charAt(i));
            //при 10:10 или при 20:20
            if ((me == opponent) && (me == pointSystem - 1)) {
                for (i = i + 1; i < winOrLose.length(); i++) {
                    increaseWinner(winOrLose.charAt(i));
                    if (abs(me - opponent) == 2) {
                        result.add(new Score(me, opponent));
                        resetGame();
                        break;
                    }
                }
            }
            //Конец
            if (me >= pointSystem || opponent >= pointSystem) {
                result.add(new Score(me, opponent));
                resetGame();
            }
        }
        if (!(me == 0 && opponent == 0)) {
            result.add(new Score(me, opponent));
        }
        return result;
    }

    private static void resetGame() {
        me = 0;
        opponent = 0;
    }

    private static void increaseWinner(char c) {
        if (c == 'W') {
            me++;
        } else {
            opponent++;
        }
    }
}
