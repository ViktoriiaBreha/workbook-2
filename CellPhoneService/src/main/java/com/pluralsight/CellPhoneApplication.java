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

        CellPhone cell_Phone = new CellPhone(serial_number, model, carrier,phone_number, owner);

        System.out.println("Cell Phone information: ");
        System.out.println("Serial number: " + cell_Phone.getSerial_number());
        System.out.println("Model: " + cell_Phone.getModel() );
        System.out.println("Carrier: " + cell_Phone.getCarrier());
        System.out.println("Phone number: " + cell_Phone.getPhone_number());
        System.out.println("Owner: " + cell_Phone.getOwner());

    }
}
/*What is the serial number? 2597153
What model is the phone? iPhone 15 Pro Max
Who is the carrier? Verizon
What is the phone number? 888-555-1234
Who is the owner of the phone? Sandra*/