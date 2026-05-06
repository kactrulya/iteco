package org.example;

public class Employee extends Person implements Printable {

    public Employee(String name, int age) {
        super(name,age);
    }



    @Override
    public void printInfo() {
        System.out.println(getName() + " " + getAge());
    }


}
