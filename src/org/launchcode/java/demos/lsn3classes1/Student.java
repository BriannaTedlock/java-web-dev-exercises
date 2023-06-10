package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name = "Student";

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private int numberOfCredits = 0;

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private double gpa = 0.0;

    public double getGpa() {
        return gpa;
    }
}


