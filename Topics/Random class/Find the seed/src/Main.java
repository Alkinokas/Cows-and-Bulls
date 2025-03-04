import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
       
        String input = scanner.nextLine();
        String[] inputParts = input.split(" ");

        // Store defining values
        int a = Integer.parseInt(inputParts[0]);
        int b = Integer.parseInt(inputParts[1]);
        int n = Integer.parseInt(inputParts[2]);
        int k = Integer.parseInt(inputParts[3]);

        // Generate a random seed
        generateSeed(a, b, n, k);
    }

    public static void generateSeed(int lower, int upper, int howManyNumbers, int size){
        int range = upper - lower + 1;
        int [][] randomArray = new int [range][howManyNumbers];
        int [][] seedsAndMax = new int [range][2];

        for (int i = 0; i < range; i++){
            Random random = new Random(lower + i);

            for (int j = 0; j < howManyNumbers; j++){
                randomArray[i][j] = random.nextInt(size);
            }
            seedsAndMax[i][0] = lower + i;
        }

        for (int k = 0; k < randomArray.length; k++){
            seedsAndMax[k][1] = findMax(randomArray[k]);
        }

        int min = findMin(seedsAndMax);
        int finalSeed = -1;

        for (int m = 0; m < seedsAndMax.length; m++){
            if (seedsAndMax[m][1] == min){
                finalSeed = seedsAndMax[m][0];
                break;
            }
        }

        System.out.println(finalSeed);
        System.out.println(min);
    }

    public static int findMax(int [] array){
        int max = array[0];

        for (int num : array){
            if (num > max){
                max = num;
            }
        }

        return max;
    }

    public static int findMin(int [][] array){
        int min = array[0][1];

        for (int n = 0; n < array.length; n++){
            if (array[n][1] < min){
                min = array[n][1];
            }
        }

        return min;
    }
}