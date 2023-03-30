package be.intecbrussel.studentsystem;

import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;

public class StudentApp {
    static Collection<Integer> collection = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        StudentRepositorySet sr = new StudentRepositorySet();

        Student jan = new Student("Jan", "java");
        Student janathan = new Student("Janathan", "java");
        Student tom = new Student("Tom", "java");
        Student tomathan = new Student("Tomathan", "java");

//        sr.printAmountOfStudents();
        sr.addStudent(null);
        sr.addStudent(jan);
        sr.addStudent(janathan);
        sr.addStudent(janathan);

//        sr.printAmountOfStudents();

        sr.addStudent(tom);
        sr.addStudent(tomathan);

//        sr.printAmountOfStudents();

        sr.deleteStudent(tom);
        sr.printAmountOfStudents();
        sr.printStudents();

//        System.out.println(sr.getStudent(4));
//        System.out.println(sr.getStudent(-8));
//        System.out.println(sr.getStudent(2));
//        System.out.println(sr.getStudent(99));

        System.out.println(sr.getStudent(null));

        Collection<Student> students = sr.getStudents();

        System.out.println(students);

        students.add(null);
        students.add(null);
        students.add(null);
        students.add(null);
        students.add(null);

        System.out.println(sr.getStudent("Tom"));
    }
}
