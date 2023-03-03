package ru.nomermastera.test.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("MacPro", new Monitor("Samsung"));

        computer.On();
        computer.Off();
    }
}
