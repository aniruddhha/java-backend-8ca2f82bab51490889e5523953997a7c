package oop;

public interface GpsListener {
    float[] locate();

    // java 8 says, interface can have default methods
    default boolean checkLocation() {
        return locate().length == 2;
    }
}
