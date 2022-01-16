package com.company;

public enum House {
    GATES("к воротам"), // Ворота
    GAP("в щель"),
    LIGHTS("свет в окнах дома"),
    DOOR("Дверь"),
    PATH("по тропинке"),
    GATE("в калитку"); // калитка

    private String value;

    House (String val) {
        value = val;
    }
    public String getValue() {
        return value;
    }

}
