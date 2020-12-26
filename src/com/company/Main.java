package com.company;

public class Main {

    public static void main(String[] args) {
        cake firstCake = (new cake.cakeBuilder(3,2,0.5))
                .setEggsWeight(0.1)
                .isVegan(true)
                .setSugarWeight(0.23)
                .isdiabetes(true)
                .build();
    }
}
