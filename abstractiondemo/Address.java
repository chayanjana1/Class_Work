package abstractiondemo;

public class Address {
int pinCode;
String city,country,state;
public Address(int pinCode, String city, String country, String state) {
	super();
	this.pinCode = pinCode;
	this.city = city;
	this.country = country;
	this.state = state;
}
//it can have more methods
public int getPinCode() {
	return pinCode;
}
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

}
