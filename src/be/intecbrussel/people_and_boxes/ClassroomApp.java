package be.intecbrussel.people_and_boxes;

import be.intecbrussel.personsystem.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassroomApp {
    public static void main(String[] args) {
        Map<String, List<Person>> studentsInClasses = new HashMap<>();
        Map<String, Person> studentNames = new HashMap<>();
        Map<Person, Boolean> studentAttendance = new HashMap<>();

        Person s1 = new Person("Tom", "Tomers", 20, "tom@tomers.tom");
        Person s2 = new Person("Jan", "Janners", 20, "Jan@Janners.Jan");
        Person s3 = new Person("An", "Anas", 15, "An.Anas@fruit.pulp");

        studentNames.put("Tom", s1);
        studentNames.put("Janathan", s2);
        studentNames.put("An", s3);

        studentAttendance.put(s1, true);
        studentAttendance.put(s2, false);
        studentAttendance.put(s3, true);

        putInMap(studentsInClasses, "Java", s1);
        putInMap(studentsInClasses, "Front-end", s2);
        putInMap(studentsInClasses, "Java", s3);

        studentNames.entrySet().stream().forEach(System.out::println);
        studentNames.forEach((key, value) -> System.out.println(key + " - " + value));

//        for (Map.Entry<String, Person> stringPersonEntry : studentNames.entrySet()) {
//            System.out.printf("KEY: %s | VALUE: %s %n", stringPersonEntry.getKey(), stringPersonEntry.getValue());
//        }

//        Person personIWant = studentNames.get("Tom");
//        System.out.println(personIWant);

//        studentsInClasses.entrySet()
//                .forEach(entry -> System.out.printf("%s is in class %s%n", entry.getValue().getFirstName(), entry.getKey()));

//        for (Map.Entry<String, List<Person>> stringListEntry : studentsInClasses.entrySet()) {
//            System.out.println(stringListEntry.getKey());
//            for (Person person : stringListEntry.getValue()) {
//                System.out.println("    - " + person);
//            }
//        }
    }

    private static void putInMap(Map<String, List<Person>> map, String key, Person personToAdd) {
        if (map.containsKey(key)) {
            map.get(key).add(personToAdd);
        } else {
            String keyForMap = key;
            List<Person> valueForMap = new ArrayList<>();
            valueForMap.add(personToAdd);
            map.put(keyForMap, valueForMap);
        }
    }
}
