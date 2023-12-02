import java.util.Scanner;

public class quard {
    public static void main(String[] args) {
        double d, x1, x2;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        d = (b * b) - (4 * a * c);

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are " + x1 + " and " + x2);
        } else if (d == 0) {
            x1 = -b / (2.0 * a);
            System.out.println("Root is " + x1);
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}
