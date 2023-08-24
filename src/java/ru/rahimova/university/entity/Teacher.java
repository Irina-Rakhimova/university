package ru.rahimova.university.entity;

public class Teacher implements Studiable, Working {
    String learner;
    String work;

    @Override
    public void study() {
        System.out.println("Я учитель, и я люблю обучать!");
    }

    @Override
    public void work() {
        System.out.println("И еще я люблю работать!");
    }

}
