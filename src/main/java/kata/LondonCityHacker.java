package kata;

import java.util.Locale;

public class LondonCityHacker {
    //Link: https://www.codewars.com/kata/5bce125d3bb2adff0d000245/
    public static String londonCityHacker(Object[] journey){
        float tubeJourney = 2.4F;
        float busJourney = 1.5F;
        float tripCost = 0F;
        boolean[] adjacent= { false,false };
        for(int i=0;i<journey.length;i++){

            if(journey[i] instanceof Integer){
                if(adjacent[0] && !adjacent[1]){
                    adjacent[1]=true;
                }
                if(!adjacent[0]) {
                    tripCost+=busJourney;
                    adjacent[0]=true;
                }
                if(adjacent[0] && adjacent[1]){
                    adjacent[0]=false;
                    adjacent[1]=false;
                }
                if((i<journey.length-1) && !(journey[i+1] instanceof Integer) && adjacent[0]){
                    adjacent[0]=false;
                }
            }
            if(journey[i] instanceof String){
                tripCost+=tubeJourney;
            }
        }
        return String.format(Locale.UK,"£%.2f",tripCost);
    }
}
