package org.fasttrackit.Exercise1;

import org.fasttrackit.Exercise1.Electronics;

public class Fridge extends Electronics {
    private int temperature;
    public Fridge(int price, String name, String description, int quantity,
                       String length, String width, String height, String weight,
                       int temperature){
        super(price, name, description, quantity, length, width, height, weight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
