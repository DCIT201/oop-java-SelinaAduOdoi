package interfaces;

import models.Customer;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}
@Override
public void rent(Customer customer, int days) {
    if (!isAvailable()) {
        throw new VehicleUnavailableException("Vehicle is not available!");
    }
    setAvailable(false);
    System.out.println("Rented to " + customer.getName() + " for " + days + " days.");
}

@Override
public void returnVehicle() {
    setAvailable(true);
    System.out.println("Vehicle returned.");
}


