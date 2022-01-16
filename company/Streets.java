package com.company;

public enum Streets {
    DOGSTREET ("по Большой Собачей улице"),
    SNAKESTREET ("в Змеином переулке");

    private String value;

    Streets (String val) {
        value = val;
    }
    public String getValue() {
        return value;
    }


}
