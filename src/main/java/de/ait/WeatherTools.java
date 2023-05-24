package de.ait;

public class WeatherTools {

    //<1 == Calm
    //1-5 == Light Air
    //6-11 == Light Breeze
    //12-19 == Gentle Breeze
    //20-28 == Moderate Breeze
    //29-38 == Fresh Breeze
    //38-49 == Strong Breeze
    //50-61 == Near Gale
    //62-74 == Gale
    //75-88 == Strong Gale
    //89-102 == Storm
    //103-117 == Violent Storm
    //118+Hurricane

    //getWindDescription(20, true) -> "Gusty Moderate Breeze with speed of 20 km"
    //getWindDescription(20, false) -> "Moderate Breeze with speed of 20 km"
    //getWindDescription(30, true) -> "Gusty Moderate Breeze with speed of 30 km"
    //getWindDescription(30, false) -> "Moderate Breeze with speed of 30 km"
    public static String getWindDescription(int speed,boolean isGusty){
        String result = "";
        if (speed<1 && isGusty){
          return "Gusty Calm with speed of "+speed+" km";
         }else if (speed<1) {
            return "Calm with speed of "+speed+" km";
        }else if (speed <= 5 && isGusty) {
           return "Gusty Light Air with speed of " +speed+ " km";
        }else if (speed <= 5) {
            return "Light Air with speed of " +speed+ " km";
        }else if (speed <=11 && isGusty){
            return "Gusty Light Breeze with speed of " +speed+ " km";
        }else if (speed <=11){
            return "Light Breeze with speed of " +speed+ " km";
        }else if (speed <= 19 && isGusty){
            return "Gusty Gentle Breeze with speed of " +speed+ " km";
        }else if (speed <= 19){
            return "Gentle Breeze with speed of " +speed+ " km";
        }else if (speed <= 28 && isGusty){
            return "Gusty Moderate Breeze with speed of " +speed+ " km";
        }else if (speed <= 28){
            return "Moderate Breeze with speed of " +speed+ " km";
        }else if (speed <= 38 && isGusty){
            return "Gusty Fresh Breeze with speed of " +speed+ " km";
        }else if (speed <= 38){
            return "Fresh Breeze with speed of " +speed+ " km";
        }else if (speed <= 49 && isGusty){
            return "Gusty Strong Breeze with speed of " +speed+ " km";
        }else if (speed <= 49){
            return "Strong Breeze with speed of " +speed+ " km";
        }else if (speed <= 61 && isGusty){
            return "Gusty Near Gale with speed of " +speed+ " km";
        }else if (speed <= 61){
            return "Near Gale with speed of " +speed+ " km";
        }else if (speed <= 74 && isGusty){
            return "Gusty Gale with speed of " +speed+ " km";
        }else if (speed <= 74){
            return "Gale with speed of " +speed+ " km";
        }else if (speed <= 88 && isGusty){
            return "Gusty Strong Gale with speed of " +speed+ " km";
        }else if (speed <= 88){
            return "Strong Gale with speed of " +speed+ " km";
        }else if (speed <= 102 && isGusty){
            return "Gusty Storm with speed of " +speed+ " km";
        }else if (speed <= 102){
            return "Storm with speed of " +speed+ " km";
        }else if (speed <= 117 && isGusty){
            return "Gusty Violent Storm with speed of " +speed+ " km";
        }else if (speed <= 117){
            return "Violent Storm with speed of " +speed+ " km";
        }else if (speed>118 && isGusty){
            return "Gusty Hurricane with speed of " +speed+ " km";
        }else if (speed>118){
            return "Hurricane with speed of " +speed+ " km";
        }

        return result;
    }


}
