import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 0;
        long nfact = 1;
        do {
            n++;
            nfact = 1;
            for (int i = 1; i <= n; i++) {
                nfact = nfact * i;
            }
        } while (nfact <= m);
        System.out.println(n);
    }
}