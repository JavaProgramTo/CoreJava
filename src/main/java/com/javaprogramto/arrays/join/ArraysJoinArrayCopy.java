package com.javaprogramto.arrays.join;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysJoinArrayCopy {

    public static void main(String[] args) {

        String[] s1 = new String[]{"Aa", "Bb", "Cc"};
        String[] s2 = new String[]{"Dd", "Ee", "Ff"};
        String[] s3 = new String[]{"Gg", "Hh", "Ii"};

        String[] result = joinArrayGeneric(s1, s2, s3);

        System.out.println(Arrays.toString(result));

        int[] int1 = new int[]{10, 20, 30};
        int[] int2 = new int[]{40, 50, 60};
        int[] int3 = new int[]{70, 80, 90};

        int[] result2 = joinArray(int1, int2, int3);

        System.out.println(Arrays.toString(result2));
    }

    /**
     * This works for all types of primitive and String as well as for wrapper classes.
     *
     * @param arrays
     * @param <T>
     * @return
     */
    static <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }

        //T[] result = new T[length];
        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);

        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }

    static int[] joinArray(int[]... arrays) {
        int length = 0;
        for (int[] array : arrays) {
            length += array.length;
        }

        final int[] result = new int[length];

        int offset = 0;
        for (int[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }

}
