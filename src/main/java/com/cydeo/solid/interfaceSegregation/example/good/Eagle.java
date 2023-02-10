package com.cydeo.solid.interfaceSegregation.example.good;

public class Eagle implements CanWalk,CanEat,CanFly{
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void fly() {
        System.out.println("Flying.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }
}
