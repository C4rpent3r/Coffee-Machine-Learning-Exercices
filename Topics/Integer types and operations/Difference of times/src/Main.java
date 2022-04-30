import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int secondes1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int secondes2 = scanner.nextInt();

        System.out.println((hours2 * 60 * 60 + minutes2 * 60 + secondes2)
        - (hours1 * 60 * 60 + minutes1 * 60 + secondes1));
    }
}