package com.java.collection.framework.comparable.comparator;

public class Students implements Comparable<Students> {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Students(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}

	public int compareTo(Students students) {
		if (this.age > students.age)
			return 1;
		else if (this.age == students.age)
			return 0;
		else
			return -1;
	}

}
