package com.pluralsight;

public class CellPhone {
    private int serial_number;
    private String model;
    private String carrier;
    private String phone_number;
    private String owner;


    public CellPhone (int serial_number, String model, String carrier, String phone_number,String owner){
        this.serial_number=serial_number;
        this.model=model;
        this.carrier=carrier;
        this.phone_number=phone_number;
        this.owner=owner;
    }

public int getSerial_number () {
        return this.serial_number;
}
public String getModel () {
        return this.model;
}
public String getCarrier () {
        return this.carrier;
}
public String getPhone_number () {
        return this.phone_number;
}
public String getOwner () {
        return this.owner;
}

}
/*- serialNumber (ex: 1000000 - 9999999)
- model (ex: iPhone X)
- carrier (ex: AT&T)
- phoneNumber (ex: 800-555-5555)
- owner (ex: Dana Wyatt)*/