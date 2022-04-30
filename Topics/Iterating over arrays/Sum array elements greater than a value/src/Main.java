import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[scanner.nextInt()];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }

        int input = scanner.nextInt();
        int value = 0;

        for (int j = 0; j < tableau.length; j++) {
            if (tableau[j] > input){
                value += tableau[j];
            }
        }
        System.out.println(value);
    }
}