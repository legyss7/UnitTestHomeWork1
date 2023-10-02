package org.Task2;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {

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



        /**
         * 1. Проверить, что магазин хранит верный список продуктов
         * (количество продуктов, состав корзины)
         */
        assertThat(shop.getProducts()).isEqualTo(products);

        /**
         * 2. Проверить, что магазин возвращает верный самый
         * дорого продукт getMostExpensiveProduct
         */
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(tomato);

        /**
         * 3. Проверить, что магазин возвращает верный
         * отсортированный по цене список продуктов
         */
        List<Product> productsPrice = new ArrayList<>();
        productsPrice.add(water);
        productsPrice.add(bread);
        productsPrice.add(apple);
        productsPrice.add(tomato);

        assertThat(shop.getSortedListProducts()).isEqualTo(productsPrice);
    }
}
