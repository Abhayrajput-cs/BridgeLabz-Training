public class PalinDrome {
    public static boolean isPalindrome(int x) {
        int original = x, reverse = 0;

        if (x < 0) return false;

        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
