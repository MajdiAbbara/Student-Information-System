package model.entities;

import model.enums.CourseType;
import model.enums.DegreeLevel;
import model.enums.Gender;
import model.enums.PrerequisiteType;
import model.enums.Semester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   Student Information System Simulation   ");
        System.out.println("===========================================\n");

        // 1. Faculty
        Faculty faculty = new Faculty(
            "05", 
            "Faculty of Engineering and Natural Sciences", 
            "02120000000", 
            "info@atlas.edu.tr", 
            "Main Campus"
        );
        System.out.println("1. Faculty Created:");
        System.out.println(faculty.toString());
        System.out.println("-------------------------------------------\n");

        // 2. Department
        Department dept = new Department(
            "0504", 
            "Software Engineering Department", 
            faculty.getId(), 
            "02120000001", 
            "swe@atlas.edu.tr"
        );
        System.out.println("2. Department Created:");
        System.out.println(dept.toString());
        System.out.println("-------------------------------------------\n");

        // 3. Program
        Program program = new Program(
            "0504001",
            "Software Engineering (English)",
            dept.getId(),
            DegreeLevel.BACHELOR,
            240,
            4,
            "English"
        );
        System.out.println("3. Program Created:");
        System.out.println(program.toString());
        System.out.println("-------------------------------------------\n");

        // 4. Instructor (Advisor)
        Instructors instructor = new Instructors(
            "ADV001",
            "11111111111",
            "Naim Mahmood Musleh",
            "AJLOUNI",
            "naim.ajlouni@atlas.edu.tr",
            "02120000002",
            dept.getId(),
            "Dr.",
            "Software Engineering",
            LocalDate.of(2020, 1, 1)
        );
        dept.setHeadInstructorId(instructor.getId());
        System.out.println("4. Instructor Created:");
        System.out.println(instructor.toString());
        System.out.println("-------------------------------------------\n");

        // 5. Academic Term
        AcademicTerm term = new AcademicTerm(
            "2023-FALL",
            "Fall Semester 2023-2024",
            "2023-2024",
            Semester.FALL,
            LocalDate.of(2023, 10, 2),
            LocalDate.of(2024, 1, 20),
            LocalDate.of(2023, 9, 15),
            LocalDate.of(2023, 9, 30),
            LocalDate.of(2023, 10, 10)
        );
        System.out.println("5. Academic Term Created:");
        System.out.println(term.toString());
        System.out.println("-------------------------------------------\n");

        // 6. Courses
        Course java1 = new Course(
            "SWE101",
            "Object Oriented Programming I",
            dept.getId(),
            4, 3, 2,
            CourseType.MANDATORY,
            "English",
            "Introduction to Java and OOP Concepts"
        );

        Course java2 = new Course(
            "SWE102",
            "Object Oriented Programming II",
            dept.getId(),
            4, 3, 2,
            CourseType.MANDATORY,
            "English",
            "Advanced Java and Design Patterns"
        );
        System.out.println("6. Courses Created:");
        System.out.println(java1.toString());
        System.out.println(java2.toString());
        System.out.println("-------------------------------------------\n");

        // 7. Course Prerequisite
        CoursePrerequisite prereq = new CoursePrerequisite(
            java2.getId(),
            java1.getId(),
            PrerequisiteType.MANDATORY,
            "DD"
        );
        System.out.println("7. Course Prerequisite Created:");
        System.out.println(prereq.toString());
        System.out.println("-------------------------------------------\n");

        // 8. Program Course
        ProgramCourse progCourse = new ProgramCourse(
            program.getId(),
            java1.getId(),
            1,
            CourseType.MANDATORY
        );
        System.out.println("8. Program Course Link Created:");
        System.out.println(progCourse.toString());
        System.out.println("-------------------------------------------\n");

        // 9. Student (Your Profile)
        Student mecdi = new Student(
            "230504544",
            "99123456789",
            "MECDI",
            "ABBARA",
            "2003-01-01",
            Gender.MALE,
            "230504544@st.atlas.edu.tr",
            "05551234567",
            "Istanbul, Turkey",
            program.getId(),
            2023,
            2,
            "profile.jpg"
        );
        System.out.println("9. Student Created:");
        System.out.println(mecdi.toString());
        System.out.println("-------------------------------------------\n");

        // Using ArrayList as required in Assignment
        List<Student> studentList = new ArrayList<>();
        studentList.add(mecdi);

        System.out.println("--- Registered Students in ArrayList ---");
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        System.out.println("\n===========================================");
        System.out.println("     Execution Completed Successfully!      ");
        System.out.println("===========================================");
    }
}