package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String findGrades(Student student) {
        int[] marks = student.getMarks();
        // if any mark < 35 => F
        for (int m : marks) {
            if (m < 35) {
                student.setGrade("F");
                return "F";
            }
        }

        int sum = 0;
        for (int m : marks) {
            sum += m;
        }

        String grade;
        if (sum < 150) {
            grade = "C";
        } else if (sum < 200) {
            grade = "B";
        } else if (sum < 250) {
            grade = "A";
        } else {
            grade = "A+";
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

    public int findNumberOfNullName(Student[] s) {
        int count = 0;
        if (s == null) return 0;
        for (Student st : s) {
            if (st != null && st.getName() == null) count++;
        }
        return count;
    }

    public int findNumberOfNullMarksArray(Student[] s) {
        int count = 0;
        if (s == null) return 0;
        for (Student st : s) {
            if (st != null && st.getMarks() == null) count++;
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] s) {
        int count = 0;
        if (s == null) return 0;
        for (Student st : s) {
            if (st == null) count++;
        }
        return count;
    }
}
