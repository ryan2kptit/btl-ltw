package com.example.btlltw.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "salary")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "salaryOfMainDriver")
    private int salaryOfMainDriver;

    @Column(name = "salaryOfExtraDriver")
    private int salaryOfExtraDriver;
}
