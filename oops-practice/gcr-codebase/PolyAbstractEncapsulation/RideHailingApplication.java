// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehiclee implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    // Constructor
    public Vehiclee(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Encapsulation: Getters and Setters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // GPS interface methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Location updated to: " + newLocation);
    }
}

// Car subclass
class Carr extends Vehiclee{
    public Carr(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base charge for cars
    }
}

// Bike subclass
class Bikee extends Vehiclee {
    public Bikee(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no extra charges
    }
}

// Auto subclass
class Auto extends Vehiclee {
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20; // small fixed charge
    }
}

// Main class
public class RideHailingApplication {
    // Polymorphism: process different vehicle types
    public static void processRide(Vehiclee[] vehicles, double distance) {
        for (Vehiclee v : vehicles) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: " + fare);
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {
        Vehiclee v1 = new Carr("CAR101", "Alice", 15, "Downtown");
        Vehiclee v2 = new Bikee("BIKE202", "Bob", 8, "City Center");
        Vehiclee v3 = new Auto("AUTO303", "Charlie", 10, "Station Road");

        Vehiclee[] rides = {v1, v2, v3};

        // Process rides with polymorphism
        processRide(rides, 12); // distance = 12 km
    }
}
