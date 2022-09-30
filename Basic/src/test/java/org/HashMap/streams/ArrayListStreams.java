package org.HashMap.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStreams {



public static void main (String [] args){
	
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(0);
	l.add(5);
	l.add(10);
	l.add(15);
	l.add(20);
	l.add(25);
	
	System.out.println(l);
	
	List<Integer> l2 =l.stream().filter(i->i%2==0).collect(Collectors.toList());
	
	System.out.print(l2);
	
	
	System.out.println("Hello World");
}
}
