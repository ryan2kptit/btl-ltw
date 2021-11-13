package com.example.btlltw.service;

import com.example.btlltw.entity.Driver;

public interface DriverService {
    Driver getDriverById(int id);

    Driver createDriver(Driver body);

    Driver updateDriverById(int id, Driver body);

    Boolean deleteDriverById(int id);
}
