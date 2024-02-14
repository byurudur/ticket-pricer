import java.util.Scanner;

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
        int age, roundTrip, discount, distanceKm;
        double price, newPrice1, newPrice2;
        double centsPerKm = 1.1;

        // Collecting inputs from the user.
        System.out.println("Please enter your age. ");
        age = input.nextInt();
        if (age < 12) {
            System.out.println("You have 50% discount!");
        } else if (age >= 12 && age < 24) {
            System.out.println("You have 10% discount!");
        } else if (age >= 65) {
            System.out.println("You have 30% discount!");
        } else {
            System.out.println("You have no discount unless it is a round-trip. ");
        }
        System.out.println("Please enter the distance. ");
        distanceKm = input.nextInt();
        System.out.println("Please specify if you want 1 or 2 tickets.");
        System.out.println("Enter 1 or 2");
        roundTrip = input.nextInt();
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

        price = (distanceKm * centsPerKm);

        if (age < 12) {
            newPrice1 = (price - (price * (50/100)));
            if (roundTrip == 2) {
                newPrice2 = (price - (price * (70/100)));
                System.out.println("Ticket price: " + newPrice2 + "$");
            } else {
                System.out.println("Ticket price: " + newPrice1 + "$");
            }
        } else if (age >= 12 && age < 24) {
            newPrice1 = (price - (price * (10/100)));
            if (roundTrip == 2) {
                newPrice2 = (price - (price * (30/100)));
                System.out.println("Ticket price: " + newPrice2 + "$");
            } else {
                System.out.println("Ticket price: " + newPrice1 + "$");
            }
        } else if (age >= 65) {
            newPrice1 = (price - (price * (30/100)));
            if (roundTrip == 2) {
                newPrice2 = (price - (price * (50/100)));
                System.out.println("Ticket price: " + newPrice2 + "$");
            } else {
                System.out.println("Ticket price: " + newPrice1 + "$");
            }
        }else {
            if (roundTrip == 1){
                System.out.println("Ticket price: " + price + "$");
            }else {
                newPrice1 = (price - (price * 20/100));
                System.out.println("Ticket price " + newPrice1 + "$");
            }
        }
    }
}
