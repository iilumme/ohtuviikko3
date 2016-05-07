package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 * Created by iilumme.
 */
public class IO {

    private static final Scanner scanner = new Scanner(System.in);

    public IO() {
    }

    public void print(String print) {
        System.out.println(print);
    }

    public void printRules() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }

    public String nextLine() {
        return scanner.nextLine();
    }

    public void gameEndsRule() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
    }
}
