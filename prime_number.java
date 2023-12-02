public class prime_number {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }

    }
    public static boolean isprime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
