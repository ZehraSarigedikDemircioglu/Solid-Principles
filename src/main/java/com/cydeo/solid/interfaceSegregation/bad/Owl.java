package com.cydeo.solid.interfaceSegregation.bad;

public class Owl implements Bird{
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
