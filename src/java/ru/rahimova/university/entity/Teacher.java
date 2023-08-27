package ru.rahimova.university.entity;

import ru.rahimova.university.service.Studiable;
import ru.rahimova.university.service.Working;

public class Teacher implements Studiable, Working {
    String learner = "Учащийся";
    String work = "работать";

    public void work(Working working) {
        System.out.println("Я учитель, и я люблю " + work);
    }

    @Override
    public void study(Studiable studiable) {
        System.out.println(learner + " обучается, благодаря мне");
    }
}
