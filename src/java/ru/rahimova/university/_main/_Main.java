package ru.rahimova.university._main;

import ru.rahimova.university.entity.Student;
import ru.rahimova.university.entity.Teacher;
import ru.rahimova.university.entity.University;

public class _Main {

    public static void main(String[] args) {
        
        University university = new University();
        Student student = new Student();
        Teacher teacher = new Teacher();
        teacher.work(teacher);
        teacher.study(teacher);
        student.communicate(student);
        student.study(student);
    }
}
