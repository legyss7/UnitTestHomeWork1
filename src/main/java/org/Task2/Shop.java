package org.Task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {

    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по цене список продуктов
     */
    public List<Product> getSortedListProducts() {
        if (products == null) {
            return null;
        }
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCost() - o2.getCost();
            }
        });
        return products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        if(products == null) {
            return null;
        }
        int cost = 0;
        Product mostExpensiveProduct = null;
        for (Product product : products) {
            if (product.getCost() > cost) {
                cost = product.getCost();
                mostExpensiveProduct = product;
            }
        }
        return mostExpensiveProduct;
    }

    public String infoProductList() {
        if (products == null) {
            return "";
        }
            String str = "";
        for (Product product : products) {
            str += product.infoProduct() + "\n";
        }
        return str;
    }
}
