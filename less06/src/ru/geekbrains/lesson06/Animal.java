package ru.geekbrains.lesson06;

/**
 * Created by CPU on 17.01.2017.
 */
public class Animal {

    protected final String name;
    protected float maxRunLength;
    protected float maxSwimLength;
    protected float maxJumpHeight;

    public Animal(String name){
        this.name = name;
    }

    public void run(float length){
        if(length <= maxRunLength)
            System.out.println(name + " пробежал " + length + " м");
        else
            System.out.println(name + " не смог пробежать " + length + " м");
    }

    public void jump(float height){
        if(height <= maxJumpHeight)
            System.out.println(name + " подпрыгнул на " + height + " м");
        else
            System.out.println(name + " не смог подпрыгнуть на " + height + " м");
    }

    public void swim(float length){
        if(length <= maxSwimLength)
            System.out.println(name + " проплыл " + length + " м");
        else
            System.out.println(name + " не смог проплыть " + length + "м");
    }
}
