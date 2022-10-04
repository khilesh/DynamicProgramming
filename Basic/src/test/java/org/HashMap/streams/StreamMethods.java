package org.HashMap.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {


public static void main(String [] args){
	
	System.out.print("Hello World 123");
	
	List<Integer> myIntegerArrayList = new ArrayList<>();
	myIntegerArrayList.add(2);
	myIntegerArrayList.add(21);
	myIntegerArrayList.add(12);
	myIntegerArrayList.add(234);
	myIntegerArrayList.add(34);
	myIntegerArrayList.add(45);
	myIntegerArrayList.add(78);
	myIntegerArrayList.add(67);
	
	List<String> myStringList = new ArrayList<>();
	myStringList.add("Aman"); myStringList.add("Ankit");myStringList.add("Abhinav");
	myStringList.add("Durgesh");myStringList.add("Abhishek");
	
	Stream<String> myStringStream = myStringList.stream();
	//Question: to find out names starting with "A"
	System.out.println(myStringStream.filter(x->x.startsWith("A")).collect(Collectors.toList()));
	
	Stream<Integer> myIntegerStream = myIntegerArrayList.stream();
	//Question: to find out squares of every integer
	System.out.println(myIntegerStream.sorted().map(x->x*x).collect(Collectors.toList()));
}
}
