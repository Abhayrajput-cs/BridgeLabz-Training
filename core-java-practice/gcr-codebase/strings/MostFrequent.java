//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class MostFrequent {
//      public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		HashMap<Character, Integer> map = new HashMap<>();
//		String str = in.nextLine();
//
//		for (int i = 0; i < str.length(); i++) {
//		    char ch = str.charAt(i);
//		    
//
//		    if (map.containsKey(ch)) {
//		        map.put(ch, map.get(ch) + 1);
//		    } else {
//		        map.put(ch, 1);
//		    }
//		}
//		char ch=' ';
//		int num=0;
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//		   
//			if(entry.getValue()>num) {
//				num=entry.getValue();
//				ch=entry.getKey();
//			}
//		}
//		System.out.println("the most frequent  character is "+ch);
//		}
//}




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') continue; 

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        System.out.println("The most frequent character is " + mostFrequentChar);
    }
}
