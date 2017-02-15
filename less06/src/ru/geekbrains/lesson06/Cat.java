package ru.geekbrains.lesson06;

import ru.geekbrains.lesson06.Animal;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
        maxRunLength = 200;
        maxJumpHeight = 2;
    }

    @Override
    public void swim(float length){
        System.out.println(name + " не умеет плавать");
    }
}
