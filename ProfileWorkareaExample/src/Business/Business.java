/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Akira Hanada
 */
package Business;

import Business.Course.CourseCatalog;
import Business.Course.CourseSchedule;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;
    FacultyDirectory facultydirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    CourseCatalog coursecatalog;
    CourseSchedule courseschedule;



    public Business(String n) {
        name = n;

        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        facultydirectory = new FacultyDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();
        coursecatalog = new CourseCatalog();
        courseschedule = new CourseSchedule();


    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultydirectory;
    }

    public StudentDirectory getStudentDirectory(){
        return studentdirectory;
    }

    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }

    public CourseSchedule getCourseSchedule() {
        return courseschedule;
    }


}
