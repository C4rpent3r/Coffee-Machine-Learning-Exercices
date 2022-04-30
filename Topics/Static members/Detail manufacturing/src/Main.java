import java.util.Scanner;

class ManufacturingController {
    static int numberRequest = 0;

    public static String requestProduct(String product) {
        numberRequest += 1;
        return numberRequest + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        return numberRequest;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}