package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new HashSet<>();

        for (int x: sourceList){
            if (x % 2 != 0){
                res.add(x);
                res.add(x * 2);
            }else{
                int k = x;
                while (k % 2 != 1){
                    res.add(k);
                    k /= 2;
                }
                res.add(k);
            }
        }

        return res;
    }
}
