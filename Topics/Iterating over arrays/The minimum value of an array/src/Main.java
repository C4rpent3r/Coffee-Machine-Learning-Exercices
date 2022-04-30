import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[scanner.nextInt()];
        int minimum = 0;

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }

        int min = tableau[0];

        for (int j = 0; j < tableau.length; j++) {
            if (tableau[j] < min){
                min = tableau[j];
            }
        }


        System.out.println(min);
    }
}