package org.fasttrack.Tema16.Exercitiu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop <T extends ShopItem>{
    private List<T> items;

    public Shop(){
        this.items = new ArrayList<>();
    }

    public void addItem(T item){
        this.items.add(item);
    }

    public List<T> findByCategory(Category cat){
        List<T> findCat = new ArrayList<>();
        for(T currItem: items){
            if(currItem.category().equals(cat)){
                findCat.add(currItem);
            }
        }
        return findCat;
    }

    public List<T> findWithLowerPrice(int maxPrice){
        List<T> findMaxPrice = new ArrayList<>();
        for (T currItem: items){
            if(currItem.price()<maxPrice){
                findMaxPrice.add(currItem);
            }
        }
        return findMaxPrice;
    }

    public Optional<T> findByName(String name){
        for(T currItem: items){
            if(currItem.name().equals(name)){
                return Optional.of(currItem);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name){
        for(T currItem: items){
            if(currItem.name().equals(name)){
                items.remove(currItem);
                return Optional.of(currItem);
            }
        }
        return Optional.empty();
    }

    public List<T> findByPriceRange(Range range){
        List<T> findPriceList = new ArrayList<>();
        for (T currItem: items){
            if(range.isInRange(currItem.price())){
                findPriceList.add(currItem);
            }
        }
        return findPriceList;
    }
}
