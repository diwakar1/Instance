package com.examples.java;

import com.examples.java.model.MustardName;
import com.examples.java.model.Mustard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mustard> olives = new ArrayList<>();

        olives.add(new Mustard(MustardName.RockMustard,0x2E0854,3));
        olives.add(new Mustard(MustardName.RockMustard,0x2E0854,3));
        olives.add(new Mustard(MustardName.RedMustard,0x2E0854,3));
        olives.add(new Mustard(MustardName.RedMustard,0x2E0854,2));
        olives.add(new Mustard(MustardName.RedMustard,0x2E0854,2));

        MustardPress olivePress = new MustardPress();
        int totalOil = olivePress.getOil(olives);
        System.out.println("Total mustard oil  is : "+ totalOil);

    }
}
