package com.ani.orm.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id")
    private Long carId;

    @Column(name = "make", nullable = false)
    private String make;

    @Column(name = "model", unique = true, nullable = false)
    private String model;

    @Column(name = "mfg")
    private Date mfg;

    @Column(name = "cost")
    private Double cost;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getMfg() {
        return mfg;
    }

    public void setMfg(Date mfg) {
        this.mfg = mfg;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
