import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double readius, area;
        readius = input.nextDouble();
        input.close();
        area = 3.1416 * readius * readius;
        System.out.println(area);
    }
}
