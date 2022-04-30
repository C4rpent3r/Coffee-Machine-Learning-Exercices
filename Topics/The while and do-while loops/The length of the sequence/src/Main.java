import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valeurNombre = scanner.nextInt();
        int i = 0;

        while (valeurNombre > 0){
            i++;
            valeurNombre = scanner.nextInt();
        }
        System.out.println(i);
    }
}
