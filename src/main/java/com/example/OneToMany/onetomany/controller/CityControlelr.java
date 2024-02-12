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

import com.example.OneToMany.onetomany.model.City;
import com.example.OneToMany.onetomany.service.CityService;

@RestController
@RequestMapping("/cities")
public class CityControlelr {
    @Autowired
    private CityService cityService;

    @GetMapping("/getall")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable Integer id) {
        return cityService.getCityById(id);
    }

    @PostMapping
    public City saveCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Integer id) {
        cityService.deleteCity(id);
    }

}
