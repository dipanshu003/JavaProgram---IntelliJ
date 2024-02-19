package com.CoreJava_CW.FunctionalInterface.pr1;

public interface FunctionalInterfacePr1 {
    int min(int a,int b);

    public static void main(String[] args) {
        FunctionalInterfacePr1 f = (a1,b1) -> {
            return a1-b1;
        };


        System.out.println(f.min(2,1));
    }
}
