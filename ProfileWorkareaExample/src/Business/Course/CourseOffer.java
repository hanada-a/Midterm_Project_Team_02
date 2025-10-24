/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import java.util.ArrayList;

/**
 *
 * @author maxwellsowell
 */
public class CourseOffer {
    
    Course course;
    String semester;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;
    
    public CourseOffer(Course course, String semester) {
        this.course = course;
        this.semester = semester;
        this.seatlist = new ArrayList<>();
        this.facultyassignment = facultyassignment;
    }

    public Seat newSeat() {
        Seat s = new Seat(this,null);
        seatlist.add(s);
        return s;
    }
    
    public int getSeatCount() {
        return seatlist.size();
    }
    
    
    ///////////////////////////////////////
    // TODO: need getEnrolledCount() too //
    ///////////////////////////////////////
    
    
    public boolean isMatch(String courseNumber, String semester) {
        return course.isMatch(courseNumber) && this.semester.equals(semester);
    }
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }

    public FacultyAssignment getFacultyassignment() {
        return facultyassignment;
    }

    public void setFacultyassignment(FacultyAssignment facultyassignment) {
        this.facultyassignment = facultyassignment;
    }
    
    @Override
    public String toString() {
        return course.toString() + " (" + semester + ")";
    }
    
}
