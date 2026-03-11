import java.util.Stack;

public class PalindromeChecker12 {

    public static void main(String[] args) {

        String input = "level";

        // choose strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}

/* Strategy Interface */
interface PalindromeStrategy {

    boolean check(String input);
}

/* Stack Strategy Implementation */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // compare with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}