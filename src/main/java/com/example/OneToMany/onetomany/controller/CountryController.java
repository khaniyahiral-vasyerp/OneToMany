package com.example.OneToMany.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OneToMany.onetomany.model.Country;
import com.example.OneToMany.onetomany.model.State;
import com.example.OneToMany.onetomany.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/getall")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/getbyid/{id}")
    public Country getCountryById(@PathVariable Integer id) {
        return countryService.getCountryById(id);
    }

    @PostMapping()
    public Country saveCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    // This method is not used in this application, it's just for testing
    @DeleteMapping("/delte/{id}")
    public void deleteCountry(@PathVariable Integer id) {
        countryService.deleteCountry(id);

    }

    @GetMapping("/{countryId}/states")
    public String addStatesToCountry(@PathVariable Integer countryId, @RequestBody List<State> states) {
        System.out.println("Inside the addStatesToCountry Method");
        countryService.addStateToCountry(countryId, states);
        return "sucess:state iss added to  the country";

    }
}