package com.ani.rest.basics.domain;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int speed;
    private boolean isFwd;
    private List<String> parts = new ArrayList<>();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isFwd() {
        return isFwd;
    }

    public void setFwd(boolean fwd) {
        isFwd = fwd;
    }

    public List<String> getParts() {
        return parts;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }
}
