import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean isTrue = input < 10;

        System.out.println(isTrue);
    }
}