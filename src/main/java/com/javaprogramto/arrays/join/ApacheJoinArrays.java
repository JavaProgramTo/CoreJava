package com.javaprogramto.arrays.join;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ApacheJoinArrays {
    public static void main(String[] args) {

        String[] s1 = new String[]{"hello", "boss", "welcome"};
        String[] s2 = new String[]{"nice", "to", "meet", "you", "today"};

        String[] stringArray = ArrayUtils.addAll(s1, s2);

        System.out.println(Arrays.toString(stringArray));

        int [] salary1 = new int[]{1,2,3};
        int[] salary2 = new int[]{4,5,6};

        int[] intMergedArray = ArrayUtils.addAll(salary1, salary2);

        System.out.println(Arrays.toString(intMergedArray));

    }
}
