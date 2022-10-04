package org.HashMap.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

public static void  main(String[] args){
	
	System.out.println("Hello World");
	
	// create a list an ffilter all even numbers from list
	
	List<Integer> list1 = List.of(2,4,9,50, 21, 22, 67); // This becomes an immutable list
	//list1.add(45); // since it is immutable, this is not allowed
	
	List<Integer> list2 = new ArrayList<>(); // this creates modifiable list
	list2.add(2);
	list2.add(4);
	list2.add(9);list2.add(50);list2.add(21);
	list2.add(22); list2.add(67);
	
	List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);
	
	List<Integer> listEven = new ArrayList<>();
	
	// without using streamAPI
	for(Integer i: list1){
		if(i %2 ==0) {listEven.add(i);}
	}
	System.out.println(listEven);
	
	// Using Stream API
	Stream<Integer> myIntStream = list1.stream();
	System.out.println("Last Result");
	System.out.println(myIntStream.filter(x->x%2==0).collect(Collectors.toList()));
	myIntStream.close();
	
	Stream<Integer> myIntStream2 = list1.stream();
	System.out.println(myIntStream2.filter(x->x>50).collect(Collectors.toList()));
	
}
}
