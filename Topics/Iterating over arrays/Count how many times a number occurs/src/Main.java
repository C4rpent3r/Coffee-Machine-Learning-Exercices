import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tableau[] = new int[scanner.nextInt()];
        int numberContains;

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }
        numberContains = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == numberContains){
                count++;
            }
        }
        System.out.println(count);
    }
}