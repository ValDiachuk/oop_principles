package oop_principles.abstraction;

public class iPhone extends Phone implements Camera, WiFi{

    public iPhone(){}
    public iPhone(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone way of call");
    }

    @Override
    public void text() {System.out.println("Samsung way of call");
        }

        @Override
        public void takesPhoto() {
            System.out.println("iPhone way of recording video");
        }

    @Override
    public void connect() {
        System.out.println("iPhone way connecting WiFi");
    }

    @Override
        public void recordVideo() {
            System.out.println("iPhone way record video");

    }
}
