package ru.gb.servlets;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String title;
    private BigDecimal cost;


    public Product(){};

    public Product(Long id, String title, BigDecimal cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
