package bullscows;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static int bulls = 0;
    static int cows = 0;
    static String code = "";
    private static final String CHARACTERS = "0123456789abcdefghijklmnopqestuvwxyz";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        String userCodeInput = scanner.nextLine();
        int number = 0;

        try {
            number = Integer.parseInt(userCodeInput);
        } catch (NumberFormatException e) {
            System.out.printf("Error: \"%s\" isn't a valid number.", userCodeInput);
            return;
        }

        System.out.println("Input the number of possible symbols in the code:");
        int possibleSymbols = scanner.nextInt();
        scanner.nextLine();

        if (number <= 0) {
            System.out.println("Error: it's not possible to generate a code with a length of 0.");
            return;
        }

        if (possibleSymbols < number) {
            System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.\n", number, possibleSymbols);
            return;
        }

        if (possibleSymbols > CHARACTERS.length()){
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return;
        }

        code = generateCode(number, possibleSymbols);
        message(number, possibleSymbols);

        System.out.println("Okay, let's start a game!");
        int turn = 1;

        while (bulls < number){
            System.out.printf("Turn %d:\n", turn);
            String userGuess = scanner.nextLine();
            grader(userGuess);
            turn++;
        }

        System.out.println("Congratulations! You guessed the secret code.");
    }

    public static String generateCode (int codeLength, int numberOfPossibleSymbols){
        Random random = new Random();
        StringBuilder codeString = new StringBuilder(codeLength);


        for (int i = 0; i < codeLength;){
            int randomIndex = random.nextInt(numberOfPossibleSymbols);
            char currentChar = CHARACTERS.charAt(randomIndex);

            // Unique digits only
            if (codeString.indexOf(String.valueOf(currentChar)) == -1) {
                codeString.append(currentChar);
                i++;
            }
        }

        String finalCode = codeString.toString();

        return finalCode;
    }

    public static void grader (String userInput) {
        bulls = 0;
        cows = 0;
        for (int i = 0; i < userInput.length(); i++){
            if (userInput.contains(String.valueOf(code.charAt(i)))){
                if (userInput.charAt(i) == code.charAt(i)){
                    bulls++;
                    continue;
                }
                cows++;
            }
        }
        if (bulls <= 0){
            System.out.printf("Grade: %d cow(s)\n", cows, code);
        } else if (bulls <= 0 && cows <= 0){
            System.out.printf("Grade: None\n", code);
        } else {
            System.out.printf("Grade: %d bull(s) and %d cow(s)\n", bulls, cows, code);
        }
    }

    public static void message (int codeLength, int numberOfPossibleSymbols) {
        char character = '*';
        String result = String.valueOf(character).repeat(codeLength);

        if (numberOfPossibleSymbols <= 10) {
            System.out.printf("The secret is prepared: %s (0-9)\n", result);
        } else {
            System.out.printf("The secret is prepared: %s (0-9, a-%c)\n", result, CHARACTERS.charAt(numberOfPossibleSymbols - 1));
        }
    }
}
