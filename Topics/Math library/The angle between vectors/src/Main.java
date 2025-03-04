import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        String userInput2 = scanner.nextLine();
        String [] inputs1 = userInput1.split(" ");
        String [] inputs2 = userInput2.split(" ");
        int [] vector1 = new int [2];
        int [] vector2 = new int [2];


        for (int i = 0; i < 2; i++){
            vector1[i] = Integer.parseInt(inputs1[i]);
            vector2[i] = Integer.parseInt(inputs2[i]);
        }

        double vector1mod = Math.sqrt(Math.pow(vector1[0], 2) + Math.pow(vector1[1], 2));
        double vector2mod = Math.sqrt(Math.pow(vector2[0], 2) + Math.pow(vector2[1], 2));

        int multVectors = vector1[0] * vector2[0] + vector1[1] * vector2[1];

        double cosinus = multVectors / (vector1mod * vector2mod);
        int angle = (int) Math.toDegrees(Math.acos(cosinus));
        System.out.println(angle);
    }
}