import java.util.Scanner;

public class PalindromeChecker2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Input text: ");
        String text = scanner.nextLine();

        String reverse = "";

        // Reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        // Check palindrome
        boolean isPalindrome = text.equals(reverse);

        // Print result
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}






