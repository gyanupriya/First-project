package com.mycompany.app;

/**
 * Hello Everyone..Gyanu Here!
 */
public class App
{

    private final String message = "Hello Everyone..Gyanu Here!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
