package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.Objects.compare;

public class CollectionUtils {
    private Object b;
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static<T> List newArrayList() {
        List<T> list = new ArrayList<T>();
        return list;
    }

    public static<T> int indexOf(List<? super T> source, T o) {
        return source.indexOf(o);
    }

    public static<T> List limit(List<? extends T> source, int size) {
        List<T> MyList = newArrayList();
        for(int i = source.size() - size; i < source.size(); i++ ) {
            MyList.add(source.get(i));
        }
        return MyList;
    }

    public static<T> void add(List source, T o) {
        source.add(o);
    }

    public static<T> void removeAll(List<? super T> removeFrom, List c2) {
        c2.removeAll(removeFrom);
    }

    public static<T> boolean containsAll(List<? super T> c1, List<? super T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? super T> c1, List<? super T> c2) {
        for(Object elem : c1) {
            if(c2.contains(elem))
                return true;
        }
        return false;
    }

    public static<T extends Comparable> List range(List<? extends T> list, T min, T max) {
        List<T> MyList = newArrayList();
        for(T elem : list) {
            if(elem.compareTo(min) >= 0 && elem.compareTo(max) <= 0)
                MyList.add(elem);
        }
        return MyList;
    }

    public static<T> List range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> MyList = newArrayList();
        for(T elem : list) {
            if(comparator.compare(elem, min) >= 0 && comparator.compare(elem, max) <= 0)
                MyList.add(elem);
        }
        return MyList;
    }
}

