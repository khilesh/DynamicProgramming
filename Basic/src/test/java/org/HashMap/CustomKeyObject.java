package org.HashMap;

import java.util.HashMap;

/***
 * If we wish to create a HashMap of our own class, we need to ensure that the hashcode() of the key of HashMap
 * doesn’t change as if it happens then it is impossible to get object value of the key from HashMap.
 * On runtime, JVM processes hash code for each object and give it on interest. When we alter an objects’ state,
 * JVM calculates its hash code again which may result in memory leak. To make things work what we have to do is
 * make sure that state change for a key object does not change the hash code of object i.e. the key must have
 * properly overridden equals() and hashcode() methods for it to work correctly.
 *
 * One of the ways of doing this is by making key objects IMMUTABLE. Immutability allows you to get same
 * hashcode every time, for a key object. This is the primary motivation behind why Immutable classes like
 * String, Integer or other wrapper classes are a decent key object applicant
 *
 *
 *
 * **/


public class CustomKeyObject {

public static void main(String[] args){
	
	System.out.println("Hello World");
	
	HashMap<Transaction, String> myHashMap = new HashMap<>();
	
	Transaction noValues = new Transaction();
	Transaction one = new Transaction("one", "R1", "1111");
	Transaction two = new Transaction("two", "R2", "2222");
	Transaction three = new Transaction("three", "R3", "3333");
	Transaction four = new Transaction("four", "R4", "4444");
	Transaction five = new Transaction("five", "R5", "5555");
	Transaction six = new Transaction("six", "R6", "6666");
	Transaction seven = new Transaction("seven", "R7", "7777");
	Transaction eight = new Transaction("eight", "R8", "8888");
	Transaction nine = new Transaction("nine", "R9", "9999");
	Transaction ten = new Transaction("ten", "R10", "1010");
	
	myHashMap.put(one, one.getSender_user_id());
	myHashMap.put(two, two.getSender_user_id());
	myHashMap.put(three, three.getSender_user_id());
	myHashMap.put(four, four.getSender_user_id());
	myHashMap.put(five, five.getSender_user_id());
	myHashMap.put(six, six.getSender_user_id());
	myHashMap.put(seven, seven.getSender_user_id());
	myHashMap.put(eight, eight.getSender_user_id());
	myHashMap.put(nine, nine.getSender_user_id());
	myHashMap.put(ten, ten.getSender_user_id());
	
	/***
	 * changing key state so that hashcode() should be calculated again
	 */
	//one.setSender_user_id("Updated User ID for 1");
	//three.setSender_user_id("Updated USER ID For 3");
	
	
	System.out.println(myHashMap.get(two));
	System.out.println(myHashMap.get(three));
}
}
