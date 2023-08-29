package org.fasttrack.tema15;

import org.fasttrack.Tema15.Exercitiu.MainCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private MainCalculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new MainCalculator();
    }

    @Test
     public void testFahrenheitToCelsius1(){
        double test1 = MainCalculator.fahrenheitToCelcius(100);
        Assertions.assertEquals(37.77777777777778, test1);
    }

    @Test
    public void testFahrenheitToCelsius2(){
        double test2 = MainCalculator.fahrenheitToCelcius(0);
        Assertions.assertEquals(-17.777777777777778, test2);
    }

    @Test
    public void testFahrenheitToCelsius3(){
        double test3 = MainCalculator.fahrenheitToCelcius(50);
        Assertions.assertEquals(10, test3);
    }

    @Test
    public void testCelsiusToFahrenheit(){
        double test = MainCalculator.celsiusToFahrenheit(10);
        Assertions.assertEquals(50,test);
    }
}
