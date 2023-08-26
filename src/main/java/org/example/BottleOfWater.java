package org.example;

public class BottleOfWater extends Product{
    private double volume;

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        if (volume<0.25){
            throw new RuntimeException("Не корректный объем бутылки");
        }
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Вода: %s-%s ; объем: %.1f л" +
                "; Стоимость: %.2f руб]", name,brand,volume,price);
    }
}
