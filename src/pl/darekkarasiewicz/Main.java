package pl.darekkarasiewicz;

import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean shouldContinue = true;
        Party party = new Party();

        while (shouldContinue){
        System.out.println("---------------------------------");
        System.out.println("1.Wyświetl gości ");
        System.out.println("2.dodaj goscia ");
        System.out.println("3.wyswietl potrawy ");
        System.out.println("4.Znajdz po nr tel ");
        System.out.println("5.Wyjscie");
        System.out.println("_________________________________");
        System.out.print("Wybierz opcje :");
        int userChoice = scanner.nextInt();

        switch (userChoice){
            case 1 -> party.displayGuests();
            case 2 -> party.addGuest();
            case 3 -> party.displayMeals();
            case 4 -> party.displayGuestByPhoneNumber();
            case 5 -> shouldContinue=false;
        }

    }
    }
    }