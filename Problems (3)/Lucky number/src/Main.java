import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < input.length() / 2; i++) {
            int number = Character.getNumericValue(input.charAt(i));
            firstSum += number;
        }
        for (int i = input.length() / 2; i < input.length(); i++ ) {
            int number = Character.getNumericValue(input.charAt(i));
            secondSum += number;
        }
        if (firstSum == secondSum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}