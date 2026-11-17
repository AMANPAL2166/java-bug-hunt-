package com.amigoscode.bughunt.easy.bug05;

public class Factorial {

    public long factorial(int n) {
        if(n <2){
            return n;
        }
        long fact = 1;
        for(int i = 2;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}
