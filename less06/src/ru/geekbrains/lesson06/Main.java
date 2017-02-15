package ru.geekbrains.lesson06;

public class Main {
    private static final int ANIM_SIZE = 2;
    public static void main(String[] args) {
        Animal [] animals = new Animal[ANIM_SIZE];
        animals[0] = new Cat("Умка");
        animals[1] = new Dog("Арчи");

        final float RUN_DIST = 450f;
        final float SWIM_DIST = 16f;
        final float JUMP_HEIGHT = 1.5f;

        for (int i = 0; i < animals.length; i++){
            Animal animal = animals[i];
            animal.jump(JUMP_HEIGHT);
            animal.swim(SWIM_DIST);
            animal.run(RUN_DIST);

        }

    }
}
