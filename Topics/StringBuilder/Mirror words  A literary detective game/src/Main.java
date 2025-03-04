import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder inputBuilder = new StringBuilder(input.toLowerCase());
        inputBuilder.replace(0, inputBuilder.length(), inputBuilder.toString().replaceAll("\\s", ""));
        String formatedInput = inputBuilder.toString();

        inputBuilder.reverse();
        String reversedInputString = inputBuilder.toString();

        // Implement palindrome check here
        boolean isPalindrome = false;

        if (formatedInput.equals(reversedInputString)){
            isPalindrome = true;
        }

        // Print result
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}