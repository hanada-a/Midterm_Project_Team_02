/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Akira Hanada
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author Akira Hanada
 */
public class FacultyDirectory {

    Business business;
    ArrayList<FacultyProfile> facultylist;

    public FacultyDirectory(Business d) {
        business = d;
        facultylist = new ArrayList<>();
    }

    public FacultyProfile newFacultyProfile(Person p) {
        FacultyProfile fp = new FacultyProfile(p);
        facultylist.add(fp);
        return fp;
    }

    public FacultyProfile findFaculty(String id) {
        for (FacultyProfile fp : facultylist) {
            if (fp.isMatch(id)) {
                return fp;
            }
        }
        return null; //not found after going through the whole list
    }

    public ArrayList<FacultyProfile> getFacultyList() {
        return facultylist;
    }

    /**
     * Update faculty profile
     * @author Akira Hanada
     */
    public boolean updateFaculty(String id, String department, String specialization) {
        FacultyProfile faculty = findFaculty(id);
        if (faculty != null) {
            faculty.setDepartment(department);
            faculty.setSpecialization(specialization);
            return true;
        }
        return false;
    }

    /**
     * Delete a faculty profile
     * @author Akira Hanada
     */
    public boolean deleteFaculty(String id) {
        FacultyProfile faculty = findFaculty(id);
        if (faculty != null) {
            facultylist.remove(faculty);
            return true;
        }
        return false;
    }
    
}
