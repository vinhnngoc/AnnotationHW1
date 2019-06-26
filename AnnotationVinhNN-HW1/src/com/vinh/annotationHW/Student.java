package com.vinh.annotationHW;

public class Student {
	String name;
	int age;
	int score;
	
	@StudentAnnotation()
	static final String CLASSROOM="10A";
	
	@StudentAnnotation(name = "a", age = 18, score = 1 )
	void setName(String string) {
		this.name=string;
	}
	
	@StudentAnnotation(name = "b", age = 18, score = 2 )
	void setAge(int age) {
		this.age=age;
	}
	
	@StudentAnnotation(name = "c", age = 18, score = 2 )
	void setScore(int score) {
		this.score=score;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	
	int getScore() {
		return this.score;
	} 
	
}
