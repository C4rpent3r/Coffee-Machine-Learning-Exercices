import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();

        if (firstNumber.charAt(0) == firstNumber.charAt(3) && firstNumber.charAt(1) == firstNumber.charAt(2))
        {
            System.out.println(1);
        }
        else {
            System.out.println(37);
        }

    }
}