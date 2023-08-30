package org.fasttrack.Tema16.Exercitiu;

import java.util.Optional;

public class MainGenerics {
    public static void main(String[] args) {
        Clothes adidas = new Clothes("adidas", 950, Category.NEW);
        Clothes tricou = new Clothes("tricou", 100, Category.ON_SALE);
        Clothes blugi = new Clothes("blugi", 180, Category.REFURBISHED);

        Electronics telefon = new Electronics("Iphone14MaxPro", 7000, Category.NEW);
        Electronics frigider = new Electronics("beko", 1200, Category.ON_SALE);
        Electronics laptop = new Electronics("hp", 700, Category.REFURBISHED);

        Fruits papaya = new Fruits("papaya", 50, Category.NEW);
        Fruits pepene = new Fruits("pepene", 6, Category.ON_SALE);

        Shop<Clothes> cShop = new Shop<>();
        cShop.addItem(adidas);
        cShop.addItem(tricou);
        cShop.addItem(blugi);

        Shop<Electronics> eShop = new Shop<>();
        eShop.addItem(telefon);
        eShop.addItem(frigider);
        eShop.addItem(laptop);

        Shop<Fruits> fShop = new Shop<>();
        fShop.addItem(papaya);
        fShop.addItem(pepene);

        System.out.println(cShop.findByCategory(Category.REFURBISHED));
        System.out.println(eShop.findByCategory(Category.NEW));
        System.out.println(fShop.findByCategory(Category.ON_SALE));

        System.out.println(cShop.findWithLowerPrice(200));

        Optional<Fruits> fructExotic = fShop.findByName("papaya");
        if(fructExotic.isPresent()){
            System.out.println(fructExotic);
        }else {
            System.out.println("There is no such item in this shop");
        }

        Range range1 = new Range(0, 2000);
        System.out.println(eShop.findByPriceRange(range1));
        eShop.removeItem("hp");
        System.out.println(eShop.findByPriceRange(range1));
    }
}
