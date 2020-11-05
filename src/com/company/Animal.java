package com.company;

public abstract class Animal {
    String
            name,
            song;
    int age;
    int pleasure;

    Animal(){
        name = "default";
        song = "default";
    }

    Animal(String name, String song, int age){
        this.name = name;
        this.song = song;
        this.age = age;
    }

    abstract void feed(String food);
}
