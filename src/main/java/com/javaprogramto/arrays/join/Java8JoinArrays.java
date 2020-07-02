package com.javaprogramto.arrays.join;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8JoinArrays {

    public static void main(String[] args) {
        String[] s1 = new String[]{"Aa", "Bb", "Cc"};
        String[] s2 = new String[]{"Dd", "Ee", "Ff"};
        String[] s3 = new String[]{"Gg", "Hh", "Ii"};

        //join object type array
        String[] result = Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
        System.out.println("String join : "+Arrays.toString(result));

        int[] int1 = new int[]{10, 20, 30};
        int[] int2 = new int[]{40, 50, 60};
        int[] int3 = new int[]{70, 80, 90};

        //join 2 primitive type array
        int[] result2 = IntStream.concat(Arrays.stream(int1), Arrays.stream(int2)).toArray();

        //join 3 primitive type array, any better idea?
        int[] result3 = IntStream.concat(Arrays.stream(int1),
                IntStream.concat(Arrays.stream(int2), Arrays.stream(int3))).toArray();

        System.out.println("Two Int array's join : "+Arrays.toString(result2));

        System.out.println("Three Int array's join : "+Arrays.toString(result3));
    }
}
