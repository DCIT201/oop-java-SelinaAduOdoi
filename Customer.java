package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String licenseNumber;
    private List<Vehicle> rentalHistory = new ArrayList<>();

    public Customer(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void addRental(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }
}
