package org.HashMap.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {

public static void  main(String [] args){
	System.out.println("Hellow World 2");
	
	// Stream API - collection process
	// Collection/ group of object
	
	// Stream is an Interface
	//1 - blank
	Stream<Object> emptyStream = Stream.empty();
	String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};
	
	Stream<String> stream1= Stream.of(names);
	System.out.println("Last output");
	//System.out.println(
	//Arrays.stream(names).filter(x->x.startsWith("D")).collect(Collectors.toList()));
	List<Integer> listLearn = new ArrayList<>();
	
	stream1.forEach(e->{System.out.println(e);});
	
}
}
