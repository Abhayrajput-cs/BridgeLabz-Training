interface Insurable {
    void calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public double getRentalRate() {
        return rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + type);
        System.out.println("Rental Rate   : " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {

    private double insuranceAmount;

    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public void calculateInsurance() {
        insuranceAmount = getRentalRate() * 0.15;
    }

    public void getInsuranceDetails() {
        calculateInsurance();
        System.out.println("Insurance Type : Car Insurance");
        System.out.println("Insurance Amt  : " + insuranceAmount);
    }
}

class Bike extends Vehicle implements Insurable {

    private double insuranceAmount;

    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public void calculateInsurance() {
        insuranceAmount = getRentalRate() * 0.10;
    }

    public void getInsuranceDetails() {
        calculateInsurance();
        System.out.println("Insurance Type : Bike Insurance");
        System.out.println("Insurance Amt  : " + insuranceAmount);
    }
}

class Truck extends Vehicle implements Insurable {

    private double insuranceAmount;

    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public void calculateInsurance() {
        insuranceAmount = getRentalRate() * 0.20;
    }

    public void getInsuranceDetails() {
        calculateInsurance();
        System.out.println("Insurance Type : Truck Insurance");
        System.out.println("Insurance Amt  : " + insuranceAmount);
    }
}

public abstract class VehicleSystem {
    public static void main(String[] args) {

        Vehicle[] veh = {
                new Car("UP14BC5678", "Baleno Car", 800),
                new Bike("UP81AB2580", "Hero Honda Bike", 400),
                new Truck("MH78PS0000", "Benz Truck", 1000)
        };

        for (Vehicle v : veh) {
            v.display();
            System.out.println("Rental Cost (10 days) : " + v.calculateRentalCost(10));

            Insurable ins = (Insurable) v;
            ins.getInsuranceDetails();

            System.out.println("--------------------------------");
        }
    }
}
