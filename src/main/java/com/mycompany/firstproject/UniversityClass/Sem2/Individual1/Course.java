package com.mycompany.firstproject.UniversityClass.Sem2.Individual1;

public interface Course {
    /***  Returns the course's unique code */
    String getCourseCode();

    /** Returns the course's title */
    String getCourseTitle();

    /** Returns the total workload hours for the course per semester */
    int calculateTotalWorkload();

    /** Returns the name of the assigned instructor.*/
    String getInstructorName();

    /** Prints all relevant information about the course*/
    void printCourseDetails();


}

