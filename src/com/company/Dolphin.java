package com.company;

public class Dolphin extends Animal {

    public Dolphin(String name, String song, int age) {
        super(name, song, age);
    }

    @Override
    void feed(String food){
        if (food.equals("мясо"))
            this.pleasure += 5;
        else if (food.equals("рыба"))
            this.pleasure += 20;
        else if (food.equals("шоколад"))
            this.pleasure = 15;
    }
}
