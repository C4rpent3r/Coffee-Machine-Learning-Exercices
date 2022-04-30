public class Main {

    public static void main(String[] args) {

        secret test = secret.STAR;
        for (secret secret :  secret.values()){
            if (test.name().startsWith("STAR")){
                System.out.println("STAR, START");
            }
        }
    }
}

enum secret{

    STAR, CRASH, START,
}