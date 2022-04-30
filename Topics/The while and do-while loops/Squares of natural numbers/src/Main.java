import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

            System.out.println(1);
        for(int i = 1; i*i <= num;){
            i++;
            if (i <= num/i){
                System.out.println(i*i);
            }
        }
    }
}