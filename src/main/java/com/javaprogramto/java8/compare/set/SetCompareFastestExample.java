package com.javaprogramto.java8.compare.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCompareFastestExample {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(20);
        set1.add(35);
        set1.add(14);
        set1.add(05);

        System.out.println("Set 2 values : " + set1);

        Set<Integer> set2 = new HashSet<>();

        set2.add(1);
        set2.add(05);
        set2.add(14);
        set2.add(20);
        set2.add(35);

        set2.add(45);

        System.out.println("Set 2 values : " + set2);

        // Method 1: Using equals() method
        boolean isEquals = set1.equals(set2);
        System.out.println("Comparing in different ways ");
        System.out.println("Way 1 with equals :: " + isEquals);

        // Method 2: Using containsALl()
        boolean havingAll = set1.containsAll(set2);
        System.out.println("Way 2 with containsAll :: " + havingAll);

        // Method 3: Using removeAll()
        boolean removedAll = set1.removeAll(set2);
        System.out.println("Way 3 with removeAll :: " + removedAll);

        // Method 4: Using TreeSet
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(1);
        treeSet1.add(20);
        treeSet1.add(35);
        treeSet1.add(14);
        treeSet1.add(05);

        TreeSet<Integer> treeSet2 = new TreeSet<>(set2);

        System.out.println("TreeSet 1 values are : "+treeSet1);
        System.out.println("TreeSet 2 values are : "+treeSet2);
        boolean isEqualsWithTreeSet = treeSet1.equals(treeSet2);
        System.out.println("Way 4: Equals comparision with tree map : "+isEqualsWithTreeSet);


    }
}
