/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/* This is sudent class*/
public class Student {
    int studentId;
    String studentName;
    String batch;

    public Student() {
    }
    public Student(int studentId, String studentName, String batch) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.batch = batch;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
    
}
