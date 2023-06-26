package org.fasttrack.tema7;

public class Product {
    public String name;
    public int price;
    public int quantity;
    public String category;
    public Product(String denumire, int pret, int cantitate, String categorie){
        name = denumire;
        price = pret;
        quantity = cantitate;
        category = categorie;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getCategory(){
        return category;
    }
    public boolean hasStock(){
        if(quantity!=0){
            return true;
        }
        else return false;
    }
    public boolean isCategory(String categoryA){
        if(categoryA.equals(category)){
            return true;
        }
        else return false;
    }
}
