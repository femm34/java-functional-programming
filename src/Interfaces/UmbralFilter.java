package Interfaces;

@FunctionalInterface
public interface UmbralFilter<T> {
    boolean isValid(int x, int u );
}
