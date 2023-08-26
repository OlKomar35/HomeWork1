package org.example;

public class Chocolate extends Product {

    private int kcal;
    private int weight;

    public Chocolate(String name, String brand, double price, int kcal, int weight) {
        super(name, brand, price);
        if (kcal < 1) {
            throw new RuntimeException("Не корректная колоритность шоколада");
        }
        if (weight < 20) {
            throw new RuntimeException("Не корректный вес шоколада");
        }
        this.kcal = kcal;
        this.weight = weight;
    }


    public int getKcal() {
        return kcal;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад: %s-%s; весом: %d г; ккал: %d; Стоимость: %.2f руб]", name, brand, weight, kcal, price);
    }
}
