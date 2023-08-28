package ru.rahimova.university.entity;

import ru.rahimova.university.service.Studiable;
import ru.rahimova.university.service.Working;

public class Teacher implements Studiable, Working {
    University university;
    Student student;

    @Override
    public void work(Working working) {
        System.out.println("Я учитель, и я люблю работать!");
    }

    @Override
    public void study(Studiable studiable) {
        System.out.println("Еще люблю обучать студентов!");
    }
}
