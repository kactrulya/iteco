package org.example;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + age);
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

}
