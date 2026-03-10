import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromePerformanceTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== UC13: Palindrome Performance Comparison ===");
        System.out.print("Enter a string to test: ");
        String testInput = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();


        int iterations = 1_000_000;

        System.out.println("\nRunning " + iterations + " iterations for each algorithm...\n");


        long timeIterative = benchmark(testInput, iterations, "Iterative");


        long timeBuilder = benchmark(testInput, iterations, "StringBuilder");


        long timeRecursive = benchmark(testInput, iterations, "Recursive");

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s | %-20s\n", "Algorithm", "Total Time (ms)");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s | %-20.2f ms\n", "Two-Pointer", timeIterative / 1_000_000.0);
        System.out.printf("%-20s | %-20.2f ms\n", "StringBuilder", timeBuilder / 1_000_000.0);
        System.out.printf("%-20s | %-20.2f ms\n", "Recursive", timeRecursive / 1_000_000.0);
        System.out.println("---------------------------------------------------------");

        scanner.close();
    }

    private static long benchmark(String input, int iterations, String type) {
        // Warm-up phase (to let JVM optimize)
        for (int i = 0; i < 10000; i++) {
            runAlgorithm(input, type);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            runAlgorithm(input, type);
        }
        return System.nanoTime() - startTime;
    }

    private static boolean runAlgorithm(String str, String type) {
        switch (type) {
            case "Iterative": return isIterative(str);
            case "StringBuilder": return isStringBuilder(str);
            case "Recursive": return isRecursive(str, 0, str.length() - 1);
            default: return false;
        }
    }


    public static boolean isIterative(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }


    public static boolean isStringBuilder(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }


    public static boolean isRecursive(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isRecursive(str, left + 1, right - 1);
    }
}
