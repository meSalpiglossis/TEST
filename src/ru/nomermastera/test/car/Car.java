package ru.nomermastera.test.car;

public class Car implements ICar {

    private String name;

    private String divider = " ";

    public Car(final String name) {
        this.name = name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void drive() {
        System.out.println(this.name + divider + "drive");
    }

    @Override
    public void stop() {
        System.out.println(this.name + divider + "stop");
    }
}
