package com.pluralsight;
import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name");

        System.out.print("Enter your first name: ");
        String first_name = scanner.nextLine().trim();


        System.out.print("Enter your middle name: ");
        String middle_name = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String last_name = scanner.nextLine().trim();

        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine().trim();

        String full_name;

        if (middle_name.isEmpty() && suffix.isEmpty()) {
            full_name = first_name + " " + last_name;
        } else if (middle_name.isEmpty()) {
            full_name = first_name + " " + last_name + "," + suffix;
        } else if (suffix.isEmpty()) {
            full_name = first_name + " " + middle_name + " " + last_name + " ";
        } else {
            full_name = first_name + " " + middle_name + " " + last_name + "," + " " + suffix;
        }

        System.out.println("Full name: " + full_name);

    }
}