package org.HashMap.streams;

public class AddressDetails {

int adId;
String streetName;

public int getAdId() {
	return adId;
}

public void setAdId(int adId) {
	this.adId = adId;
}

public String getStreetName() {
	return streetName;
}

public void setStreetName(String streetName) {
	this.streetName = streetName;
}

@Override
public String toString() {
	return "AddressDetails{" +
			       "adId=" + adId +
			       ", streetName='" + streetName + '\'' +
			       '}';
}
}
