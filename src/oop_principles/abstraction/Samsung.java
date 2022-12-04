package oop_principles.abstraction;

public class Samsung extends Phone implements Camera, WiFi{


    public Samsung(){}

    @Override
    public void takesPhoto() {
        System.out.println("Samsung way of taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Samsung way of recording video");
    }
    public Samsung(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }
@Override
    public void call() {
        System.out.println("Samsung way of call");
    }

    @Override
    public void connect() {
        System.out.println("Samsung way to connect");
    }

    @Override
    public void text() {
        System.out.println("Samsung way of text");

    }


}
