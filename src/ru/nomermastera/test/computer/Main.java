package ru.nomermastera.test.computer;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung");
        Computer computer = new Computer("MacPro", monitor);

        computer.On();
        computer.Off();
    }
}
