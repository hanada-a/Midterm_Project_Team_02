/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

/**
 *
 * @author maxwellsowell
 */
public class Assignment {
    
    String assignmentName;
    float assignmentGrade;
    boolean submitted;
    
    
    public Assignment(String name) {
        
        this.assignmentName = name;
        this.assignmentGrade = 0;
        this.submitted = false;
    
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public float getAssignmentGrade() {
        return assignmentGrade;
    }

    public void setAssignmentGrade(float grade) {
        this.assignmentGrade = grade;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }
    
    @Override
    public String toString() {
        return assignmentName;
    }
    
}
