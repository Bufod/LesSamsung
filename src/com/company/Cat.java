package com.company;

public class Cat extends Animal {

    Cat(String name, String song, int age){
        super(name, song, age);
    }

    @Override
    void feed(String food){
        if (food.equals("мясо"))
            this.pleasure += 15;
        else if (food.equals("рыба"))
            this.pleasure += 20;
        else if (food.equals("шоколад"))
            this.pleasure = 0;
    }

    void a(){

    }
}
