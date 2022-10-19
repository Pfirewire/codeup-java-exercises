import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] morePeople = new Person[people.length+1];
        for(int i = 0; i < people.length; i++) {
            morePeople[i] = people[i];
        }
        morePeople[morePeople.length - 1] = person;
        return morePeople;
    }

    public static void doExercises() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Rich");
        people[1] = new Person("Steve");
        people[2] = new Person("Valeria");
        for(Person person : people) {
            System.out.println(person.getName());
        }

        Person[] morePeople = addPerson(people, new Person("Jazmine"));
        for(Person person : morePeople) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {
        doExercises();
    }

}
