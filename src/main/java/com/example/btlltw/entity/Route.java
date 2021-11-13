package com.example.btlltw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "route")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "startingPoint")
    private String startingPoint;

    @Column(name = "endingPoint")
    private String endingPoint;

    @Column(name = "length")
    private int length;

    @Column(name = "complexity")
    private int complexity;
}
