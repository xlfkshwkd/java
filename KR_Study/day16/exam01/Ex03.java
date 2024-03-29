package exam01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

public class Ex03 {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20).forEach(Ex03::add);
        Map<Boolean, List<Student>> students1 = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGender() == 'F'));

        List<Student> females = students1.get(true);
        List<Student> males = students1.get(false);
    }

    private static void add(int i) {
        int grade = (int)(Math.random() * 3) + 1;
        int ban = (int)(Math.random() * 3) + 1;
        char gender = (new Random()).nextBoolean() ? 'F':'M';

        students.add(new Student(grade, ban, gender, "학생" + i));
    }
}