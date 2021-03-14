package com.class13;

public class Dog {

	public String breed;
	public String size;
	public String color;
	public int age;
	
	public void bark() {
		System.out.println("ruff ruff");
	}
	
	public void sleep() {
		System.out.println("Zzzzzzzz.....");
	}
	
	public void eat() {
		
		for(int i=0; i<5; i++) {
			System.out.println("omnomnom");
		}
	}
	public void look() {
		System.out.println("Hi im a dog, my color is "+color);
	}
public static void main(String[] args) {
	Dog dog=new Dog();
	dog.breed="Husky";
	dog.size="Medium";
	dog.color="White";
	dog.age=10;
	dog.bark();
	dog.sleep();
	dog.eat();
	dog.look();
	
	Dog dog1=new Dog();
	dog.breed="Bulldog";
	dog.size="Large";
	dog.color="Grey";
	dog.age=5;
	dog.look();
	
	Dog dog2=new Dog();
	dog.breed="Labrador";
	dog.size="Extra Large";
	dog.color="Black";
	dog.age=2;
}
	


}
