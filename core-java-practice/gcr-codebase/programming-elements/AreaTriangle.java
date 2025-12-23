
import java.util.Scanner;

public class AreaTriangle{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        // Area in square inches
        double areaInches = 0.5 * base * height;

        // Conversion: 1 square inch = 6.4516 square centimeters
        double areaCentimeters = areaInches * 6.4516;

        System.out.println(
                "The area of the triangle in square inches is " + areaInches +
                " and in square centimeters is " + areaCentimeters
        );

        sc.close();
    }
}
