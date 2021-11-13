package com.example.btlltw.service;

import com.example.btlltw.dto.CreateTourDto;
import com.example.btlltw.entity.Tour;

public interface TourService {
    Tour createTour(CreateTourDto tour);

    Tour getTourById(int id);

    Tour updateTourById(int id, Tour tour);

    Boolean deleteTourById(int id);
}
