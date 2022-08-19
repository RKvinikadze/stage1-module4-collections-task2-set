package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> res = new TreeSet<>();
        for (int x: sourceList)
            res.add(x * x);

        return res.subSet(lowerBound, upperBound + 1);
    }
}
