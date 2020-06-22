package com.epam.JavaLambdaAndStreams;
import java.util.*;
import java.util.stream.Collectors;

public class Lambda2 {
	public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("abcd");
        list.add("aaa");
        list.add("adt");
        list.add("aap");

        list = find(list);

        for(String i : list)
            System.out.println(i);
    }

    static List<String> find(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
}
