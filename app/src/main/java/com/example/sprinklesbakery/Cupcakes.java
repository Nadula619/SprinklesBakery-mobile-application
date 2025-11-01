package com.example.sprinklesbakery;

public class Cupcakes {

    String Name, Categories, Price, ccurl;

    public Cupcakes(String name, String categories, String price, String ccurl) {
        this.Name = name;
        this.Categories = categories;
        this.Price = price;
        this.ccurl = ccurl;
    }

    public String getName() {
        return Name;
    }

    public String getCategories() {
        return Categories;
    }

    public String getPrice() {
        return Price;
    }

    public String getCcurl() {
        return ccurl;
    }
}
