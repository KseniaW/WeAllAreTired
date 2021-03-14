package com.class13;

public class Account {
String userName;
String password;
double balance;
String accountNumber;
boolean isLoggedIn;

public void login(String passedUserNameWhenLogging, String PassedPassword) {
	if(userName.equals(passedUserNameWhenLogging)&& password.equals(PassedPassword)) {
		System.out.println("Welcome to BOA, your balance is "+balance);
	}else {
		System.out.println("Username or password is not correct");
	}
}
public void printInfo() {
	if(isLoggedIn) {
		System.out.println("Your account number is "+accountNumber+
				" your balance is "+balance);
	}
}
}
