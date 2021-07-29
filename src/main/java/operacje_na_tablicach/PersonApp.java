package operacje_na_tablicach;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        Person person1 = new Person("Adrian", "Rogalski", "99071144736");
        Person person2 = new Person("Kasia", "Piszczek", "990723873221");
        database.add(person1);
        database.add(person2);
        System.out.println(Arrays.toString(database.getPeople()));
        database.remove(person1);
        System.out.println(Arrays.toString(database.getPeople()));
    }
}
