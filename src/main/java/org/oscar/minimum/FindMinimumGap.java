package org.oscar.minimum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinimumGap {
    public String returnSmallestIntegerGap(int[] array) {
        List<Integer> arrayList = new ArrayList<>(array.length);
        for (int i : array) {
            arrayList.add(i);
        }
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if ((arrayList.get(i + 1) != arrayList.get(i) + 1) && (arrayList.get(i+1)!=arrayList.get(i))){
                return Integer.toString(arrayList.get(i) + 1);
            }
        }
        return "There are no integer gaps";

    }
}
