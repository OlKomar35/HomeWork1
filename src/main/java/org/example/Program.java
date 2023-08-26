package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Автор: Комар Ольга
 * Группа: GeekBrains - 4716 (будни утро)
 */

public class Program {
    public static void main(String[] args) {
        Product bottleOfWater1 = new BottleOfWater("water", "aura", 550, 1.5);
        System.out.println(bottleOfWater1.displayInfo());
        Product bottleOfWater2 = new BottleOfWater("water", "neptun", 350, 1);
        System.out.println(bottleOfWater2.displayInfo());
        Product bottleOfWater3 = new BottleOfWater("water", "Источник", 500, 1.5);
        System.out.println(bottleOfWater3.displayInfo());
        Product bottleOfWater4 = new BottleOfWater("water", "aura", 300, 1);
        System.out.println(bottleOfWater4.displayInfo());


        Product chocolate1 = new Chocolate("mars", "mars", 700, 250, 50);
        System.out.println(chocolate1.displayInfo());
        Product chocolate2 = new Chocolate("snickers", "mars", 750, 350, 50);
        System.out.println(chocolate2.displayInfo());
        Product chocolate3 = new Chocolate("twix", "mars", 680, 280, 50);
        System.out.println(chocolate3.displayInfo());
        Product chocolate4 = new Chocolate("dove", "mars", 1500, 470, 100);
        System.out.println(chocolate4.displayInfo());
        Product chocolate5 = new Chocolate("snickers", "mars", 1430, 250, 90);
        System.out.println(chocolate5.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);

        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);
        products.add(chocolate5);

        VendingMachine vm = new VendingMachine(products);

        BottleOfWater bottleOfWater = vm.getBottleOfWater("water", 1);
        if (bottleOfWater != null) {
            System.out.println("Вы получили: ");
            System.out.println(bottleOfWater.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой нет в автомате");
        }


        Chocolate chocolate = vm.getChocolate("twix", 50);
        if (chocolate != null) {
            System.out.println("Вы получили: ");
            System.out.println(chocolate.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой нет в автомате");
        }

    }
}