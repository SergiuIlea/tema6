package org.fasttrackit.tema10.Exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BuquetOfFlowers {
    private Set<String> flowers;

    public BuquetOfFlowers(){
        this.flowers = new HashSet<>();
    }

    public Collection<String> getAll(){
        return this.flowers;
    }

    public void add (String flower){
        flowers.add(flower);
    }

    public void remove (String flower){
        flowers.remove(flower);
    }
}
