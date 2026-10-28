package software.reuse.task4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(30, 3.2));
        students.add(new Student(10, 3.8));
        students.add(new Student(20, 2.9));

        System.out.println("Original list:");
        students.forEach(System.out::println);

        Collections.sort(students);   // Comparable: rollNo ascending
        System.out.println("\nSorted by rollNo (Comparable, ascending):");
        students.forEach(System.out::println);

        Collections.sort(students, new CgpaComparator());   // Comparator: cgpa descending
        System.out.println("\nSorted by CGPA (Comparator, descending):");
        students.forEach(System.out::println);
    }
}
