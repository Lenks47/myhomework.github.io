package Exp15;

public class Animal {
	private String name; 
	private int Age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		Age = age;
	}
	
	public Animal() {
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void eat(){
		System.out.println("我是动物，我要吃东西"); 
	}
}
