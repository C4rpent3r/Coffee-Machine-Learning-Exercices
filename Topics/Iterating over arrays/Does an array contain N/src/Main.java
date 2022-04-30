import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[scanner.nextInt()];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();

        for (int element : tableau){
            if (element == number){
                System.out.println("true");
                break;
            }else {
                System.out.println("false");
            }
        }

    }
}