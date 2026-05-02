package org.example;

public class Dog extends Animal {

    public Dog() {

        this.gender = "мальчик";
    }
    @Override
    public void test(int count) {
        //позволяет присвоить переменной имя, которая имеет поле protected
        setName("Бобик");
        //getName позволяет обратиться к этой переменной
        System.out.println(getName() + " Сказала Мяу " + count + " раза" + " Это " + gender);
    }

    public void test() {
        System.out.println(" Это " + gender);
    }

}
