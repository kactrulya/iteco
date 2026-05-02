package org.example;

public class Dog extends Animal {

    public Dog() {

        this.gender = "мальчик";
    }
    @Override
    public void test(int count) {
        setName("Бобик");
        System.out.println(getName() + " Сказала Мяу " + count + " раза" + " Это " + gender);
    }

    public void test() {
        System.out.println(" Это " + gender);
    }

}
