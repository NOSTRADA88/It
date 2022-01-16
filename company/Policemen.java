package com.company;

public class Policemen extends Human implements Policeman{
    public void heroes() {
        System.out.println("Но это были наши герои:");
    }
    @Override
    public void policemenOut() {
        System.out.println("Из машины вышли 4 незнакомца с потайными фонариками и резиновыми электрическими дубинками в руках");
    }

}
