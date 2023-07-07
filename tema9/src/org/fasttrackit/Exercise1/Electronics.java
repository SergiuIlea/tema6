package org.fasttrackit.Exercise1;

public class Electronics extends Product {
    private String length;
    private String width;
    private String height;
    private String weight;
    public Electronics(int price, String name, String description, int quantity,
                       String length, String width, String height, String weight){
        super(price, name, description, quantity);
        this.length = length;
        this.width = width;
        this.height = height;
        this. weight = weight;
    }
    public String getLength() {
        return length;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }
}
