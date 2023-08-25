package org.fasttrackit.tema12.ExtraMile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car LandRover = new Car("LandRover", 5, 5000, 18000);
        Car Jaguar = new Car("Jaguar", 1, 1000, 40000);
        Car Bentley = new Car("Bentley", 2, 3000, 85000);

        List<Car> cars = new ArrayList<>();
        cars.add(LandRover);
        cars.add(LandRover);
        cars.add(LandRover);
        cars.add(Jaguar);
        cars.add(Jaguar);
        cars.add(Bentley);
        cars.add(Bentley);
        cars.add(Bentley);
        cars.add(Bentley);

        CarShop carShop = new CarShop(cars);

        System.out.println(carShop.nameByNumberOfCars());
        System.out.println(carShop.nameBySumKm());

        Range kmRange1 = new Range(0, 1500);
        Range kmRange2 = new Range(1500, 5000);
        Range priceRange1 = new Range(0, 50000);
        Range priceRange2 = new Range(50000, 100000);
        List<Range> kmRange = new ArrayList<>();
        kmRange.add(kmRange1);
        kmRange.add(kmRange2);
        List<Range> priceRange = new ArrayList<>();
        priceRange.add(priceRange1);
        priceRange.add(priceRange2);

        System.out.println(carShop.getCarByKmRange(kmRange));
        System.out.println(carShop.getCarByPriceRange(priceRange));
    }
}
