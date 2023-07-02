package com.example.transportanddrivers.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class Pickup extends Transport{

    public Pickup(String model) {
        super(model);
    }
    @Override
    public void gas() {
        System.out.println(this + " готова к работе!");
    }

    @Override
    public void brake() {

    }
}
