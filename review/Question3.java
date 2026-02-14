//import java.util.*;
//
//class InvalidReservationException extends Exception {
//    public InvalidReservationException(String message) {
//        super(message);
//    }
//}
//
//class HotelUtil {
//
//    // Map for hotel and capacity
//    private static Map<String, Integer> hotelMap = new HashMap<>();
//
//    static {
//        hotelMap.put("Taj", 4);
//        hotelMap.put("Marriott", 5);
//        hotelMap.put("Hyatt", 3);
//        hotelMap.put("Hilton", 2);
//    }
//
//    public boolean validateRoomNumber(String roomNumber)
//            throws InvalidReservationException {
//
//        if (!roomNumber.matches("RM-[1-9][0-9]{2}")) {
//            throw new InvalidReservationException(
//                    "The room number " + roomNumber + " is invalid");
//        }
//        return true;
//    }
//
//    public boolean validateHotelName(String hotelName)
//            throws InvalidReservationException {
//
//        if (!hotelMap.containsKey(hotelName)) {
//            throw new InvalidReservationException(
//                    "The hotel name " + hotelName + " is invalid");
//        }
//        return true;
//    }
//
//    public boolean validateGuestCount(int guestCount, String hotelName)
//            throws InvalidReservationException {
//
//        int max = hotelMap.get(hotelName);
//
//        if (guestCount <= 0 || guestCount > max) {
//            throw new InvalidReservationException(
//                    "The guest count " + guestCount +
//                    " is invalid for " + hotelName);
//        }
//        return true;
//    }
//
//    public int calculateRoomsRequired(String hotelName, int guestCount)
//            throws InvalidReservationException {
//
//        int capacity = hotelMap.get(hotelName);
//
//        if (guestCount <= 0) {
//            throw new InvalidReservationException(
//                    "Invalid guest count for " + hotelName);
//        }
//
//        return (int) Math.ceil((double) guestCount / capacity);
//    }
//}
//
//public class Question3 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter reservation details");
//
//        try {
//            String input = sc.nextLine();
//            String[] arr = input.split(":");
//
//            String roomNumber = arr[0];
//            String hotelName = arr[1];
//            int guestCount = Integer.parseInt(arr[2]);
//
//            HotelUtil util = new HotelUtil();
//
//            util.validateRoomNumber(roomNumber);
//            util.validateHotelName(hotelName);
//            util.validateGuestCount(guestCount, hotelName);
//
//            int rooms = util.calculateRoomsRequired(hotelName, guestCount);
//
//            System.out.println("Rooms required: " + rooms);
//
//        } catch (InvalidReservationException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Invalid input format");
//        }
//
//        sc.close();
//    }
//}


// count the no of words from file 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Question3 {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader("employee.txt"));

        String s;
        int c = 0;

        while ((s = read.readLine()) != null) {
            String[] wrd = s.split("\\s+");
            c ++;                
        }
        System.out.println(c);
    }
}


