import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.empty()) {
            reversedString.append(stack.pop());
        }

        return s.equals(reversedString.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueChecking = true;

        System.out.println("This program checks if a string is a palindrome.");
        System.out.println("A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward.");
        System.out.println("Examples of palindromes include: racecar, madam, rotator, peep, etc.\n");

        while (continueChecking) {
            System.out.print("Enter String:\n");
            String inputString = scanner.nextLine();

            if (inputString.trim().isEmpty()) {
                System.out.println("Error: Input cannot be empty.");
                continue;
            }

            if (!inputString.matches("[a-zA-Z]+")) {
                System.out.println("Error: Input must contain only letters.");
                continue;
            }

            if (isPalindrome(inputString)) {
                System.out.println("THAT IS A PALINDROME!");
            } else {
                System.out.println("THAT IS NOT A PALINDROME!");
            }

            System.out.print("Would you like to check another string? (y/n)\n");
            String continueString = scanner.nextLine();
            if (continueString.equals("n")) {
                System.out.println("Thank you for using the palindrome checker!");
                continueChecking = false;
            }
        }
    }
}
