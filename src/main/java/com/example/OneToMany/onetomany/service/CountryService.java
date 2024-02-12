package com.example.OneToMany.onetomany.service;

import java.util.List;

import com.example.OneToMany.onetomany.model.Country;
import com.example.OneToMany.onetomany.model.State;

public interface CountryService {
    List<Country> getAllCountries();

    Country getCountryById(Integer id);

    Country saveCountry(Country country);

    Country updateCountry(Country country);

    void deleteCountry(Integer id);

    void addStateToCountry(Integer id, List<State> states);
}
