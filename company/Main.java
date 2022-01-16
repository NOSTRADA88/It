package com.company;
public class Main {
    public static void main(String[] args) {
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
    }
}
