/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Akira Hanada
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author Akira Hanada
 */
public class FacultyProfile extends Profile {

    private String department;
    private String specialization;

    public FacultyProfile(Person p) {
        super(p);
        this.department = "";
        this.specialization = "";
    }

    @Override
    public String getRole() {
        return "Faculty";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null) {
            this.department = department;
        }
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization != null) {
            this.specialization = specialization;
        }
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

}
