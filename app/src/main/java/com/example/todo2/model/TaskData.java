package com.example.todo2.model;

//class storing one task data
public class TaskData {
    private final String name;
    private final String type;
    private final int year;
    private final int month;
    private final int dayOfMonth;


    public TaskData(String name, String type, int year, int month, int dayOfMonth) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;

    }

    public String getInfo() {
        return this.name + this.year;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }
}
