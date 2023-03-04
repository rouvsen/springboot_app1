package com.springdemo.SpringBootApp1.dao.inter;

import com.springdemo.SpringBootApp1.entities.City;

import java.util.List;

public interface ICityDAO {

    City getById(int id);
    List<City> getAllCities();
    void addCity(City city);
    void updateCity(City city);
    void deleteCity(City city);
}
