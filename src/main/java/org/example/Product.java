package org.example;

/**
 * Товар
 */
public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public Product(String name, String brand, double price) {
        if (price < 100) {
            throw new RuntimeException("Не корректная цена товара");
        }
        checkName(name);
        checkBrand(brand);
        this.price = price;
    }

    public Product(String name) {
        this(name, "NoName", 100);
    }

    public Product() {
        this("NoName", "NoName", 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 100) {
            throw new RuntimeException("Не корректная цена товара");
        }
        this.price = price;
    }


    private void checkName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "Noname";
        } else {
            this.name = name;
        }
    }

    private void checkBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "Noname";
        } else {
            this.brand = brand;
        }
    }

    public String displayInfo() {
        return String.format("%s-%s-%2.f", name, brand, price);
    }
}
