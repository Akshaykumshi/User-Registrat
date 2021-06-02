package webapp;

public class Person {
String username;
String name;
String password;
String address;
String phno;
String DOB;

Person(String username,String password,String name,String address,String phno,String DOB)
{
	this.username=username;
	this.password=password;
	this.name=name;
	this.address=address;
	this.phno=phno;
	this.DOB=DOB;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhno() {
	return phno;
}

public void setPhno(String phno) {
	this.phno = phno;
}

public String getDOB() {
	return DOB;
}

public void setDOB(String dOB) {
	DOB = dOB;
}
	

}
