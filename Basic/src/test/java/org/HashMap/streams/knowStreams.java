package org.HashMap.streams;

import org.HashMap.Transaction;

import java.util.stream.Stream;

public class knowStreams {

private static Transaction[]  listOfTransactions = {
		new Transaction("List11", "list111", "21111"),
		new Transaction("List12", "list112", "22222"),
		new Transaction("List13", "list113", "23333"),
		new Transaction("List14", "list114", "24444"),
		new Transaction("List15", "list115", "25555"),
		new Transaction("List16", "list116", "266666")
};

public static void main (String [] args){
	System.out.println(" Hello world 123");
	
	Stream.of(listOfTransactions);
	
	
	System.out.println(" Hello world 123 After");
}
}
