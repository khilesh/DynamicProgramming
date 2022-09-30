package org.HashMap.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStreams {

public static void main(String [] args) throws IOException {
	
	System.out.println("Hello world to Streams");
	IntStream.     // Source
			               range(-10, 10). //Intermediate operation
					                               forEach(x -> System.out.println("1 ::" + x)); // Terminal Operation
	
	
	System.out.println("2 ::" +
			                   IntStream.
					                   range(1, 5).
					                   sum());
	
	Stream.of("Ava", "Aneri", "Alberto", "Abhishek", "AAkansha").
			sorted().
			findFirst().ifPresent(System.out::println);
	
	String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
	
	Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

// 6. Finding average of squares of an int array

	int [] inputIntArray = {2,3,4,5,6,7,8};

	Arrays.stream(inputIntArray).map(x->x*x).average().ifPresent(System.out::println);
	
	// 7. Stream from list, filter & print.
	
	
	/***
	 * List<String> people=  new ArrayList<>() ;
	people.add("Al"); people.add("Ankit"); people.add("Kushal"); people.add("Brent");
	people.add("Sarika"); people.add("amanda"); people.add("Hans"); people.add("Shivika");
	people.add("Sarah");
	**/
	
	List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
	
	people.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).forEach(System.out::println);
	
	Stream<String> bands = Files.lines(Paths.get("/Users/KHILESH/Documents/GitHub/DynamicProgramming/Basic/files/bands.txt"));
	bands.
			filter(x->x.length() > 13).sorted().
			forEach(System.out::println);
	
	Stream<String> bands2 = Files.lines(Paths.get("/Users/KHILESH/Documents/GitHub/DynamicProgramming/Basic/files/bands.txt"));
	
	
	//bands2.filter(x->x.contains("ege")).collect(Collectors.toList()).forEach(x-> System.out.println(x));
	bands2.filter(x->x.contains("jit")).collect(Collectors.toList()).forEach(System.out::println);
	
	Stream<String> rows1 = Files.lines(Paths.get("/Users/KHILESH/Documents/GitHub/DynamicProgramming/Basic/files/data.txt"));
	int rowCount = (int) rows1.map(x->x.split(",")).filter(x->x.length ==3).count();
	
	System.out.println("rowCount ::" + rowCount);
	
	
	System.out.print("Last result");
	Stream<String> rows2 = Files.lines(Paths.get("/Users/KHILESH/Documents/GitHub/DynamicProgramming/Basic/files/data.txt"));
	rows2.map(x->x.split(",")).filter(x->x.length ==3).filter(x->Integer.parseInt(x[1])>15).forEach(x->System.out.println(x[0] + " " + x[1] + " " + x[2]));
	rows2.close();
	
	
	System.out.print("Last result");
	Stream<String> rows3 = Files.lines(Paths.get("/Users/KHILESH/Documents/GitHub/DynamicProgramming/Basic/files/assessment.txt"));
	rows2.map(x->x.split(",")).
			filter(x->x.length ==3).
			count(x->x[1])
			//filter(x->Integer.parseInt(x[1])>15).forEach(x->System.out.println(x[0] + " " + x[1] + " " + x[2]));
	rows2.close();
	
	
	
}
}
