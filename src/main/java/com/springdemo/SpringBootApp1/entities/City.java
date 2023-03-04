package com.springdemo.SpringBootApp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name="city")
public class City {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    @Column(name="country_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryCode;

    @Column(name="population")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int population;

    @Column(name="district")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String district;

    public City() {
    }

    public City(int id, String name, int countryCode, int population, String district) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.population = population;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "City{id=%d, name='%s', countryCode=%d, population=%d, district='%s'}"
                .formatted(id, name, countryCode, population, district);
    }
}
