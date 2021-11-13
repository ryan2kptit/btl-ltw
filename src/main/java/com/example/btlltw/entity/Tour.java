package com.example.btlltw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "tour")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tour implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "priceOfTicket")
    private int priceOfTicket;

    @Column(name = "numberOfGuest")
    private int numberOfGuest;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name="route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name="mainDriver_id")
    private Driver mainDriver;

    @ManyToOne
    @JoinColumn(name="extraDriver_id")
    private Driver extraDriver;
}
