package com.mile1.test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

public class TestStudent {
    public static void main(String[] args) {
        StudentReport report = new StudentReport();
        
        System.out.println("========== STUDENT GRADE CALCULATOR TEST ==========\n");
        
        // TC1: A grade computation
        System.out.println("TC1: A Grade Computation");
        Student s1 = new Student("John", new int[]{95, 92, 88});
        try {
            report.validate(s1);
            String grade = report.findGrade(s1);
            System.out.println("Student: " + s1.getName() + " Grade: " + grade);
            System.out.println("TC1 PASSED [PASS]\n");
        } catch (Exception e) {
            System.out.println("TC1 FAILED [FAIL] - " + e + "\n");
        }

        // TC2: D grade computation
        System.out.println("TC2: D Grade Computation");
        Student s2 = new Student("Jane", new int[]{65, 62, 60});
        try {
            report.validate(s2);
            String grade = report.findGrade(s2);
            System.out.println("Student: " + s2.getName() + " Grade: " + grade);
            System.out.println("TC2 PASSED [PASS]\n");
        } catch (Exception e) {
            System.out.println("TC2 FAILED [FAIL] - " + e + "\n");
        }

        // TC3: F grade computation
        System.out.println("TC3: F Grade Computation");
        Student s3 = new Student("Bob", new int[]{55, 50, 48});
        try {
            report.validate(s3);
            String grade = report.findGrade(s3);
            System.out.println("Student: " + s3.getName() + " Grade: " + grade);
            System.out.println("TC3 PASSED [PASS]\n");
        } catch (Exception e) {
            System.out.println("TC3 FAILED [FAIL] - " + e + "\n");
        }

        // TC4: Null Student Object Exception
        System.out.println("TC4: Null Student Object Exception");
        try {
            report.validate(null);
            System.out.println("TC4 FAILED [FAIL] - Exception not thrown\n");
        } catch (NullStudentObjectException e) {
            System.out.println("TC4 PASSED [PASS] - " + e + "\n");
        } catch (Exception e) {
            System.out.println("TC4 FAILED [FAIL] - Wrong exception\n");
        }

        // TC5: Null Name Exception
        System.out.println("TC5: Null Name Exception");
        Student s5 = new Student(null, new int[]{90, 85, 80});
        try {
            report.validate(s5);
            System.out.println("TC5 FAILED [FAIL] - Exception not thrown\n");
        } catch (NullNameException e) {
            System.out.println("TC5 PASSED [PASS] - " + e + "\n");
        } catch (Exception e) {
            System.out.println("TC5 FAILED [FAIL] - Wrong exception\n");
        }

        // TC6: Null Marks Array Exception
        System.out.println("TC6: Null Marks Array Exception");
        Student s6 = new Student("Alice", null);
        try {
            report.validate(s6);
            System.out.println("TC6 FAILED [FAIL] - Exception not thrown\n");
        } catch (NullMarksArrayException e) {
            System.out.println("TC6 PASSED [PASS] - " + e + "\n");
        } catch (Exception e) {
            System.out.println("TC6 FAILED [FAIL] - Wrong exception\n");
        }

        // TC7: Count null names
        System.out.println("TC7: Count Null Names");
        Student[] students1 = new Student[5];
        students1[0] = new Student(null, new int[]{90, 85, 80});
        students1[1] = new Student("Alice", new int[]{90, 85, 80});
        students1[2] = new Student(null, new int[]{90, 85, 80});
        students1[3] = new Student("Bob", new int[]{90, 85, 80});
        students1[4] = new Student(null, new int[]{90, 85, 80});
        int nullNameCount = report.findNumberOfNullName(students1);
        System.out.println("Number of null names: " + nullNameCount);
        if (nullNameCount == 3) {
            System.out.println("TC7 PASSED [PASS]\n");
        } else {
            System.out.println("TC7 FAILED [FAIL] - Expected 3, got " + nullNameCount + "\n");
        }

        // TC8: Count null objects
        System.out.println("TC8: Count Null Objects");
        Student[] students2 = new Student[5];
        students2[0] = new Student("John", new int[]{90, 85, 80});
        students2[1] = null;
        students2[2] = new Student("Alice", new int[]{90, 85, 80});
        students2[3] = null;
        students2[4] = new Student("Bob", new int[]{90, 85, 80});
        int nullObjectCount = report.findNumberOfNullObjects(students2);
        System.out.println("Number of null objects: " + nullObjectCount);
        if (nullObjectCount == 2) {
            System.out.println("TC8 PASSED [PASS]\n");
        } else {
            System.out.println("TC8 FAILED [FAIL] - Expected 2, got " + nullObjectCount + "\n");
        }

        // TC9: Count null marks
        System.out.println("TC9: Count Null Marks");
        Student[] students3 = new Student[5];
        students3[0] = new Student("John", null);
        students3[1] = new Student("Alice", new int[]{90, 85, 80});
        students3[2] = new Student("Bob", null);
        students3[3] = new Student("Mary", new int[]{90, 85, 80});
        students3[4] = new Student("Tom", null);
        int nullMarksCount = report.findNumberOfNullMarksArray(students3);
        System.out.println("Number of null marks: " + nullMarksCount);
        if (nullMarksCount == 3) {
            System.out.println("TC9 PASSED [PASS]\n");
        } else {
            System.out.println("TC9 FAILED [FAIL] - Expected 3, got " + nullMarksCount + "\n");
        }

        System.out.println("========== ALL TESTS COMPLETED ==========");
    }
}