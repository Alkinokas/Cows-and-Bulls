import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++){
            System.out.printf("%s%s", input.charAt(i), input.charAt(i));
        }
    }
}