public class NullPointerGenerateAndHandler {
      public static void generateException() {
        String text = null;
        System.out.println(text.length()); // cause NullPointerException
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully!");
        }
    }
   public static void main(String[] args) {
       System.out.println("---- Generating NullPointerException ----");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n---- Handling NullPointerException ----");
        handleException();
   } 
}
