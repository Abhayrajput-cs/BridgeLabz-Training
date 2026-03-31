package hms;

class OutPatient extends Patient implements IPayable {
    private double visitFee;

    public OutPatient(int id, String name, int age, String gender, double visitFee) {
        super(id, name, age, gender);
        this.visitFee = visitFee;
    }

    @Override
    public double calculateBill() {
        return visitFee;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient Type : OutPatient");
        System.out.println("Total Bill   : " + calculateBill());
    }
}
