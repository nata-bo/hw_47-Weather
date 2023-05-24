package de.ait;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;



class WeatherToolsTest {
  @ParameterizedTest
    @CsvSource({
            "0,true,'Gusty Calm with speed of 0 km'",
            "0,false,'Calm with speed of 0 km'",
            "5,true,'Gusty Light Air with speed of 5 km'",
            "5,false,'Light Air with speed of 5 km'",
            "10,true,'Gusty Light Breeze with speed of 10 km'",
            "10,false,'Light Breeze with speed of 10 km'",
            "15,true,'Gusty Gentle Breeze with speed of 15 km'",
            "15,false,'Gentle Breeze with speed of 15 km'",
            "20,true,'Gusty Moderate Breeze with speed of 20 km'",
            "20,false,'Moderate Breeze with speed of 20 km'",
            "30,true,'Gusty Fresh Breeze with speed of 30 km'",
            "30,false,'Fresh Breeze with speed of 30 km'",
            "40,true,'Gusty Strong Breeze with speed of 40 km'",
            "40,false,'Strong Breeze with speed of 40 km'",
            "50,true,'Gusty Near Gale with speed of 50 km'",
            "50,false,'Near Gale with speed of 50 km'",
            "70,true,'Gusty Gale with speed of 70 km'",
            "70,false,'Gale with speed of 70 km'",
            "80,true,'Gusty Strong Gale with speed of 80 km'",
            "80,false,'Strong Gale with speed of 80 km'",
            "100,true,'Gusty Storm with speed of 100 km'",
            "100,false,'Storm with speed of 100 km'",
            "110,true,'Gusty Violent Storm with speed of 110 km'",
            "110,false,'Violent Storm with speed of 110 km'",
            "120,true,'Gusty Hurricane with speed of 120 km'",
            "120,false,'Hurricane with speed of 120 km'",

    })
    public void describeWind_test1(int speed, boolean isGusty, String description){
      assertEquals(description,WeatherTools.getWindDescription(speed,isGusty));
  }


}