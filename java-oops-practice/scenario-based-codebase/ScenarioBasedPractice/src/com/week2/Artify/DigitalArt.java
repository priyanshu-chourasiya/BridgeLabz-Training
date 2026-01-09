package com.week2.Artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public String license() {
        return "Digital License Provided for: " + getTitle();
    }
}
