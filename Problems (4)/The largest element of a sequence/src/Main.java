import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println(largest);
    }
}