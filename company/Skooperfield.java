package com.company;

public class Skooperfield extends Human {
    public Skooperfield (String name) {
        Name = name;
    }

    private class Hearing {
        public void talent() {
            System.out.println (Name + " обладал хорошим слухом!");
        }
    }

    public void hear() {
        class HeardThings {
            public void things(){
                System.out.println("Но " + Name + " ничего не слышал за пределами тюремной камеры");
            }
        }
        Hearing hearing = new Hearing();
        hearing.talent();
        HeardThings heardThings = new HeardThings();
        heardThings.things();
    }
    static String name = "Скуперфильд";
    public static class SkooperfieldActions implements PrisonerActions {
        public void wish() {
            System.out.println(name + " стал думать о различной вкусной еде, если бы он оказался в столовой");
        }
        public void happy() {
            System.out.println(name + " был счастлив, что не стал платить выкуп");
        }
        public void upset() {
            System.out.println("Однако, через пару минут " + name + " понял, что хочет очень сильно кушать");
        }
    }
}
