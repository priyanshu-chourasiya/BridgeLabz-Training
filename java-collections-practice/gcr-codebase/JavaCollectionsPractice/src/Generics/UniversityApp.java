package Generics;

import java.util.*;

abstract class CourseType {
    private final String title;
    CourseType(String title) {
    	this.title = title; 
    	}
    public String getTitle() { 
    	
    	return title; 
    	}
    public String toString() { 
    	return title; 
    	}
}

class ExamCourse extends CourseType {
    ExamCourse(String title) { 
    	super(title); 
    	}
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) { 
    	super(title); 
    	}
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) { 
    	super(title); 
    	}
}

class Course<T extends CourseType> {
    private final List<T> courseList = new ArrayList<>();
    public void add(T course) { courseList.add(course); }
    public List<T> all() {
    	return courseList; 
    	}
}

class University {
    public static void showCourses(List<? extends CourseType> courses) {
        courses.forEach(System.out::println);
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Course<ExamCourse> exams = new Course<>();
        exams.add(new ExamCourse("Mathematics"));
        exams.add(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignments = new Course<>();
        assignments.add(new AssignmentCourse("Programming"));
        assignments.add(new AssignmentCourse("Web Development"));

        Course<ResearchCourse> research = new Course<>();
        research.add(new ResearchCourse("AI Research"));
        research.add(new ResearchCourse("Data Science Research"));

        University.showCourses(exams.all());
        University.showCourses(assignments.all());
        University.showCourses(research.all());
    }
}

