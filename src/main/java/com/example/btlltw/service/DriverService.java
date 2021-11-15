package com.example.btlltw.service;

import com.example.btlltw.dto.GetAllDriver;
import com.example.btlltw.entity.Driver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface DriverService {
    Driver getDriverById(int id);

    Driver createDriver(Driver body);

    Driver updateDriverById(int id, Driver body);

    Boolean deleteDriverById(int id);

    List<Driver> getAllDriver();
}
