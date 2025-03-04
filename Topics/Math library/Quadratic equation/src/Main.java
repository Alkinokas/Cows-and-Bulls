import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            a = scanner.nextDouble();
        } while (a == 0);

        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x1 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a *c))/ (2 * a);
        double x2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a *c))/ (2 * a);

        if (x1 > x2) {
            double temp = x1;
            x1 = x2;
            x2 = temp;
        }

        System.out.printf("%.5f %.5f\n", x1, x2);
    }
}