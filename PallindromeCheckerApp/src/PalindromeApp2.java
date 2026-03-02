package src;

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeApp2 {

    public static void main(String[] args) {


        String original = "racecar";


        Deque<Character> deque = new ArrayDeque<>();


        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;


        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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