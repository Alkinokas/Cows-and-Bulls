import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String [] words = input.split(" ");
        String temp = words[0];

        for (int i = 0; i < words.length; i++){
            if (words[i].length() > temp.length()){
                temp = words[i];
            }
        }

        System.out.println(temp);
    }
}