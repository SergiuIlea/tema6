package org.fasttrackit.tema12.ExtraMile;

import java.util.*;

public class CarShop {
    private List<Car> car;

    public CarShop(List<Car> car) {
        this.car = car;
    }

    public Map<String, Integer> nameByNumberOfCars(){
        Map<String, Integer> nameByNr = new HashMap<>();
        Set<String> carNames = getCarNames();
        for(String currName: carNames){
            nameByNr.put(currName, getNrOfCarsByName(currName));
        }
        return nameByNr;
    }

    public Set<String> getCarNames(){
        Set<String> uniqueNames = new HashSet<>();
        for(Car currCar: car){
            uniqueNames.add(currCar.getName());
        }
        return uniqueNames;
    }

    public Integer getNrOfCarsByName(String name){
        int c = 0;
        for(Car currCar: car){
            if(currCar.getName().equals(name)){
                c++;
            }
        }
        return c;
    }

    public Map<String, Integer> nameBySumKm(){
        Map<String, Integer> nameByKm = new HashMap<>();
        Set<String> carNames = getCarNames();
        for(String currName: carNames){
            nameByKm.put(currName, getSumKm(currName));
        }
        return nameByKm;
    }

    public Integer getSumKm(String name){
        int sum = 0;
        for(Car currCar: car){
            if(currCar.getName().equals(name)) {
                sum += currCar.getKm();
            }
        }
        return sum;
    }

    public Map<Range, List<Car>> getCarByKmRange(List<Range> range){
        Map<Range, List<Car>> carByKmRange = new HashMap<>();
        for(Car currCar: car){
            Range newRange = null;
            for (Range currRange: range){
                if(currRange.isInRange(currCar.getKm())){
                    newRange = currRange;
                    break;
                }
            }
            List<Car> currCarByKmRange = carByKmRange.get(newRange);
            if(currCarByKmRange == null){
                List<Car> newCarList = new ArrayList<>();
                newCarList.add(currCar);
                carByKmRange.put(newRange, newCarList);
            }else{
                currCarByKmRange.add(currCar);
                carByKmRange.put(newRange, currCarByKmRange);
            }
        }
        return carByKmRange;
    }

    public Map<Range, List<Car>> getCarByPriceRange(List<Range> range){
        Map<Range, List<Car>> carByPriceRange = new HashMap<>();
        for(Car currCar: car){
            Range newRange = null;
            for(Range currRange: range ){
                if(currRange.isInRange(currCar.getPrice())) {
                    newRange = currRange;
                    break;
                }
            }
            List<Car> currCarByPriceRange = carByPriceRange.get(newRange);
            if(currCarByPriceRange == null){
                List<Car> newCarList = new ArrayList<>();
                newCarList.add(currCar);
                carByPriceRange.put(newRange,newCarList);
            }else{
                currCarByPriceRange.add(currCar);
                carByPriceRange.put(newRange, currCarByPriceRange);
            }
        }
        return carByPriceRange;
    }
}
