package org.fasttrack.tema18.Controller;

import org.fasttrack.tema18.Country;
import org.fasttrack.tema18.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("countries")
public class CountryController {
    private CountryService service;

    @Autowired
    public CountryController(CountryService service) {

        this.service = service;
    }

    @GetMapping
    public List<Country> getAllCountries(){

        return service.getAllCountries();
    }

    @GetMapping("{countryId}/capital")
    public String getCapitalOfCountryById(@PathVariable int countryId){
        return service.getCapitalOfCountryById(countryId);
    }

    @GetMapping("{countryId}/population")
    public long getPopulationlOfCountryById(@PathVariable int countryId){
        return service.getPopulationlOfCountryById(countryId);
    }

    @GetMapping("{continentName}/countries")
    public List<Country> getCountriesByContinent(@PathVariable String continentName){
        return service.getCountriesByContinent(continentName);
    }

    @GetMapping("{countryId}/neightbours")
    public List<String> getCountryNeightbourById(@PathVariable int countryId){
        return service.getCountryNeightbourById(countryId);
    }

    @GetMapping("{continentName}/countriess")
    public List<Country> getAllCountriesByContinentAndPopulation(@PathVariable(name = "continentName") String continentName,
                                                                 @RequestParam(name = "minPopulation", required = false) Integer minPopulation){
        return service.getAllCountriesByContinentAndPopulation(continentName, minPopulation);
    }

    @GetMapping("byNeighbour")
    public List<Country> getCountryByNeighbours(@RequestParam String includeNeighbour,
                                                 @RequestParam String excludeNeighbour){
        return service.getCountryByNeighbours(includeNeighbour, excludeNeighbour);
    }
}
