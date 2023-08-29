package org.fasttrack.Tema15.Exercitiu;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println(fahrenheitToCelcius(100));
        System.out.println(fahrenheitToCelcius(0));
        System.out.println(fahrenheitToCelcius(50));
        System.out.println(celsiusToFahrenheit(10));
    }
    public static double fahrenheitToCelcius(double temperature){
        double result = (temperature-32)*5/9;
        return result;
    }

    public static double celsiusToFahrenheit(double temperature){
        double result = temperature*9/5 + 32;
        return result;
    }
}
