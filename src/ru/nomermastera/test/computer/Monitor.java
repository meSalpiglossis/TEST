package ru.nomermastera.test.computer;

public class Monitor implements IMonitor{

    private String name;

    public Monitor(final String name) {
        this.name = name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
