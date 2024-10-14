package Implementation;

import Classes.Person;
import Interfaces.Criterion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CriterionImpl {
    public static void main() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(20, "Fernando"));
        people.add(new Person(20, "Elia"));
        people.add(new Person(48, "Ema"));
        people.add(new Person(42, "Vicky"));
        people.add(new Person(50, "Victor"));

        Criterion criterion = x -> x.getEdad() >= 30;

        List<Person> filterPerson = people.stream()
                .filter(criterion::test)
                .sorted(Comparator.comparing(Person::getEdad))
                .collect(Collectors.toUnmodifiableList());

        System.out.println("here begins the CriterionImpl implementation: ");
        System.out.println(filterPerson);
    }
}
