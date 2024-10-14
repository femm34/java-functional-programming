package Interfaces;

import Classes.Person;

@FunctionalInterface
public interface Criterion {
    boolean test(Person person);
}
