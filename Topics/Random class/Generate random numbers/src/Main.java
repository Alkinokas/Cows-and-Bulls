import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        // Takes input
        String input = scanner.nextLine();
        String[] inputParts = input.split(" ");

        // Stores input as integers
        int n = Integer.parseInt(inputParts[0]);
        int a = Integer.parseInt(inputParts[1]);
        int b = Integer.parseInt(inputParts[2]);

        int range = b - a + 1;

        Random random = new Random(a + b);

        int [] array = new int[n];
        int sum = 0;

        // Filling the whole array and summing up the elements
        for (int i = 0; i < n; i++){
            array[i] = random.nextInt(b - a + 1) + a;
            sum += array[i];
        }

        System.out.println(sum);
    }
}