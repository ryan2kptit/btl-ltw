package com.example.btlltw.service.impl;

import com.example.btlltw.dto.GetAllDriver;
import com.example.btlltw.entity.Driver;
import com.example.btlltw.exception.NotFoundException;
import com.example.btlltw.repository.DriverRepository;
import com.example.btlltw.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepository driverRepository;

    public Driver createDriver(Driver driver) {
        System.out.println(driver);
        Driver createdDriver = driverRepository.save(driver);
        System.out.println(createdDriver);
        return createdDriver;
    }

    public Driver getDriverById(int id){
        return driverRepository.getById(id);
    }

    public Driver updateDriverById(int id, Driver driver) {
        Driver exitDriver = driverRepository.getById(id);
        if(exitDriver == null) throw new NotFoundException();
        exitDriver.setAddress(driver.getAddress());
        exitDriver.setCmt(driver.getCmt());
        exitDriver.setLicense(driver.getLicense());
        exitDriver.setName(driver.getName());
        exitDriver.setSeniority(driver.getSeniority());
        exitDriver.setTypeOfLicense(driver.getTypeOfLicense());
        exitDriver.setBirth(driver.getBirth());
        Driver updateDriver = driverRepository.save(driver);
        return updateDriver;
    }

    public Boolean deleteDriverById(int id) {
        Driver exitDriver = driverRepository.getById(id);
        if(exitDriver == null) throw new NotFoundException();
        driverRepository.deleteById(id);
        return true;
    }

    public  List<Driver> getAllDriver() {
        System.out.println("Heloooooooooooooo");
        List<Driver> drivers = driverRepository.getAllDriver();
        System.out.println(drivers);
        return drivers;
    }
}
