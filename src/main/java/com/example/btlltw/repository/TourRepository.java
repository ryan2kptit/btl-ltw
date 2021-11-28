package com.example.btlltw.repository;

import com.example.btlltw.entity.Car;
import com.example.btlltw.entity.Route;
import com.example.btlltw.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> {

    void deleteAllByCar(Car car);

    void deleteAllByRoute(Route route);
}
