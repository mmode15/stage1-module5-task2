package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List<Integer> result = new ArrayList<>();
        Operation<Integer> operation = (x) ->{
            for(Integer e : x){
               result.add(e/divider);
            }
            return  result;
        };
        return  operation;
    }
}
