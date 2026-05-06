package org.example;

public class Client extends Person implements SeasonHandler{
    public Client(String name, int age, SeasonColor season) {
        super(name, age);    // вызываем конструктор родителя
        this.season = season; // сохраняем сезон
    }
    private SeasonColor season;

    public void test() {
        System.out.println(getName());
    }

    @Override
    public void printSeason() {
        System.out.println(
                " Сейчас : " + season +
                ". Цвет сезона: " + season.getColor());
    }
}
