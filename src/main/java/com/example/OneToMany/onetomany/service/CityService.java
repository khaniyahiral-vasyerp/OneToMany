package com.example.OneToMany.onetomany.service;

import java.util.List;

import com.example.OneToMany.onetomany.model.City;

public interface CityService {
    List<City> getAllCities();

    City getCityById(Integer id);

    City saveCity(City city);

    void deleteCity(Integer id);

}
