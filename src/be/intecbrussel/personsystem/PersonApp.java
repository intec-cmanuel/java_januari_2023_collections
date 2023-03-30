package be.intecbrussel.personsystem;

import java.util.*;

public class PersonApp {
    //

    public static void main(String[] args) {
        Collection<Person> people = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        handleUserInput: while (true) {
            System.out.println("What do you want to do?\n 1. create person\n 2. display people");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    Person createdPerson = createPerson();
                    people.add(createdPerson);
                    break;
                case 2:
                    displayPeople(people);
                    break;
                default:
                    break handleUserInput;
            }
        }

    }

    private static Person createPerson() {
        Scanner scanner = new Scanner(System.in);
        Person person;

        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your email?");
        String email = scanner.nextLine();

        person = new Person(firstName, lastName, age, email);
        return person;
    }

    private static void displayPeople(Collection<Person> people) {
        people.forEach(System.out::println);
    }
}
