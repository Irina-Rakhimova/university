package ru.rahimova.university.entity;

import ru.rahimova.university.service.Communicatable;
import ru.rahimova.university.service.Studiable;

public class Student implements Studiable, Communicatable {
    String teacher = "учитель";
    String education = "образование";

    @Override
    public void communicate(Communicatable communicatable){
        System.out.println("Я студент, мне нравится общаться!");
    }

    @Override
    public void study(Studiable studiable) {
        System.out.println("И еще я люблю учиться! Ведь только " + teacher + " может помочь мне получить " + education);
    }
}
