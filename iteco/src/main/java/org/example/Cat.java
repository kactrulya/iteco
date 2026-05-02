package org.example;

public class Cat extends Animal{

    public Cat() {
        this.gender = "девочка";

    }
    @Override
    public void test(int count) {
        setName("Мурка");
        System.out.println(getName() + " Сказала Мяу " + count + " раза" + " Это " + gender);
    }


    public void test() {

        System.out.println(getName() + " Это " + gender);
    }
}
