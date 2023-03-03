package ru.nomermastera.test.computer;

public class Computer implements IComputer{

    private String name;

    private Monitor monitor;

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(final Monitor monitor) {
        this.monitor = monitor;
    }

    public Computer(String name, Monitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void On() {
        System.out.println("Компьютер " + this.name + " включился, используется монитор " + monitor.getName());
    }

    @Override
    public void Off() {
        System.out.println("Компьютер " + this.name + " выключился, используется монитор " + monitor.getName());
    }
}
