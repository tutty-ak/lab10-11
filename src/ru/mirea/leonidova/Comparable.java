package ru.mirea.leonidova;

public interface Comparable<T> {
    default int compareTo(T o) {
        return 0;
    }
}
