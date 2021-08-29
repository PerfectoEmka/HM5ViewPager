package com.example.hm5viewpager.ui.fragments.exchangefragment;

public class ExchangeModel {

    private int image;
    private double price;
    private String coin;

    public ExchangeModel(int image, double price, String coin) {
        this.image = image;
        this.price = price;
        this.coin = coin;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }
}
