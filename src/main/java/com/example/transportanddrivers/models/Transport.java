package com.example.transportanddrivers.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Transport {

    private int weight;
    private int maxSpeed;
    private String color;


    public abstract void gas();

    public abstract void brake();

}
