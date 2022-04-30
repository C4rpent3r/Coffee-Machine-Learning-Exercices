import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String java = scanner.nextLine();
        int zero = scanner.nextInt();
        int deux = scanner.nextInt();

        System.out.println(java.substring(zero,deux + 1));
    }
}