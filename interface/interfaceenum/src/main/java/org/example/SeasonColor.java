package org.example;

public enum SeasonColor {
    WINTER("белый"),
    SPRING("зеленый"),
    SUMMER("желтый"),
    AUTUMN("оранжевый");

    private String color;

    SeasonColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
