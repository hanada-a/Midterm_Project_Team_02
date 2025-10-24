/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

/**
 *
 * @author maxwellsowell
 */
public class Course {
    
    private String courseId;
    private String courseName;
    private int credits;
    private Boolean isCore; // true = core required class, false = elective class
    
    public Course(String id, String name, int credits, Boolean isCore) {
        this.courseId = id;
        this.courseName = name;
        this.credits = credits;
        this.isCore = isCore;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Boolean getIsCore() {
        return isCore;
    }

    public void setIsCore(Boolean isCore) {
        this.isCore = isCore;
    }
    
    public boolean isMatch(String id) {
        return courseId.equals(id);
    }
    
    @Override
    public String toString() {
        return courseId;
    }
    
}
