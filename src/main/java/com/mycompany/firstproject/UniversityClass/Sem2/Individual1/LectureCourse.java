package com.mycompany.firstproject.UniversityClass.Sem2.Individual1;

public class LectureCourse implements Course, java.io.Serializable{
    private String courseCode;
    private String courseTitle;
    private String instructorName;
    private int lectureHoursPerWeek;
    transient String thisFieldWontBeSerialized;

    public LectureCourse(String courseCode,
                         String courseTitle,
                         String instructorName,
                         int lectureHoursPerWeek) {

        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.lectureHoursPerWeek = lectureHoursPerWeek;
       // Main.cMa.addCourse(this);
    }
    @Override
    public String getCourseCode() {
        return courseCode;
    }
    @Override
    public String getCourseTitle() {
        return courseTitle;
    }
    @Override
    public int calculateTotalWorkload() {
        // Workload is lab hours per week * number of weeks in a semester (assume 14 weeks)
        return lectureHoursPerWeek * 14;
    }
    @Override
    public String getInstructorName() {
        return instructorName;
    }
    @Override
    public void printCourseDetails() {
        System.out.println("Lecture Course: " + courseTitle + " (" + courseCode + ")");
        System.out.println(" Instructor: " + instructorName);
        System.out.println(" Lecture Hours/Week: " + lectureHoursPerWeek);
        System.out.println(" Total Workload (Semester): " + calculateTotalWorkload() + " hours");
    }
}
