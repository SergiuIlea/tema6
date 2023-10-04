package org.fasttrack.tema18;

import java.util.List;

public class Country {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String capital;
    private long population;
    private int area;
    private String continent;
    private List<String> neighbours;

    public Country(String name, String capital, int population, int area, String continent, List<String> neighbours) {
        this.id = idCounter++;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbours = neighbours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public List<String> getNeightbours() {
        return neighbours;
    }

    public void setNeightbours(List<String> neightbours) {
        this.neighbours = neightbours;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Country.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
