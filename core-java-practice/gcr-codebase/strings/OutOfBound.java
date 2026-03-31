import java.util.Scanner;

public class OutOfBound {

	 public static void main(String[] args) {
	   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
            System.out.println(names[names.length + 1]);
  
            System.out.println("ArrayIndexOutOfBoundsException handled");
        
    }

   
     
    }
