package HMS;

class InPatient extends Patient implements IPayable {
    private int days;
    private double dailyCharge;

    public InPatient(int id, String name, int age, String gender, int days, double dailyCharge) {
        super(id, name, age, gender);
        this.days = days;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return days * dailyCharge;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient Type : InPatient");
        System.out.println("Total Bill   : " + calculateBill());
    }
}
