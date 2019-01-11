package com.examples.java.model;

/**
 * it shows how to use enum
 * Created by diwakarsharma on 1/11/19.
 */
public enum MustardName {
 RockMustard ("Rock mustard"), RedMustard("Red mustard");

 private String name;

 MustardName( String name){
     this.name= name;
 }

    @Override
    public String toString() {
        return name;
    }
}
