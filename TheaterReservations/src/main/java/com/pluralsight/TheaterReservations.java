package com.pluralsight;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter all information below to reserve tickets");
        System.out.print("Please enter your first and last name: ");
        String full_name = scanner.nextLine().trim();
        String[] parts_name = full_name.split(" ");
        String first_name = parts_name[0];
        String last_name = parts_name[1];

        System.out.print("What date will you be coming (M/dd/yyyy): ");
        String data = scanner.nextLine().trim();
        DateTimeFormatter data_formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate day_x = LocalDate.parse(data, data_formatter);

        System.out.print("How many tickets would you like? ");
        int tickets_number = scanner.nextInt();

        String ticket_tickets = tickets_number == 1 ? "ticket" : "tickets";

        System.out.println(tickets_number + " " + ticket_tickets + " reserved for " + day_x + " under " + last_name + ", " + first_name);



    }
}
