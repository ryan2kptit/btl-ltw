package com.example.btlltw.service.impl;

import com.example.btlltw.dto.CreateCarDto;
import com.example.btlltw.entity.Car;
import com.example.btlltw.exception.NotFoundException;
import com.example.btlltw.mapper.CarMapper;
import com.example.btlltw.repository.CarRepository;
import com.example.btlltw.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    public Car getCarById(int id){
        return carRepository.getCarById(id);
    }

    public Car createCar(Car body) {
//        Car car = CarMapper.convertToEntity(body);
//        System.out.println(car + "dgggggggggggggggggggggg");
        Car createdCar = carRepository.save(body);
        System.out.println(createdCar);
        return createdCar;
    }

    public Car updateCarById(int id, Car body) {
        Car exitCar = carRepository.getCarById(id);
        if(exitCar == null) throw new NotFoundException();
        exitCar.setBrand(body.getBrand());
        exitCar.setColor(body.getColor());
        exitCar.setModel(body.getModel());
        exitCar.setAmountOfSeat(body.getAmountOfSeat());
        exitCar.setLicensePlate(body.getLicensePlate());
        exitCar.setVersion(body.getVersion());
        Car updatedCar = carRepository.save(exitCar);
        return updatedCar;
    }

    public Boolean deleteCarById(int id) {
        Car exitCar = carRepository.getCarById(id);
        if(exitCar == null) throw new NotFoundException();
        carRepository.delete(exitCar);
        return true;
    }

    public List<Car> getAllCar() {
        return carRepository.findAll();
    }
}
