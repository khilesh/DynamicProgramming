package org.HashMap.streams;

import java.util.List;

public class Employee {

int empID;
String empName;
List<AddressDetails> addressList;

public int getEmpID() {
	return empID;
}

@Override
public String toString() {
	return "Employee{" +
			       "empID=" + empID +
			       ", empName='" + empName + '\'' +
			       ", addressList=" + addressList +
			       '}';
}

public void setEmpID(int empID) {
	this.empID = empID;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public List<AddressDetails> getAddressList() {
	return addressList;
}

public void setAddressList(List<AddressDetails> addressList) {
	this.addressList = addressList;
}
}
