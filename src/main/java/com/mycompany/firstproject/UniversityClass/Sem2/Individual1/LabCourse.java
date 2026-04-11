package com.mycompany.firstproject.UniversityClass.Sem2.Individual1;

public class LabCourse implements Course, java.io.Serializable {
    private final String courseCode;
    private final String courseTitle;
    private final String instructorName;
    private final double labHoursPerWeek;
    private final int numberOfSessions;
    transient String thisFieldWontBeSerialized;

    public LabCourse(String courseCode, String courseTitle,
                     String instructorName,
                     double labHoursPerWeek,
                     int numberOfSessions) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.labHoursPerWeek = labHoursPerWeek;
        this.numberOfSessions = numberOfSessions;
    }
    @Override
    public String getCourseCode() {
        return courseCode;
    }
    @Override
    public String getCourseTitle() {
        return courseTitle;
    }

    public int calculateTotalWorkload() {
        // Workload is lab hours per week * Number Of Sessions * number of weeks in a semester (assume 14 weeks)
        return (int)labHoursPerWeek * numberOfSessions * 14;
    }
    @Override
    public String getInstructorName() {
        return instructorName;
    }
    @Override
    public void printCourseDetails() {
        System.out.println("Lab Course: " + courseTitle + " (" + courseCode + ")");
        System.out.println(" Instructor: " + instructorName);
        System.out.println(" Lab Hours/Week: " + labHoursPerWeek);
        System.out.println(" Total Workload (Semester): " + calculateTotalWorkload() + " hours");
        System.out.printf("Number Of Sessions: %d\n", numberOfSessions);
    }

}

