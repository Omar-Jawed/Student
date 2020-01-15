package ca.sheridancollege.week1.softwarefundamentals;

public class student {
	private String name;
	private int age;

	public void student(String name, int num) {
		this.name = name;
		this.age = num;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
