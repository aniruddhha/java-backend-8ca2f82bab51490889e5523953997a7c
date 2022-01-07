package oop;

public class Tiger extends Animal implements GpsListener {

    @Override
    public String walk() {
        return "Tiger is walking";
    }

    @Override
    public float[] locate() {
        return new float[]{17.82f, 72.85f};
    }
}
