/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * 2024
 */



import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /** Determining the ticket price according to
         * 0.10$/km
         * 50% discount to 0-12 year olds
         * 10% discount to 12-24 year olds
         * 30% discount to 65+ year olds
         * 20% discount to round-trip tickets.
         */

        // Scanner class is imported.
        Scanner input = new Scanner(System.in);

        // Determining the variables.
        int age, roundTrip, discount, distanceKm, ageGap;
        double price, price1, newPrice1,newPrice1_1, newPrice2, newPrice2_2, newPrice3, newPrice3_3 ;
        double centsPerKm = 1.1;
        ageGap = 0;

        // Collecting inputs from the user.
        System.out.println("Please enter your age. ");

        age = input.nextInt();

        /**
        switch (age){
            case 1:
                if (age <0){
                    System.out.println("Age can not be negative. ");
                }
            case 2:
                if (age > 0 && age < 12) {
                    System.out.println("You have 50% discount!");
                }
            case 3:
                if (age >= 12 && age < 24) {
                    System.out.println("You have 10% discount!");
                }
            case 4:
                if (age >= 65) {
                    System.out.println("You have 30% discount!");
                }
            case 5:
                if (age >= 24 && age < 65){
                    System.out.println("You have no discount unless it is a round-trip. ");
                }
        } */


        if (age > 0 && age < 12) {
            System.out.println("You have 50% discount!");
        } else if (age >= 12 && age < 24) {
            System.out.println("You have 10% discount!");
        } else if (age >= 65) {
            System.out.println("You have 30% discount!");
        } else if (age < ageGap){
            System.out.println("Age can not be negative. ");
            return;
        }else  {
            System.out.println("You have no discount unless it is a round-trip. ");
        }


        System.out.println("Please enter the distance. ");
        distanceKm = input.nextInt();
        if (distanceKm < ageGap){
            System.out.println("Distance can not be negative ");
            return;
        }
        System.out.println("Please specify if you want 1 or 2 tickets.");
        System.out.println("Enter 1 or 2");
        roundTrip = input.nextInt();

        // Switch-Case to output the discount.
        switch (roundTrip) {
            case 1:
                roundTrip = 1;
                System.out.println("No discount to 1 ticket. Continue progress.");
                break;
            case 2:
                roundTrip = 2;
                System.out.println("You have won an extra 20% discount!");
            case 3:
                if (roundTrip != 1 && roundTrip != 2) {
                    System.out.println("We only can sell maximum of 2 tickets.");
                    break;
                }
        }

        // Naming variables and mathematical equations to determine discounts.
        price = (distanceKm * centsPerKm);
        price1 = price - ( price * 20/100);
        newPrice1 = price - (price * 50/100);
        newPrice1_1  = price - (price * 70/100);
        newPrice2 = price - (price * 10/100);
        newPrice2_2 = price - (price * 30/100);
        newPrice3 = price - (price * 30/100);
        newPrice3_3 = price - (price * 50/100);

        // Outputting the discounted ticket price.
        if (age < 12 && roundTrip == 1){
            System.out.println("Ticket price: " + newPrice1 + "$");
        } else if (age < 12 && roundTrip ==2) {
            System.out.println("Ticket price: " + newPrice1_1 + "$");
        } else if (age >= 12 && age <24 && roundTrip ==1 ) {
            System.out.println("Ticket price: " + newPrice2 + "$");
        } else if (age >= 12 && age <24 && roundTrip ==2) {
            System.out.println("Ticket price: " + newPrice2_2 + "$");
        } else if (age >= 24 && age < 65 && roundTrip == 1) {
            System.out.println("Ticket price: " + price + "$");
        } else if (age >= 24 && age < 65 && roundTrip == 2) {
            System.out.println("Ticket price: " + price1 + "$");
        } else if (age >= 65 && roundTrip ==1) {
            System.out.println("Ticket price: " + newPrice3 + "$");
        } else if (age >= 65 && roundTrip ==1) {
            System.out.println("Ticket price: " + newPrice3_3 + "$");
        }else {
            System.out.println("Something went wrong. Please start over.n/");
        }
    }
}
