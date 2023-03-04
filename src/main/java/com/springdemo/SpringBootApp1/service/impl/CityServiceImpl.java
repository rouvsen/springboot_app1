package com.springdemo.SpringBootApp1.service.impl;

import com.springdemo.SpringBootApp1.dao.inter.ICityDAO;
import com.springdemo.SpringBootApp1.entities.City;
import com.springdemo.SpringBootApp1.service.inter.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService {

    private ICityDAO cityDAO;

    public CityServiceImpl(@Autowired ICityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }

    @Override
    public City getById(int id){
        return this.cityDAO.getById(id);
    }

    @Override
    @Transactional
    public List<City> getAllCities() {
        return this.cityDAO.getAllCities();
    }

    @Override
    @Transactional
    public void addCity(City city) {
        this.cityDAO.addCity(city);
    }

    @Override
    @Transactional
    public void updateCity(City city) {
        this.cityDAO.updateCity(city);
    }

    @Override
    @Transactional
    public void deleteCity(City city) {
        this.cityDAO.deleteCity(city);
    }
}
