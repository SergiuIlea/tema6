package org.fasttrackit.tema10.Exercise1;

import java.util.*;

public class Basket {
    private List<String>  fruits;

    public Basket(){
        this.fruits = new ArrayList<>();
    }

    public boolean find (String fruit){
        return fruits.contains(fruit);
    }

    public void remove (String fruit){
        fruits.remove(fruit);
    }

    public int position (String fruit){
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct(){
        Set<String> uniqueCollection = new HashSet<>(fruits);
        return uniqueCollection;
    }

    public void add(String fruit){
        fruits.add(fruit);
    }

    public int count(){
        return fruits.size();
    }

    public int uniqueFruitsCount(){
        int counter=0;
        List<String> uniqueFruits = new ArrayList<>();
        for(String fruit: fruits){
            if(!uniqueFruits.contains(fruit)){
                uniqueFruits.add(fruit);
                counter++;
            }
        }
        return counter;
    }

}
