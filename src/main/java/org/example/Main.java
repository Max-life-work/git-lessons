package org.example;

public class Main {
    public static void main(String[] args) {
        Service firstService = new Service("First service");
        firstService.action();
        firstService.think();
        firstService.sleep();
    }
}