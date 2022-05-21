package com.company;

import java.util.Scanner;

@FunctionalInterface
interface Convert<T,N>{
    N convert(T t);
    static <T> boolean isNotNull(T t){
        return  t != null;
    }
}

class One{
    int a, b, c;
    public One( int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int ccc() {
        if(b==0){
            return 0;
        }
        else{
            return (int) Math.pow(b, c) * a;
        }
    }
}

class Two{
    int a, b, c;
    public Two( int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int ccc() {
        if(b==0){
            return 0;
        }
        else{
            return (int) Math.pow(b, c) * a;
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        One one = new One(in.nextInt(), in.nextInt(), in.nextInt());
        Convert<One,Two> convert = x -> new Two(x.a, x.b, x.c);
        Two two = convert.convert(one);
        System.out.println(two.ccc());
    }
}
