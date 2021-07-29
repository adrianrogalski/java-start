package operacje_na_tablicach;

import java.util.Arrays;

public class PersonDatabase {
    private Person[] people;

    public PersonDatabase() {
        people = new Person[1];
    }

    public void add(Person person) {
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = person;
                return;
            }
        }
        people = Arrays.copyOf(people, people.length * 2);
        people[people.length / 2] = person;
    }

    public void remove(Person person) {
        if (person == null) {
            throw new NullPointerException();
        }
        // TODO
    }


    public Person get(int index) {
        return people[index];
    }

    public int size() {
        int size = 0;
        for (Person person : people) {
            if (person != null) {
                size++;
            }
        }
        return  size;
    }

    public Person[] getPeople() {
        return people;
    }
}
