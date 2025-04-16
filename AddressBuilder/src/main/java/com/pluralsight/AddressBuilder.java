package com.pluralsight;
import java.util.Scanner;


public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        String full_name = scanner.nextLine().trim();
        System.out.print("Billing Street: ");
        String billing_street = scanner.nextLine().trim();
        System.out.print("Billing City: ");
        String billing_city = scanner.nextLine().trim();
        System.out.print("Billing State: ");
        String billing_state = scanner.nextLine().trim();
        System.out.print("Billing Zip: ");
        int billing_zip = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Shipping Street: ");
        String shipping_street = scanner.nextLine().trim();
        System.out.print("Shipping City: ");
        String shipping_city = scanner.nextLine().trim();
        System.out.print("Shipping State: ");
        String shipping_state = scanner.nextLine().trim();
        System.out.print("Shipping Zip: ");
        int shipping_zip = scanner.nextInt();
        scanner.nextLine();

        StringBuilder billing_address = new StringBuilder();
        billing_address.append(billing_street).append("\n");
        billing_address.append(billing_city).append(",");
        billing_address.append(billing_state).append(" ");
        billing_address.append(billing_zip);

        StringBuilder shipping_address = new StringBuilder();
        shipping_address.append(shipping_street).append("\n");
        shipping_address.append(shipping_city).append(",");
        shipping_address.append(shipping_state).append(" ");
        shipping_address.append(shipping_zip);


     System.out.println(full_name);
     System.out.println("Billing Address: \n" + billing_address);
     System.out.println("Shipping Address: \n" + shipping_address);




    }
}
/*Please provide the following information:
Full name: Grover Smith
Billing Street: 123 Main Street
Billing City: Middleton
Billing State: TX
Billing Zip: 75111
Shipping Street: 456 Big Sky Blvd
Shipping City: Outer Rim
Shipping State: TX
Shipping Zip: 75333 */


/*Grover Smith
Billing Address:
123 Main Street
Middleton, TX 75111
Shipping Address:
456 Big Sky Blvd
Outer Rim, TX 75333*/