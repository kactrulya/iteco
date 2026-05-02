package org.example;

public class Animal {

    private String name;
    public String type;
    protected String gender;

    public Animal (String name, String type) {
        this.name = name;
        this.type = type;

    }

    public Animal(){

    }

    public void test(int count) {
        System.out.println("Звук" + " " + count);
    }

    public void test(String name) {
        System.out.println(name);

    }

    public void test() {
        System.out.println(name);

    }

    //Возвращает значение
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
