package services;

import models.Customer;
import models.Vehicle;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public double processTransaction() {
        vehicle.rent(customer, rentalDays);
        customer.addRental(vehicle);
        return vehicle.calculateRentalCost(rentalDays);
    }
}
