import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int[] tableau = new int[scanner.nextInt()];
        final int temp = 0;

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }

        tableau[0] = temp;

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = tableau[i - 1];
            System.out.print(tableau[i] + " ");
        }
    }
}