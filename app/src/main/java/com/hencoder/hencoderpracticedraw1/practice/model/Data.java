package com.hencoder.hencoderpracticedraw1.practice.model;

/**
 * Created by SeanZ on 2017/11/9.
 */

public class Data {

    public Data(String name, int number, int color) {
        this.name = name;
        this.number = number;
        this.color = color;
    }

    private String name;
    private int number;
    private int color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
