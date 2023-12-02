import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, area;
        a = input.nextInt();
        input.close();
        area = (Math.sqrt(3) / 4) * (a*a);
        System.out.println(area);
    }
}
