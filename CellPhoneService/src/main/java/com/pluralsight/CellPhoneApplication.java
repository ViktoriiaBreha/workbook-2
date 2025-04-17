package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        int serial_number = scanner.nextInt();

        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phone_number = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        System.out.print("What is the serial number? ");
        int serial_number2 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model2 = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier2 = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phone_number2 = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner2 = scanner.nextLine();

        CellPhone cell_Phone = new CellPhone(serial_number, model, carrier, phone_number, owner);
        CellPhone cell_Phone_2 = new CellPhone(serial_number2, model2, carrier2, phone_number2, owner2);

        display(cell_Phone);
        display(cell_Phone_2);

        cell_Phone.dial(cell_Phone_2.getPhone_number());
        cell_Phone_2.dial(cell_Phone.getPhone_number());
    }

    public static void display(CellPhone phone) {

        System.out.println("Cell Phone information: ");
        System.out.println("Serial number: " + phone.getSerial_number());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhone_number());
        System.out.println("Owner: " + phone.getOwner());

    }
}

/*What is the serial number? 2597153
What model is the phone? iPhone 15 Pro Max
Who is the carrier? Verizon
What is the phone number? 888-555-1234
Whois the owner of the phone? Sandra*/