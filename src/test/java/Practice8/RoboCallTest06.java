package Practice8;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class RoboCallTest06 {
    @Test
    public void createShortList() throws Exception {
        List<Person> people = Person.createShortList();
        System.out.println("\n=== Print List ===");
        people.forEach(person -> System.out.println(person));

        System.out.println("\n=== Pilots ===");
        people.stream().filter(person -> person.getAge() >=23 && person.getAge() <= 65)
                .forEach(person -> System.out.println(person));

        System.out.println("\n=== Pilots with Predicate===");
        Predicate<Person> allPilots = p -> p.getAge() >=23 && p.getAge() <= 65;
        people.stream().filter(allPilots).forEach(System.out::println);

    }

}