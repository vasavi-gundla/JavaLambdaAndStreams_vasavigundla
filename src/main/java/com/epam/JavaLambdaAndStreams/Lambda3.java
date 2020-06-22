package com.epam.JavaLambdaAndStreams;
import java.util.*;
import java.util.stream.IntStream;
public class Lambda3 {
	 public static void main(String args[])
	    {
	        List<String> list = new ArrayList<>();
	        list.add("abcd");
	        list.add("aaa");
	        list.add("adbbda");
	        list.add("apa");

	        list = palindrome(list);

	        System.out.println("Palindromes :-");
	        for(String i : list)
	            System.out.println(i);
	    }

	    static List<String> palindrome(List<String> list)
	    {
	        List<String> l=new ArrayList<>();
	        for(String i : list)
	        {String t = i.replaceAll("\\s+", "").toLowerCase();
	            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
	                l.add(i);}
	        return l;
	    }
}
