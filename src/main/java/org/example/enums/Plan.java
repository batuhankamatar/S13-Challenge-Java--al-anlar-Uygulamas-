package org.example.enums;

public enum Plan {
    BASIC("BASIC", 1000),
    PREMIUM("PREMIUM", 2000),
    GOLD("GOLD", 3000),
    PLATINUM("PLATINUM", 4000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}