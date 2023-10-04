package org.fasttrack.tema18.Service;

import org.fasttrack.tema18.Country;
import org.fasttrack.tema18.Service.CountryReader;
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

     public List<String> getAllCountryNames(){
        return allCountries.stream()
                .map(Country::getName)
                .collect(Collectors.toList());
     }

}
