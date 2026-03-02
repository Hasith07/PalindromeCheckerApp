package src;

import java.util.Stack;

public class PalindromeApp2 {

    public static void main(String[] args) {

        // Original string
        String original = "madam";


        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;


        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}