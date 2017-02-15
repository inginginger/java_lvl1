package ru.geekbrains.lesson06;
import ru.geekbrains.lesson06.Animal;

public class Dog extends Animal{

    public Dog (String name){
        super(name);
        maxRunLength = 500;
        maxSwimLength = 10;
        maxJumpHeight = 0.5f;
    }

}
