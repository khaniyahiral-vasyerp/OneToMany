package com.example.OneToMany.onetomany.service.serviceimmple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OneToMany.onetomany.model.Country;
import com.example.OneToMany.onetomany.model.State;
import com.example.OneToMany.onetomany.repository.CityRepository;
import com.example.OneToMany.onetomany.repository.CountryRepository;
import com.example.OneToMany.onetomany.repository.StateRepository;
import com.example.OneToMany.onetomany.service.CountryService;

@Service
public class CountryServiceImple implements CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<Country> getAllCountries() {
        // TODO Auto-generated method stub
        return countryRepository.findAll();
    }

    @Override
    public Country getCountryById(Integer id) {
        return countryRepository.findById(id).orElse(null);
    }

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountry(Integer id) {
        countryRepository.deleteById(id);

    }

    @Override
    public void addStateToCountry(Integer countryId, List<State> states) {
        Country country = countryRepository.findById(countryId).orElse(null);
        if (country != null) {
            // states.setCountry(country);
            for (State state : states) {
                country.getStates().addAll(states);
                state.setCountry(country);
            }
            countryRepository.save(country);
            stateRepository.saveAll(states);
            // cityRepository.saveAll(cities);

        }

    }

}
