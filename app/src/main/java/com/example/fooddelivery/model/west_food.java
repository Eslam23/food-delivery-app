package com.example.fooddelivery.model;

public class west_food {
    String name,price,rate,res_name;
    Integer image;

    public west_food(String name, String price, String rate, String res_name, Integer image) {
        this.name = name;
        this.price = price;
        this.rate = rate;
        this.res_name = res_name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRes_name() {
        return res_name;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
