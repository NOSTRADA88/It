package com.company;

public class Miga extends Policemen implements HeroActions{
    Miga (String name) {
        Name = name;
    }
    public void policemenOut() {
        System.out.println(Name);
    }
    @Override
    public void cameUp(House h) {
        System.out.print(Name + " подошёл " + h.getValue());
    }
    public void watched(House h) {
        System.out.print(", посмотрел " + h.getValue() + " и,");
    }
    public void noticed(House h) {
        System.out.print(" заметив " + h.getValue() + " ,");
    }
    public void knocked(House h) {
        System.out.println(" принялся громко стучать дубинкой " + h.getValue());
    }
}
