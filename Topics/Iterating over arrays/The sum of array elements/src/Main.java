import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[scanner.nextInt()];
        int sum = 0;

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
            sum = sum + tableau[i];
        }
        System.out.println(sum);
    }
}