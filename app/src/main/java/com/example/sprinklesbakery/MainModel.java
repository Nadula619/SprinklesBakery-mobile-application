package com.example.sprinklesbakery;

public class MainModel {
    String Name, Categories, Price, ccurl;

    MainModel(){

    }

    public MainModel(String name, String categories, String price, String ccurl) {
        this.Name = name;
        this.Categories = categories;
        this.Price = price;
        this.ccurl = ccurl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategories() {
        return Categories;
    }

    public void setCategories(String categories) {
        Categories = categories;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getCcurl() {
        return ccurl;
    }

    public void setCcurl(String ccurl) {
        this.ccurl = ccurl;
    }
}
