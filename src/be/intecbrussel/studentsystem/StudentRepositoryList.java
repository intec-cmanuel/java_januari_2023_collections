package be.intecbrussel.studentsystem;

import java.util.*;

public class StudentRepositoryList {
    private List<Student> myStudents;

    public StudentRepositoryList() {
        myStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
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

    public Optional<Student> getStudent(int index) {
        if (index < 0 || index >= myStudents.size()) {
            return Optional.empty();
        }

        return Optional.ofNullable(myStudents.get(index));
    }

    public int indexOfStudent(Student student) {
        return myStudents.indexOf(student);
    }
}
