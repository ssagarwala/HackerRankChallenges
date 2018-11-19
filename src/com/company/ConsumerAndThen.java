 package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen {
    /*from   w  w  w  .java2 s.  c  o  m*/
        public static void main(String[] args) {
            List<Student> students = Arrays.asList(
                    new Student(1, 3, "John"),
                    new Student(2, 4, "Jane"),
                    new Student(3, 3, "Jack"));

            Consumer<Student> raiser = e -> {
                e.gpa = e.gpa * 1.1;
            };

            raiseStudents(students, System.out::println);
            raiseStudents(students, raiser.andThen(System.out::println));
        }

        private static void raiseStudents(List<Student> employees,
                                          Consumer<Student> fx) {
            for (Student e : employees) {
                fx.accept(e);
            }
        }

    }


