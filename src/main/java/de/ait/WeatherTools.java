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
    public static String getWindDescription(double speed, boolean isGusty){


        return "deep";
    }
}
