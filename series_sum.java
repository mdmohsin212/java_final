import java.util.Scanner;
public class series_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int sum = 0;
        for (int i = 2; i <= n; i = i+2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
