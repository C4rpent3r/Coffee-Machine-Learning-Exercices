import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int premierNombre = scanner.nextInt();
        premierNombre--;
        int secondNombre = scanner.nextInt();
        secondNombre--;
        int troisiemeNombre = scanner.nextInt();
        troisiemeNombre--;
        int quatriemeNombre = scanner.nextInt();
        quatriemeNombre--;
        System.out.print(" " + premierNombre);
        System.out.print(" " + secondNombre);
        System.out.print(" " + troisiemeNombre);
        System.out.print(" " + quatriemeNombre);
    }
}