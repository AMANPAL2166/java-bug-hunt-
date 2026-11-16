package com.amigoscode.bughunt.easy.bug01;

public class Greeter {

    public String greet(String name) {
        if(name == null){
            return "Hello, GUEST!";
        }
        return "Hello, " + name.toUpperCase() + "!";
    }
}
