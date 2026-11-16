package com.amigoscode.bughunt.easy.bug02;

public class Summer {

    public int sum(int[] numbers) {
        if(numbers.length == 0) return 0;
        int total = 0;
        for (int i : numbers) {
            total += i;
        }
        return total;
    }
}
