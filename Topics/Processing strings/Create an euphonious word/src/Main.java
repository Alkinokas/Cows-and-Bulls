import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 0;
        int sequence = 1;

        for (int i = 1; i < input.length(); i++){
                if (!isVowel(input.charAt(i)) && !isVowel(input.charAt(i - 1)) ||
                        isVowel(input.charAt(i)) && isVowel(input.charAt(i - 1))){
                    sequence++;
                    if (sequence == 3) {
                        counter++;
                        sequence = 1;
                    }
                } else {
                    sequence = 1;
                }
        }
//        if (counter >= 2){
//            counter = counter / 2;
//        }

        System.out.println(counter);
    }
    public static boolean isVowel(char c){
        String vowels = "aeiouyAEIOUY";
        if (vowels.indexOf(c) != -1){
            return true;
        } else {
            return false;
        }
    }
}