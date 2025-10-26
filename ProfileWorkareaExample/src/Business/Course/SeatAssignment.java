/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author maxwellsowell
 */
public class SeatAssignment {
    
    StudentProfile student;
    Seat seat;
    float grade;
    Boolean courseComplete;
    boolean like; //true means like and false means not like
    ArrayList<Assignment> assignmentlist;
    
    public SeatAssignment(StudentProfile student, Seat seat) {
        this.student = student;
        this.seat = seat;
        this.grade = 0;
        this.courseComplete = false;
        this.assignmentlist = new ArrayList<>();
    }
    
    
    public Assignment newAssignment(String name) {
        Assignment a = new Assignment(name);
        assignmentlist.add(a);
        return a;
    }
    
    public ArrayList<Assignment> getAssignmentList() {
        return assignmentlist;
    }
    
    public boolean getLike(){
        return like;
    }

    public StudentProfile getStudent() {
        return student;
    }

    public void setStudent(StudentProfile student) {
        this.student = student;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Boolean getCourseComplete() {
        return courseComplete;
    }

    public void setCourseComplete(Boolean courseComplete) {
        this.courseComplete = courseComplete;
    }
    
    public boolean isMatch(StudentProfile sp) {
        return student.isMatch(sp.getPerson().getPersonId());
    }
    
    public void assignSeatToStudent(CourseLoad cl){
        CourseLoad courseload = cl;
    }
    
    public int getCreditHours(){
        return seat.getCourseCredits();
    }
    
    public float GetCourseStudentScore(){
        return getCreditHours()*grade;
    }
    
    @Override
    public String toString() {
        return student.getPerson().toString() + " (" + seat.getCourseOffer().toString() + ")";
    }
    
}
