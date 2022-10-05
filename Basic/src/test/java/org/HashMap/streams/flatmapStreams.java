package org.HashMap.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapStreams {

public static void main(String [] args){
	
	System.out.println("Hello World Flat map");
	
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	Employee e3 = new Employee();
	
	AddressDetails ad1 = new AddressDetails();
	AddressDetails ad2 = new AddressDetails();
	AddressDetails ad3 = new AddressDetails();
	AddressDetails ad4 = new AddressDetails();
	AddressDetails ad5 = new AddressDetails();
	AddressDetails ad6 = new AddressDetails();
	AddressDetails ad7 = new AddressDetails();
	
	ad1.setAdId(101);
	ad1.setStreetName("IIT Kanpur");
	
	ad2.setAdId(102);
	ad2.setStreetName("IIT Bombay");
	
	ad3.setAdId(103);
	ad3.setStreetName("IIT Madras");
	
	ad4.setAdId(104);
	ad4.setStreetName("IIT Delhi");
	
	ad5.setAdId(105);
	ad5.setStreetName("IIT Kharagpur");
	
	ad6.setAdId(106);
	ad6.setStreetName("IIT Roorkee");
	
	ad7.setAdId(107);
	ad7.setStreetName("IIT BHU");
	
	e1.setEmpID(1);
	e1.setEmpName("Professor");
	e1.setAddressList(Arrays.asList(new AddressDetails[]{ad1, ad2}));
	
	e2.setEmpID(2);
	e2.setEmpName("Walter White");
	e2.setAddressList(Arrays.asList(new AddressDetails[]{ad3, ad4}));
	
	e3.setEmpID(3);
	e3.setEmpName("Michael Scofield");
	e3.setAddressList(Arrays.asList(new AddressDetails[]{ad5, ad6, ad7}));
	
	//System.out.println(e1);
	List<Employee> listOfEmployee = new LinkedList<Employee>();
	listOfEmployee.add(e1);
	listOfEmployee.add(e2);
	listOfEmployee.add(e3);
	
	//System.out.println(listOfEmployee);
	
	//List<String> listOfStreet = getStreetName(listOfEmployee);
	//System.out.println(listOfStreet);
	
	/**** Traditional Way - Without Streams API ****/
	List<String> streetName = new ArrayList<>();
	for (Employee e: listOfEmployee){
		for (AddressDetails ad: e.getAddressList()){
		streetName.add(ad.getStreetName());}
	}
	System.out.println(streetName);
	
	List<String> streetNameNew = listOfEmployee.stream().map(e->e.getAddressList()).flatMap(adl->adl.stream()).map(ad->ad.getStreetName()).collect(Collectors.toList());
	
	System.out.println("Latest Result");
	System.out.println(streetNameNew);
}


}
