package kata.pingpong;

import java.util.Objects;

public class Score {
    private int me;
    private int opponent;

    public Score(int me, int opponent) {
        this.me = me;
        this.opponent = opponent;
    }

    @Override
    public String toString() {
        return "Score("+me+", "+opponent + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return me == score.me &&
                opponent == score.opponent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(me, opponent);
    }
}
