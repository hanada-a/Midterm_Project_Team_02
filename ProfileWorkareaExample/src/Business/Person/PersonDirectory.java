/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Akira Hanada
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {
    
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList<>();

    }

    public Person newPerson(String id) {

        Person p = new Person(id);
        personlist.add(p);
        return p;
    }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public ArrayList<Person> getPersonList() {
        return personlist;
    }
    
    /**
     * Update an existing person's details
     * @author Akira Hanada
     */
    public boolean updatePerson(String id, String name, String email, String phone, String address) {
        Person person = findPerson(id);
        if (person != null) {
            person.setName(name);
            person.setEmail(email);
            person.setPhone(phone);
            person.setAddress(address);
            return true;
        }
        return false;
    }
    
    /**
     * Delete a person from the directory
     * @author Akira Hanada
     */
    public boolean deletePerson(String id) {
        Person person = findPerson(id);
        if (person != null) {
            personlist.remove(person);
            return true;
        }
        return false;
    }
    
}
