package org.example;

public class Cat extends Animal{

    public Cat() {
        this.gender = "девочка";

    }
    @Override
    public void test(int count) {
        //позволяет присвоить переменной имя, которая имеет поле protected
        setName("Мурка");
        //getName позволяет обратиться к этой переменной
        System.out.println(getName() + " Сказала Мяу " + count + " раза" + " Это " + gender);
    }


    public void test() {

        // если переменная уже была присвоенна через setName к ней можно обратиться повторно
        System.out.println(getName() + " Это " + gender);
    }
}
