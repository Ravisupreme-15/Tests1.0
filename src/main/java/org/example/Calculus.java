package org.example;

public class Calculus {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }

    public static int power(int a, int b) {
        int ans=1;
        for(int i=1;i<=b;i++){
            ans*=a;
        }
        return ans;
    }

    public static int max(int a, int b) {
        return Math.max(a,b);
    }
}
