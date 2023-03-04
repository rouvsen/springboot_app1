package com.springdemo.SpringBootApp1.dao.impl;

import com.springdemo.SpringBootApp1.dao.inter.ICityDAO;
import com.springdemo.SpringBootApp1.entities.City;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDaoImpl implements ICityDAO {

    private EntityManager em;

    public CityDaoImpl(@Autowired EntityManager em){
        this.em = em;
    }

    @Override
    public City getById(int id) {
        Session currentSession = em.unwrap(Session.class);
        return currentSession.get(City.class, id);
    }

    @Override
    public List<City> getAllCities() {
        Session currentSession = em.unwrap(Session.class);
        Query<City> query = currentSession.createQuery("from City", City.class);
        return query.getResultList();
    }

    @Override
    public void addCity(City city) {
        Session currentSession = em.unwrap(Session.class);
        currentSession.save(city);//also, you can use saveOrUpdate() but be carefully
    }

    @Override
    public void updateCity(City city) {
        Session currentSession = em.unwrap(Session.class);
        currentSession.update(city);//also, you can use saveOrUpdate() but be carefully
    }

    @Override
    public void deleteCity(City city) {
        Session currentSession = em.unwrap(Session.class);
        City cityToDelete = currentSession.get(City.class, city.getId());
        currentSession.delete(cityToDelete);
    }
}
