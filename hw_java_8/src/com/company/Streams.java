package com.company;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Streams<T> {
    public static Stream of(List list) {
            return list.stream();
    }

    public Streams filter(List<? extends T> list) {
        return list.stream()
                .filter(p -> p.getAge() > 20);
    }

    public Streams transform(List<? extends T> list) {
        return list.stream()
                .map(p -> new Person(p.geAge() + 30));
    }

    public Map toMap(List<? extends T> list) {
        Map<String, T> map = new TreeMap<>();
        for(T i : list) {
            map.put(i.getName(), i);
        }
        return map;
    }
}
