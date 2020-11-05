package com.company;

public class Dog extends Animal{

    public Dog(String name, String song, int age) {
        super(name, song, age);
    }

    @Override
    void feed(String food){
        if (food.equals("мясо"))
            this.pleasure += 20;
        else if (food.equals("рыба"))
            this.pleasure += 10;
        else if (food.equals("шоколад"))
            this.pleasure = 0;
    }
}
