package com.springdemo.SpringBootApp1.restapi;

import com.springdemo.SpringBootApp1.entities.City;
import com.springdemo.SpringBootApp1.service.inter.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {

    private ICityService cityService;

    public CityController(@Autowired ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities/{id}")
    public City getCity(@PathVariable int id){
        return this.cityService.getById(id);
    }

    @GetMapping("/cities")
    public List<City> getCities(){
        return this.cityService.getAllCities();
    }

    @PostMapping("/add")
    public void add(@RequestBody City city){
        this.cityService.addCity(city);
    }

    @PostMapping("/update")
    public void update(@RequestBody City city){
        this.cityService.updateCity(city);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        this.cityService.deleteCity(city);
    }

}
