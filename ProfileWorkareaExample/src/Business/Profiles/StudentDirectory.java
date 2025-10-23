/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Akira Hanada
 */
package Business.Profiles;

import Business.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {


    ArrayList<StudentProfile> studentlist;

    public StudentDirectory() {

     studentlist = new ArrayList<>();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public ArrayList<StudentProfile> getStudentList() {
        return studentlist;
    }

    /**
     * Delete a student profile
     * @author Akira Hanada
     */
    public boolean deleteStudent(String id) {
        StudentProfile student = findStudent(id);
        if (student != null) {
            studentlist.remove(student);
            return true;
        }
        return false;
    }
    
}
