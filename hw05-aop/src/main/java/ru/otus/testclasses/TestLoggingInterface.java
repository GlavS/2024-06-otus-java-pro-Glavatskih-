package ru.otus.testclasses;

public interface TestLoggingInterface {
    void calculate(String info);

    void calculate(int first, String info);

    void calculate(int first, int second, String info);
}
