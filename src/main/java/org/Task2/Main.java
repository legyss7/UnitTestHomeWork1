package org.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Мы хотим улучшить функциональность нашего интернет-магазина.
 * Ваша задача - добавить два новых метода в класс Shop:
 * ● Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
 * ● Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
 * Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
 * (правильное количество продуктов, верное содержимое корзины).
 * Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
 * Напишите тесты для проверки корректности работы метода sortProductsByPrice
 * (проверьте правильность сортировки).
 * Используйте класс Product для создания экземпляров продуктов и класс Shop
 * для написания методов сортировки и тестов.
 */
public class Main {
    public static void main(String[] args) {

        Product tomato = new Product();
        tomato.setTitle("tomato");
        tomato.setCost(20);

        Product bread = new Product();
        bread.setTitle("bread");
        bread.setCost(10);

        Product water = new Product();
        water.setTitle("water");
        water.setCost(5);

        Product apple = new Product();
        apple.setTitle("apple");
        apple.setCost(15);

        List<Product> products = new ArrayList<>();
        products.add(tomato);
        products.add(bread);
        products.add(water);
        products.add(apple);


        Shop shop = new Shop();
        shop.setProducts(products);

        System.out.println("Список продуктов");
        System.out.println(shop.infoProductList());

        System.out.println("Самый дорогой продукт в магазине");
        System.out.println(shop.getMostExpensiveProduct().infoProduct());

        System.out.println("Отсортированнный список товаров по цене");
        shop.getSortedListProducts();
        System.out.println(shop.infoProductList());

    }
}
