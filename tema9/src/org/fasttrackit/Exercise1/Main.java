package org.fasttrackit.Exercise1;

public class Main {
    public static void main(String[] args) {
        Product cola = new Product(8, "Cola", "suc", 3);
        System.out.println(cola.getPrice());
        System.out.println(cola.getName());
        System.out.println(cola.getDescriprion());
        System.out.println(cola.getQuantity());
        System.out.println("----------------------");
        Cosmetics crema = new Cosmetics(22, "Nivea", "crema de fata", 1, "alb", 0.5);
        System.out.println(crema.getColor());
        System.out.println(crema.getWeight());
        System.out.println("----------------------");
        Electronics printer = new Electronics(1000, "VoxeLab Aquilla 2", "3D printer", 1, "260mm", "265mm", "300mm", "5kg");
        System.out.println(printer.getWidth());
        System.out.println(printer.getLength());
        System.out.println(printer.getHeight());
        System.out.println(printer.getWeight());
        System.out.println("----------------------");
        Fridge beko = new Fridge(2500, "Beko", "frigider", 1, "90cm", "95cm", "200cm", "50kg", 2);
        System.out.println(beko.getTemperature());
    }
}
