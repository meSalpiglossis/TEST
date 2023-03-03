package ru.nomermastera.test.computer;

public interface IComputer {

    void setName(String name);

    String getName();

    IMonitor getMonitor();

    void On();

    void Off();
}
