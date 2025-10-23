/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Akira Hanada
*/
package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccountDirectory;


/**
 *
 * @author Akira Hanada
 */
public class ConfigureABusiness {

    public static Business initialize() {
        Business business = new Business("Information Systems");

// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();
// person representing different roles       
        Person person001 = persondirectory.newPerson("john001");
        person001.setName("John Smith");
        person001.setEmail("john.smith@northeastern.edu");
        person001.setPhone("617-555-0001");
        person001.setAddress("123 Main St, Boston, MA");
        
        Person person002 = persondirectory.newPerson("gina002");
        person002.setName("Gina Montana");
        person002.setEmail("gina.montana@northeastern.edu");
        person002.setPhone("617-555-0002");
        person002.setAddress("456 Oak Ave, Boston, MA");
        
        Person person003 = persondirectory.newPerson("adam003");
        person003.setName("Adam Rollen");
        person003.setEmail("adam.rollen@northeastern.edu");
        person003.setPhone("617-555-0003");
        person003.setAddress("789 Pine Rd, Boston, MA");
 
        Person person005 = persondirectory.newPerson("jim005");
        person005.setName("Jim Dellon");
        person005.setEmail("jim.dellon@northeastern.edu");
        person005.setPhone("617-555-0005");
        person005.setAddress("321 Elm St, Boston, MA");
        
        Person person006 = persondirectory.newPerson("anna006");
        person006.setName("Anna Shnider");
        person006.setEmail("anna.shnider@northeastern.edu");
        person006.setPhone("617-555-0006");
        person006.setAddress("654 Maple Dr, Boston, MA");
        
        Person person007 = persondirectory.newPerson("laura007");
        person007.setName("Laura Brown");
        person007.setEmail("laura.brown@northeastern.edu");
        person007.setPhone("617-555-0007");
        person007.setAddress("987 Cedar Ln, Boston, MA");
        
        Person person008 = persondirectory.newPerson("jack008");
        person008.setName("Jack While");
        person008.setEmail("jack.while@northeastern.edu");
        person008.setPhone("617-555-0008");
        person008.setAddress("147 Birch St, Boston, MA");
        
        Person person009 = persondirectory.newPerson("sarah009");
        person009.setName("Sarah Johnson");
        person009.setEmail("sarah.johnson@northeastern.edu");
        person009.setPhone("617-555-0009");
        person009.setAddress("258 Spruce Ave, Boston, MA");

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person001);
        
// Create Faculty members
        FacultyDirectory facultydirectory = business.getFacultyDirectory();
        FacultyProfile facultyprofile1 = facultydirectory.newFacultyProfile(person002);
        facultyprofile1.setDepartment("Computer Science");
        facultyprofile1.setSpecialization("Software Engineering");
        
        FacultyProfile facultyprofile2 = facultydirectory.newFacultyProfile(person005);
        facultyprofile2.setDepartment("Information Systems");
        facultyprofile2.setSpecialization("Database Management");
        
// Create Students
        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentprofile0 = studentdirectory.newStudentProfile(person003);
        StudentProfile studentprofile1 = studentdirectory.newStudentProfile(person006);
        StudentProfile studentprofile2 = studentdirectory.newStudentProfile(person007);
        StudentProfile studentprofile3 = studentdirectory.newStudentProfile(person008);
        StudentProfile studentprofile4 = studentdirectory.newStudentProfile(person009);
        


   
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        uadirectory.newUserAccount(employeeprofile0, "admin", "admin123");
        uadirectory.newUserAccount(facultyprofile1, "gina", "faculty123");
        uadirectory.newUserAccount(facultyprofile2, "jim", "faculty123");
        uadirectory.newUserAccount(studentprofile0, "adam", "student123");
        uadirectory.newUserAccount(studentprofile1, "anna", "student123");

        return business;

    }

}
