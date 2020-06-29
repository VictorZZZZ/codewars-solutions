package kata;

public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number){
        if(number==0) return 0;
        if(number % 5==0) return number;
        return (number>0)? ((number/5)*5+5) : ((number/5)*5);
    }
}

