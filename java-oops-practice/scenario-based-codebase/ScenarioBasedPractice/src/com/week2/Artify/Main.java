/*
 *  "Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected.
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types
 */

package com.week2.Artify;

public class Main {
    public static void main(String[] args) {

        User user = new User("Priyanshu", 3000);

        Artwork a1 = new DigitalArt("Galaxy", "Arjun", 1200, "Personal Use");
        Artwork a2 = new PrintArt("Forest", "Lavanya", 800, "Print Only");

        if (a1.purchase(user)) {
            System.out.println("Purchased: " + a1.getTitle());
            System.out.println(a1.license());
        }

        if (a2.purchase(user)) {
            System.out.println("Purchased: " + a2.getTitle());
            System.out.println(a2.license());
        }

        System.out.println("Wallet Left: " + user.getWalletBalance());
    }
}
s