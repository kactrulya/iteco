package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        SeasonColor[] seasons = SeasonColor.values();   // Получаем массив всех сезонов
        Random random = new Random();
        SeasonColor randomSeason = seasons[random.nextInt(seasons.length)];

        Client client = new Client("Max", 2, randomSeason);
        client.printSeason();


        Employee employee = new Employee("Petr", 32);


        employee.printInfo();


        
    }
}