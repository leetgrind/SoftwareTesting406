package org.example;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private final Map<Integer, Integer> memo = new HashMap<>();

    //0, 1, 1, 2, 3, 5, 8, 13, 21
    public int calculate(int n) {

        if(n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        if( n<= 1) {
            return n;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = calculate(n-1) + calculate(n-2);

        memo.put(n, result);

        return result;
    }

}
