import java.util.*;
public class BMI {
    public static void main(String[] args) {
        System.out.print("Enter weight (in kg): ");
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = in.nextDouble();
        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}