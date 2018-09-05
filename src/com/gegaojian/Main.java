package com.gegaojian;

import java.util.List;

public class Main {

    static void prettyPrintApple(List<Apple> apples, AppleFormater appleFormater){
        for (Apple apple : apples
             ) {
            System.out.println(appleFormater.accept(apple));
        }
    }

    public static void main(String[] args) {
	// write your code here
        Thread thread = new Thread(()->{});
        Runnable runnable = ()->{};
        Apple apple = new Apple();
        AppleFormater appleFormater = (Apple apple1)->"nihao";
        AppleFormater appleFormater1 = (Apple apple1)->{return "nihao";};
        AppleFormater appleFormater2 = (Apple apple1)->{return "nihao";};
    }
}
