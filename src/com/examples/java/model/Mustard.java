package com.examples.java.model;

/**
 * Created by diwakarsharma on 1/11/19.
 */
public class Mustard {

    private MustardName name = MustardName.RockMustard;
    private long color = 0x2E0854;
    private int oil = 3;


    public Mustard(MustardName name, long color, int oil){
        this.name =name;
        this.color = color;
        this.oil = oil;
    }

    public Mustard(){

    }

    public MustardName getName() {
        return name;
    }

    public void setName(MustardName name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
