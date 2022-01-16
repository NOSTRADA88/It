package com.company;

public interface HeroActions {
    default void cameUp(House h){
        System.out.println("Nothing");};
    default void watched(House h){
        System.out.println("Nothing");
    }
    default void noticed(House h){
        System.out.println("Nothing");
        }
    default void knocked(House h){
        System.out.println("Nothing");
    }
    default void opened(House h){
        System.out.println("Nothing");
    }
    default void slapped(House h){
        System.out.println("Nothing");
    }

}
