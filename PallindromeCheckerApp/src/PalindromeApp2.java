import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {


    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

 import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not same
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for next characters
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.println("=== Recursive Palindrome Checker ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome (ignoring spaces and case).");
        // Convert to lowercase and remove spaces (optional normalization)
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(processed, 0, processed.length() - 1);

        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}
