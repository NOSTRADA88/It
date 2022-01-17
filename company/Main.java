package com.company;

import jdk.nashorn.internal.parser.Scanner;

import java.io.File;

public class Main {
    public static void main(String[] args) throws ExistException, ScenarioException {
        try {
            Lore lore = new Lore() {
                public void start() {
                    System.out.println("Старт истории!");
                }

                public void end() {
                    System.out.println("Конец истории!");
                }
            };
            lore.start();
            Skooperfield skooperfield = new Skooperfield("Скуперфильд");
            Skooperfield.SkooperfieldActions skooperfieldActions = new Skooperfield.SkooperfieldActions();
            Zhulio zhulio = new Zhulio("Жулио");
            Neznaika neznaika = new Neznaika("Незнайка");
            Fix fix = new Fix("Фикс");
            Kozlikom kozlikom = new Kozlikom("Козлик");
            Miga miga = new Miga("Мига");
            Car car = new Car("Жёлтый", zhulio);
            Policemen fakePolicemen = new Policemen();
            car.appear(Streets.SNAKESTREET);
            car.rush(Streets.DOGSTREET);
            car.stop();
            fakePolicemen.policemenOut();
            fakePolicemen.heroes();
            miga.policemenOut();
            kozlikom.policemenOut();
            neznaika.policemenOut();
            zhulio.policemenOut();
            miga.cameUp(House.GATES);
            miga.watched(House.GAP);
            miga.noticed(House.LIGHTS);
            miga.knocked(House.GATE);
            fix.opened(House.DOOR);
            fix.slapped(House.PATH);
            skooperfield.hear();
            skooperfieldActions.happy();
            skooperfieldActions.upset();
            skooperfieldActions.wish();
            skooperfieldActions.hungry();
            lore.end();
            String name = null;
            name.length();
        } catch (Exception e){
            System.err.println("Походу где ошибка 0-0: " + e.getMessage());
            throw new ScenarioException();
        } finally {
            System.out.println("Теперь точно конец...");
        }
    }
}
