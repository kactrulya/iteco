package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Васька", "Пес");

        animal.test("животное");

        animal.test();

        Cat cat = new Cat();
        cat.test(3);
        cat.test();


        Dog dog = new Dog();
        dog.test(5);
        dog.test();



    }
}