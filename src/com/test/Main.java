package com.test;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String t = "vot когда tak что-то чего-vot вот так вот -hello";
        Stream.of(t.split(" ")).filter(e->e.matches("[а-я-]+")).forEach(e-> System.out.print(e+" "));// когда что-то вот так вот 
    }
}
