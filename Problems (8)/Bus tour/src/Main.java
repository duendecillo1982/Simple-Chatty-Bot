import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] pieces = input.split(" ");
        int busHeight = Integer.parseInt(pieces[0]);
        int numberOfBridges = Integer.parseInt(pieces[1]);
        int bridgeCrash = -1;
        int lowest = busHeight+1;

        for (int i = 1; i <= numberOfBridges; i++) {
            int h = scanner.nextInt();
            if (h < lowest) {
                lowest = h;
                bridgeCrash = i;
                break;
            }
        }
        if (busHeight >= lowest) {
            System.out.println("Will crash on bridge " + bridgeCrash);
        } else {
            System.out.println("Will not crash");
        }

    }
}