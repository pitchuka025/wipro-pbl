package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    // UPDATED: Uses AVERAGE instead of SUM
    public String findGrade(Student student) {
        int[] marks = student.getMarks();
        
        // Check if any mark is less than 35
        for (int m : marks) {
            if (m < 35) {
                student.setGrade("F");
                return "F";
            }
        }

        // Calculate sum
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        
        // Calculate average (assuming 3 subjects)
        double average = sum / 3.0;

        // Determine grade based on AVERAGE
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        student.setGrade(grade);
        return grade;
    }

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null) {
            throw new NullStudentObjectException();
        }
        if (s.getName() == null) {
            throw new NullNameException();
        }
        if (s.getMarks() == null) {
            throw new NullMarksArrayException();
        }
        return "VALID";
    }

    public int findNumberOfNullName(Student[] students) {
        int count = 0;
        if (students == null) return 0;
        for (Student s : students) {
            if (s != null && s.getName() == null) {
                count++;
            }
        }
        return count;
    }

    public int findNumberOfNullMarksArray(Student[] students) {
        int count = 0;
        if (students == null) return 0;
        for (Student s : students) {
            if (s != null && s.getMarks() == null) {
                count++;
            }
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {
        int count = 0;
        if (students == null) return 0;
        for (Student s : students) {
            if (s == null) {
                count++;
            }
        }
        return count;
    }
}