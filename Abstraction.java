package models;

public abstract class Vehicle ;
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable = true;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public abstract String getSpecialFeatures();
}
