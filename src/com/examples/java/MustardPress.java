package com.examples.java;

import com.examples.java.model.Mustard;

import java.util.List;

/**
 * Created by diwakarsharma on 1/11/19.
 */
public class MustardPress {
   Mustard o;
    int totalOil=0;
    public int getOil(List<Mustard>mustards){
        for(Mustard o :mustards){
            System.out.println(o.getName());
            totalOil += o.crush();

        }

        return totalOil;
    }
}

