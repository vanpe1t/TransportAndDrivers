package com.example.transportanddrivers.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car extends Transport{

    @Override
    public void gas() {

    }

    @Override
    public void brake() {

    }
}