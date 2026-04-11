package com.mycompany.firstproject.UniversityClass.Sem2.Individual1;

import java.util.ArrayList;
import java.util.Comparator;


public class CourseManager<T extends Course> {
    private ArrayList<T> courseList = new ArrayList<T>();

    public CourseManager(){}

    /** @param course add a course to the manager */
    public void addCourse(T course){
        courseList.add(course);
    }

    public void removeCourse(String courseCode){
        boolean removed = courseList.removeIf(course -> course.getCourseCode().equals(courseCode));
        if(!removed){
            throw new IllegalArgumentException("No course with code " + courseCode);
        }
    }
    @SuppressWarnings("Unchecked")
    public String getCourseWithHighestWorkload(){
        if(courseList.isEmpty()) return "No courses available";

        T highestCourse = courseList.get(0);
        for(T course : courseList){
            if(course.calculateTotalWorkload() > highestCourse.calculateTotalWorkload()){
                highestCourse = course;
            }
        }
        return highestCourse.getCourseTitle();
    }

    /** Sorts the courses by their total workload in ascending order */
    public void sortCoursesByWorkload(){
        // This is the clean, standard way to sort a list of objects in Java!
        courseList.sort(Comparator.comparingInt(Course::calculateTotalWorkload));

    }

    public void printAllCourses(){
        for(T course : courseList){
            course.printCourseDetails();
            System.out.println("-------------------------"); // Adds clean spacing between every course
        }
    }
}