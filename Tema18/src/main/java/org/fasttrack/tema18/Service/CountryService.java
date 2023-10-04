package org.fasttrack.tema18.Service;

import org.fasttrack.tema18.Country;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {
    private List<Country> allCountries;

    public CountryService() {
        this.allCountries = CountryReader.getAllFromFile();
    }

    public List<Country> getAllCountries() {
        return allCountries;
    }

    public void setAllCountries(List<Country> allCountries) {
        this.allCountries = allCountries;
    }

     public List<String> getAllCountryNames() {
         return allCountries.stream()
                 .map(Country::getName)
                 .collect(Collectors.toList());
     }

     public String getCapitalOfCountryById(int countryId){
        return allCountries.stream()
                .filter(country -> country.getId() == countryId)
                .map(Country::getCapital)
                .findFirst()
                .orElseThrow(() -> new RuntimeException());
     }

    public long getPopulationlOfCountryById(int countryId){
        return allCountries.stream()
                .filter(country -> country.getId() == countryId)
                .map(Country::getPopulation)
                .findFirst()
                .orElseThrow(() -> new RuntimeException());
    }

    public List<Country> getCountriesByContinent(String continentName){
        return allCountries.stream()
                .filter(country -> country.getContinent().equals(continentName))
                .collect(Collectors.toList());
    }

    public List<String> getCountryNeightbourById(int countryId){
        return allCountries.stream()
                .filter(country -> country.getId() == countryId)
                .map(Country::getNeightbours)
                .findFirst()
                .orElseThrow(() -> new RuntimeException());
    }

    public List<Country> getAllCountriesByContinentAndPopulation(String continentName, Integer minPopulation){
        return getCountriesByContinent(continentName)
                .stream()
                .filter(country -> country.getPopulation() >= minPopulation)
                .collect(Collectors.toList());
    }

    public List<Country> getCountryByNeighbours(String includeNegighbour, String excludeNeighbour ){
        return getAllCountries().stream()
                .filter(country -> country.getNeightbours().contains(includeNegighbour))
                .filter(country -> !country.getNeightbours().contains(excludeNeighbour))
                .collect(Collectors.toList());
    }
}
