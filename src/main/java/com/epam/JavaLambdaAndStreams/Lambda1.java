package com.epam.JavaLambdaAndStreams;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Lambda1 {
	 public static void main(String args[])
	    {
	        IntStream stream = IntStream.of(10,20,30,40,50,60,70,80,90);
	        OptionalDouble obj = stream.average();
	        if(obj.isPresent())
	        {
	            System.out.println("Average :- " + obj.getAsDouble());
	        }
	        else
	        {
	            System.out.println(-1);
	        }
	    }	

}
