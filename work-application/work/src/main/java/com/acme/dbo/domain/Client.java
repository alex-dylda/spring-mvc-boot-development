package com.acme.dbo.domain;

public class Client {
    private int id;
    private String name;

    public Client(final String name) {
        this.name = name;
    }

    public Client(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
