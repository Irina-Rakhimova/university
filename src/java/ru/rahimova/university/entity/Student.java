package ru.rahimova.university.entity;

public class Student implements Studiable, Communicatable {
    String lecturer;
    String education;

    @Override
    public void study(Studiable studiable){
        System.out.println("Я студент, и я люблю учиться!");
    }
    @Override
    public void communicate(){
        System.out.println("И еще я нравится общаться!");
    }


}
