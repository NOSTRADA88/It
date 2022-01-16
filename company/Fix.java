package com.company;

public class Fix extends Human implements HeroActions {
    public Fix (String name) {
        Name = name;
    }
    public void opened(House h) {
        System.out.println(h.getValue() + " в доме открылась");
    }
    public void slapped(House h) {
        System.out.println("Из неё вышел " + Name + " с ружьём и зашлёпал " + h.getValue());
    }

}
