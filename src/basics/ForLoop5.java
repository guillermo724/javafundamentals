package basics;
//**
 //The problem that we are going to resolve
 // fan connected to a microcontroller
 //We have to program our microcontroller
 //in the following way:
 //1 wherenever the temperature is greater
 //than 40 degrees, turn on the fan
 //2 otherwise turn it off
 
 //Sep 24, 2026

public class ForLoop5 {

    public static void main(String[] args) {

        double temperature = 45.0;
        boolean fan;

        if (temperature > 40) {
            fan = true;
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Fan: ON");
        } else {
            fan = false;
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Fan: OFF");
        }
    }
}