import java.util.Scanner;

public class BMICalculation {

    // b. Method to calculate BMI and Status
    static String[][] calculateBMI(double heightCm, double weightKg) {

        String[][] result = new String[1][4];

        double heightMeter = heightCm / 100;
        double bmi = weightKg / (heightMeter * heightMeter);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        result[0][0] = String.valueOf(heightCm);
        result[0][1] = String.valueOf(weightKg);
        result[0][2] = String.valueOf(bmi);
        result[0][3] = status;

        return result;
    }

    //  Method to process all persons
    static String[][] processBMI(double[][] data) {

        String[][] finalData = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            String[][] temp = calculateBMI(data[i][1], data[i][0]);

            finalData[i][0] = temp[0][0];
            finalData[i][1] = temp[0][1];
            finalData[i][2] = temp[0][2];
            finalData[i][3] = temp[0][3];
        }
        return finalData;
    }

  
    static void display(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t" +
                    result[i][3]
            );
        }
    }

    // e. Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details of Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(data);
        display(result);

     
    }
}
