package com.anupama.sinha;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	String name;
	int reviewScore;

	public String getName() {
		return name;
	}

	public Course(String name, int reviewScore) {
		super();
		this.name = name;
		this.reviewScore = reviewScore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;                                                                                                                                                                
	             }

	@Override
	public String toString() {
		return "Course [name=" + name + ", reviewScore=" + reviewScore + "]";
	}
}

public class FunctionalProgrammingDemo {
	public static void main(String[] args) {
		List<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Java", 97));
		courses.add(new Course("API", 97));
		courses.add(new Course("Spring", 98));
		courses.add(new Course("API", 92));
		courses.add(new Course("Microservices", 95));
		
		//If below is multi-line, then introduce method
		Predicate<Course> predicateCondition = course -> course.getReviewScore() > 96;
		
		//Custom Classes Predicates
		System.out.println(courses.stream().allMatch(predicateCondition));
		System.out.println(courses.stream().noneMatch(predicateCondition));
		System.out.println(courses.stream().anyMatch(predicateCondition));
		
		Comparator<Course> predicateSort = Comparator.comparingInt(Course::getReviewScore).reversed().thenComparing(Course::getName);
		System.out.println(courses.stream().distinct().filter(course -> course.getReviewScore() > 95).sorted(predicateSort).limit(5).skip(1).collect(Collectors.toList()));
		System.out.println(courses.stream().distinct().filter(course -> course.getReviewScore() > 95).sorted(predicateSort).max(predicateSort).orElse(new Course("Microservices", 95)));
		System.out.println(courses.stream().distinct().filter(course -> course.getReviewScore() > 95).mapToInt(Course::getReviewScore).average());
	
	}

}
