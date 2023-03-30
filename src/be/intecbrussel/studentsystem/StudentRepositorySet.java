package be.intecbrussel.studentsystem;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class StudentRepositorySet {
    private Collection<Student> myStudents;

    public StudentRepositorySet() {
        myStudents = new LinkedHashSet<>();
    }

    public void addStudent(Student student) {
        if (student == null) {
            return;
        }

        myStudents.add(student);
    }

    public void deleteStudent(Student student) {
        myStudents.remove(student);
    }

    public void printStudents() {
        myStudents.forEach(System.out::println);
    }

    public void printAmountOfStudents() {
        System.out.println("Amount of students: " + myStudents.size());
    }

    public Optional<Student> getStudent(String name) {
//        for (Student myStudent : myStudents) {
//            if (myStudent.getName().equals(name)) {
//                return Optional.of(myStudent);
//            }
//        }
//
//        return Optional.empty();

        return myStudents.stream()
                .filter(student ->  student.getName().equals(name))
                .findFirst();
    }

    public Collection<Student> getStudents() {
        return new ArrayList<>(myStudents);
    }

    public boolean containsStudent(Student student) {
        return myStudents.contains(student);
    }
}
