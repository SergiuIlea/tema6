package org.fasttrack.tema7;

public class Main {
    public static void main(String[] args) {
        //ex1
        Persoana Brigitte = new Persoana("Brigitte", 22, false);

        //ex2
        Persoana Sergiu = new Persoana("Sergiu", 26, false);
        Persoana Florin = new Persoana("Florin", 32, true);
        Persoana Alin = new Persoana("Alin", 41, true);

        //ex3
        Product proteina = new Product("Whey Protein", 173, 1, "Supliment");

        //ex4
        Product preWorkout = new Product("Warcry", 155, 2, "Supliment");
        Product creatine = new Product("Creatine", 95, 1, "Supliment");
        Product burner = new Product("Lipo6", 181, 0, "Supliment");

        //ex5
        Bottle aquaCarpatica = new Bottle(2000, 1500, false);
    }
}