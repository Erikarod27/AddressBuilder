package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder billing = new StringBuilder();
        StringBuilder shipping = new StringBuilder();
        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        //Billing information
        System.out.print("Billing Street: ");
        billing.append(scanner.nextLine()).append("\n");
        System.out.print("Billing City: ");
        billing.append(scanner.nextLine()).append(", ");
        System.out.print("Billing State: ");
        billing.append(scanner.nextLine()).append(" ");
        System.out.print("Billing Zip: ");
        billing.append(scanner.nextLine());

        //Shipping information
        System.out.print("Shipping Street: ");
        shipping.append(scanner.nextLine()).append("\n");
        System.out.print("Shipping City: ");
        shipping.append(scanner.nextLine()).append(", ");
        System.out.print("Shipping State: ");
        shipping.append(scanner.nextLine()).append(" ");
        System.out.print("Shipping Zip: ");
        shipping.append(scanner.nextLine());


        System.out.println("\n" + fullName + "\n");
        System.out.println("Billing Address: \n" + billing + "\n");
        System.out.println("Shipping Address: \n" + shipping);
    }
}
