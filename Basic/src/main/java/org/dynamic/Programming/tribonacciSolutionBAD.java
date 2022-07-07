package org.dynamic.Programming;

import java.util.HashMap;


/**
 * Simple recursion like tribonacci(k) = tribonacci(k - 1) + tribonacci(k - 2) + tribonacci(k - 3) is out of consideration here
 * because it will result in exponential time complexity 3^N3 N
 */
public class tribonacciSolutionBAD {
    //data structure for memo
    private static final HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public static int tribonacci(int n) {

        memo.put(0, 0);
        memo.put(1, 1);
        memo.put(2, 1);

        //relation
        memo.put(n, tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3));

        return memo.get(n);

    }

    public static void main(String[] args) {

        System.out.println("Hello Khilesh");

        System.out.println("Hello Khilesh with output " + tribonacci(4));
    }
}
