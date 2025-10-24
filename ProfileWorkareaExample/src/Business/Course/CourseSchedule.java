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
public class CourseSchedule {
    
    // CourseCatalog coursecatalog;
    String semester;
    ArrayList<CourseOffer> courseofferlist;
    
    public CourseSchedule(String semester) {
        this.semester = semester;
        courseofferlist = new ArrayList<>();
    }
    
    public CourseOffer newCourseOffer(Course course, String semester) {
        CourseOffer co = new CourseOffer(course, semester);
        courseofferlist.add(co);
        return co;
    }
    
    public CourseOffer findCourseOfferById(String courseId) {
        for (CourseOffer co : courseofferlist) {
            if (co.getCourse().isMatch(courseId)) {
                return co;
            }
        }
        return null;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<CourseOffer> getCourseofferlist() {
        return courseofferlist;
    }

    public void setCourseofferlist(ArrayList<CourseOffer> courseofferlist) {
        this.courseofferlist = courseofferlist;
    }
    
}
