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
public class CourseCatalog {
    
    ArrayList<Course> courselist;
    
    public CourseCatalog() {
        courselist = new ArrayList();
    }
    
    public Course newCourse(String id, String name, int credits, Boolean isCore) {
        Course c = new Course(id, name, credits, isCore);
        courselist.add(c);
        return c;
    }
    
    public Course findCourse(String number) {
        for (Course c : courselist) {
            if (c.isMatch(number)) {
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Course> getCourseList() {
        return courselist;
    }
    
}
