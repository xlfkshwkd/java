package exam01;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

public class Ex01 {
    private static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20).forEach(Ex01::add);
     //   students.stream().forEach(System.out::println);
        LinkedList<String> names =students.stream().map(Student::getName)
                .collect(toCollection(LinkedList::new));

        System.out.println(names);




    }

    private static void add(int i) {
        int grade = (int)(Math.random() * 3) + 1;
        int ban = (int)(Math.random() * 3) + 1;
        char gender = (new Random()).nextBoolean() ? 'F':'M';

        students.add(new Student(grade, ban, gender, "학생" + i));
    }

}