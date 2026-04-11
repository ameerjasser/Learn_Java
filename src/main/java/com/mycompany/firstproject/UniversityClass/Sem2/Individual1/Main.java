package com.mycompany.firstproject.UniversityClass.Sem2.Individual1;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create at least two LectureCourse and two LabCourse objects
        LectureCourse lec1 = new LectureCourse("CS101", "Intro to Programming", "Dr. Smith", 3);
        LectureCourse lec2 = new LectureCourse("WIA1002", "Data Structure", "Dr. Shahed", 5);
        LabCourse lab1 = new LabCourse("CS201", "Algorithms Lab", "Prof. Jones", 2.5, 2);
        LabCourse lab2 = new LabCourse("WIA1003", "Advanced Lab", "Dr. Brown", 2.0, 1);

        // Step 2: Create a CourseManager instance
        CourseManager<Course> cMa = new CourseManager<>();

        // Step 3: Add all created courses to the manager
        cMa.addCourse(lec1);
        cMa.addCourse(lec2);
        cMa.addCourse(lab1);
        cMa.addCourse(lab2);

        // Step 4: Print the details of the course with the highest total workload
        System.out.println("=== Course with Highest Workload ===");
        System.out.println(cMa.getCourseWithHighestWorkload());
        System.out.println();

        // Step 5: Sort the courses by total workload and print all course details
        System.out.println("=== All Courses (Sorted by Workload) ===");
        cMa.sortCoursesByWorkload();
        cMa.printAllCourses();

        // Step 6: Remove a course and print remaining details
        System.out.println("=== Removing CS101 ===");
        cMa.removeCourse("CS101");
        System.out.println("=== Remaining Courses ===");
        cMa.printAllCourses();


    }
}