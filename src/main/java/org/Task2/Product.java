package org.Task2;

public class Product {

    private String title; // Название
    private int cost; // Стоимость продукта


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String infoProduct() {
        return title + "\t" + cost;
    }
}
