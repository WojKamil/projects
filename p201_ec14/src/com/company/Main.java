package com.company;

class Engine{
    public void start() {};
    public void stop() {};
    public void rev() {};
    public void service() {
        System.out.println("Engine service");
    };
}

class Wheel {
    public void inflate(int psi) {};
}

class Window {
    public void rollup() {};
    public void rolldown() {};
}

class Door {
    public Window window = new Window();
    public void Open() {};
    public void Close() {};
}

class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
    left = new Door(),
    right = new Door();
    public Car() {
        for (int i = 0; i < 4; i++){
            wheel[i] = new Wheel();
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car();
        car.left.window.rolldown();
        car.wheel[0].inflate(2);
        car.engine.service();
    }
}
