package models;

public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double discount = days > 7 ? 0.1 : 0.0;
        return getBaseRentalRate() * days * (1 - discount);
    }

    @Override
    public String getSpecialFeatures() {
        return "Air Conditioning, GPS, Audio System";
    }
}
