package com;
class Animal
{
	int legs;
	String name;
	String color;

public Animal()
{
	System.out.println("This is default constructor");
}
public Animal(String name) {
	this();
	this.name = name; 
}
public Animal(String name, String color) {
	this(name);
	this.color = color;
}
public Animal(int legs, String name, String color) {
	this(name,color);
	this.legs=legs;
}
void display()
{
	System.out.println("Animal Description: ");
	System.out.println(color+" "+name+" "+"with"+" "+" "+legs+" "+"legs");
}
}

public class AniConstructor {

	public static void main(String[] args) {
		Animal obj1 = new Animal("Dog","Black");
		obj1.display();
		
		Animal obj2 = new Animal("Dog","Black");
		obj2.display();
	}

}
