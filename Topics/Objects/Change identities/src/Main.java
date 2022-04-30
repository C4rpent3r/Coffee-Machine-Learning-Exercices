class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String temporaryNameP1 = p1.name;
        int temporaryAgeP1 = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = temporaryNameP1;
        p2.age = temporaryAgeP1;
    }
}