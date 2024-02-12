package com.example.OneToMany.onetomany.service.serviceimmple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.example.OneToMany.onetomany.model.City;
import com.example.OneToMany.onetomany.repository.CityRepository;
import com.example.OneToMany.onetomany.service.CityService;

@Service
public class CityServiceImple implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();

    }

    @Override
    public City getCityById(Integer id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteCity(Integer id) {
        cityRepository.deleteById(id);
    }

}
