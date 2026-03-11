public class PalindromeChecker9 {

    public static void main(String[] args) {

        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }

    // recursive function
    private static boolean check(String s, int start, int end) {

        // base condition
        if (start >= end) {
            return true;
        }

        // compare characters
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // recursive call
        return check(s, start + 1, end - 1);
    }
}