package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int waterAvailable;
    private static int milkAvailable;
    private static int beansAvailable;
    private static int disposableCupsAvailable;
    private static int moneyAvailable;
    private static final int[] espresso = {250, 0, 16, 4};
    private static final int[] latte = {350, 75, 20, 7};
    private static final int[] cappuccino = {200, 100, 12, 6};

    public static void main(String[] args) {
        waterAvailable = 400;
        milkAvailable = 540;
        beansAvailable = 120;
        disposableCupsAvailable = 9;
        moneyAvailable = 550;
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String answer = scanner.next();
        switch (answer) {
            case "buy":
                buyCoffee();
                showMenu();
                break;
            case "fill":
                fillCoffeeMachine();
                showMenu();
                break;
            case "take":
                takeMoney();
                showMenu();
                break;
            case "remaining":
                showCoffeeMachineResources();
                showMenu();
                break;
            case "exit":
                break;
        }
    }

    public static void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String userInput = scanner.nextLine();
        switch (userInput) {
            case "1":
                makeCoffee(espresso);
                break;
            case "2":
                makeCoffee(latte);
                break;
            case "3":
                makeCoffee(cappuccino);
                break;
            case "back":
                break;
        }
    }

    public static void makeCoffee(int[] coffee) {
        boolean coffeeCanBeMade = waterAvailable >= coffee[0] && milkAvailable >= coffee[1]
                && beansAvailable >= coffee[2] && disposableCupsAvailable > 0;
        if (coffeeCanBeMade) {
            System.out.println("I have enough resources, making you a coffee!");
            waterAvailable -= coffee[0];
            milkAvailable -= coffee[1];
            beansAvailable -= coffee[2];
            moneyAvailable += coffee[3];
            disposableCupsAvailable -= 1;
        }
        else {
            System.out.print("Sorry, not enough ");
            System.out.println(waterAvailable < coffee[0] ? "water!" : milkAvailable < coffee[1] ? "milk!"
                    : beansAvailable < coffee[2] ? "coffee beans!" : "disposable cups!");
        }
    }

    public static void fillCoffeeMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWrite how many ml of water you want to add:");
        waterAvailable += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milkAvailable += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        beansAvailable += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        disposableCupsAvailable += scanner.nextInt();
    }

    public static void takeMoney() {
        System.out.println("\nI gave you" + moneyAvailable + "$");
        moneyAvailable = 0;
    }

    public static void showCoffeeMachineResources() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(waterAvailable + " ml of water");
        System.out.println(milkAvailable + " ml of milk");
        System.out.println(beansAvailable + " g of coffee beans");
        System.out.println(disposableCupsAvailable + " disposable cups");
        System.out.println("$" + moneyAvailable + " of money");
    }

    public static void estimateNumberOfServings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = scanner.nextInt();
        int cups = Math.min(water / 200, Math.min(milk / 50, beans / 15));
        if (cups >= cupsNeeded) {
            System.out.print("Yes, I can make that amount of coffee");
            if (cups > cupsNeeded) {
                System.out.print(" (and even "+ (cups - cupsNeeded) + " more than that)");
            }
        } else {
            System.out.println("No, I can make only " + cups + " cup(s) of coffee");
        }
    }

    public static void countIngredients() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        System.out.println("For 25 cups of coffee you will need:");
        System.out.println(200 * cups + " ml of water");
        System.out.println(50 * cups + " ml of milk");
        System.out.println(15 * cups + " g of coffee beans");
    }

    public static void printStepsForMakingCoffee() {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }
}