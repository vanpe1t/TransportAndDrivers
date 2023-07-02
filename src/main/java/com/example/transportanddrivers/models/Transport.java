package com.example.transportanddrivers.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public abstract class Transport {

    private int weight;
    private int maxSpeed;
    private String color;
    private String model;


    public Transport(String model) {
        this.model = model;
    }

    public abstract void gas();

    public abstract void brake();

    @Override
    public String toString() {
        return "Transport{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
