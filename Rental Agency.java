package services;

import models.*;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String type) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable() && vehicle.getClass().getSimpleName().equalsIgnoreCase(type)) {
                return vehicle;
            }
        }
        throw new VehicleUnavailableException("No available " + type + " found!");
    }
}
