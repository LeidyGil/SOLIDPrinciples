package com.automation.ispwrong;

public class RobotWorker implements IWorker {

    public void eat() {
        throw new UnsupportedOperationException();
    }

    public void work() {
        System.out.println("RobotWorker is working");

    }

    public void sleep() {
        throw new UnsupportedOperationException();
    }

}
