package com.company;

// default method
/*
>> An interface can have static and default methods.
>> Default methods enable us to add new functionality to existing interfaces.
>> A class implementing the interface need not implement the default methods.
*/

interface Camera{
    void takeSnap();
    void recordVideo();
    // we can use private method in interface, that can only be usable in the interface
    private void greet(){
        System.out.println("Welcome");
    }
    default void openScreen(){
        greet(); // private method; only usable in this interface
        System.out.println("Opening...");
    }
    default void slowMo(){
        System.out.println("Recording Slow motion video...");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNet(String net);
}

class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class touchPhone extends myCellPhone implements Wifi,Camera{

    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting Networks");
        String[] net = {"#221B Baker Street","My Wifi","Tp-Link"};
        return net;
    }

    @Override
    public void connectToNet(String net) {
        System.out.println("Connecting to "+ net);
    }
    @Override
    public void slowMo(){ // ovarriding the default slowMo method from "Camera" interface
        System.out.println("Taking slow mo with android...");
    }
}

public class J35_Interface_Smartphone {
    public static void main(String[] args) {
        touchPhone myPhone = new touchPhone();

        // myPhone.greet() --> throws an error

        myPhone.openScreen(); // calling default method
        String[] networks = myPhone.getNetworks();
        for(String a : networks){
            System.out.print(a+" ");
        }
        System.out.println("");
        myPhone.slowMo(); // calling default method that already overridden in "touchPhone" class from "Camera" interface
    }
}
