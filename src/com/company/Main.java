package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        CountMap<Integer> map1 = new CountMap<>();
        map1.add(10);
        map1.add(10);
        map1.add(5);
        map1.add(6);
        map1.add(5);
        map1.add(10);
        System.out.println(map1.getCount(5));  // 2
        System.out.println(map1.getCount(6));  // 1
        System.out.println(map1.getCount(10)); // 3
        System.out.println(map1.size()); // 3
    }
}
