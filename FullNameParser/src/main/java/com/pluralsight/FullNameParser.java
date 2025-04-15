package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        String [] parts = name.split(" ");

        String first_name = " ";
        String middle_name = "(none)";
        String last_name = " ";

        if (parts.length == 2){
            first_name = parts[0];
            last_name = parts [1];
        } else if (parts.length ==3) {
            first_name = parts [0];
            middle_name = parts [1];
            last_name = parts[2];
        } else {
            System.out.println(" Error. Please enter you first and last name, or your first,middle and last name.");

        }
        System.out.println("First name: " + first_name);
        System.out.println("Middle name: " + middle_name);
        System.out.println("Last name: " + last_name);


    }
}
