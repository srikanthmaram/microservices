package com.sri.Order.Service;


public class Product {
    int id;
    String product_name;
    int product_price;
    String product_category;
    String product_size;

    public Product(int id, String product_name, int product_price, String product_category, String product_size) {
        this.id = id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_category = product_category;
        this.product_size = product_size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }
}

