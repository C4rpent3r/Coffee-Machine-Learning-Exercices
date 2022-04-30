import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ecureuil = scanner.nextInt();
        int noix = scanner.nextInt();

        System.out.println(noix / ecureuil);
    }
}