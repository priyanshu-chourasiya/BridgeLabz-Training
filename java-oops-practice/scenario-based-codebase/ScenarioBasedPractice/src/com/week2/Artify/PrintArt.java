package com.week2.Artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public String license() {
        return "Print License Provided for: " + getTitle();
    }
}
