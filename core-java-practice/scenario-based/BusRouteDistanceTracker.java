import java.util.*;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDistance=0;
        char choice = 'n';

         while (true) {

            System.out.print("Enter distance for next stop (in km): ");
            int distance = sc.nextInt();

            // add distance of current stop
            totalDistance += distance;

            System.out.println("Total distance traveled: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice = sc.next().charAt(0);

            if (choice == 'y' || choice == 'Y') {
                System.out.println("Passenger got off. Journey ended.");
                break; 
            }
        }
    }
}
