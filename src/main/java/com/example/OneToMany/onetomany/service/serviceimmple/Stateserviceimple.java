package com.example.OneToMany.onetomany.service.serviceimmple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OneToMany.onetomany.model.City;
import com.example.OneToMany.onetomany.model.State;
import com.example.OneToMany.onetomany.repository.CityRepository;
import com.example.OneToMany.onetomany.repository.StateRepository;
import com.example.OneToMany.onetomany.service.StateService;

@Service
public class Stateserviceimple implements StateService {
    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<State> getAllStates() {
        return stateRepository.findAll();
    }

    @Override
    public State getStateById(Integer id) {
        return stateRepository.findById(id).orElse(null);
    }

    @Override
    public State saveState(State state) {
        return stateRepository.save(state);
    }

    @Override
    public State updateState(State state) {
        return stateRepository.saveAndFlush(state);
    }

    @Override
    public void deleteState(Integer id) {
        stateRepository.deleteById(id);
    }

    @Override
    public void addCitiesToState(Integer stateId, List<City> cities) {
        State state = stateRepository.findById(stateId).orElse(null);
        if (state != null) {
            for (City city : cities) {
                state.getCities().addAll(cities);
                city.setState(state);
            }
            stateRepository.save(state);
            cityRepository.saveAll(cities);

            /*
             * cities.setState(state);
             * state.getCity().add(cities);
             * stateRepository.save(state);
             */

        }

    }
}
