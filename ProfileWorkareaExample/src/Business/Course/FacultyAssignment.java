/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.FacultyProfile;

/**
 *
 * @author maxwellsowell
 */
public class FacultyAssignment {
    
    FacultyProfile faculty;
    CourseOffer courseoffer;
    
    public FacultyAssignment(FacultyProfile faculty, CourseOffer courseoffer) {
        this.faculty = faculty;
        this.courseoffer = courseoffer;
    }

    public FacultyProfile getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyProfile faculty) {
        this.faculty = faculty;
    }

    public CourseOffer getCourseOffer() {
        return courseoffer;
    }

    public void setCourseOffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }
    
    public boolean isMatch(FacultyProfile fp) {
        return faculty.isMatch(fp.getPerson().getPersonId());
    }
    
    @Override
    public String toString() {
        return faculty.getPerson().toString() + " (" + courseoffer.toString() + ")";
    }
    
}