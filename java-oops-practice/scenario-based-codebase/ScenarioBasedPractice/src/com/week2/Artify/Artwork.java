package com.week2.Artify;

public class Artwork implements IPurchasable {

    private String title;
    private String artist;
    private double price;
    protected String licenseType; 

    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    @Override
    public boolean purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price);
            return true;
        }
        return false;
    }

    @Override
    public String license() {
        return "Default License: " + licenseType;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getPrice() { return price; }
}
