/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Akira Hanada
 */
package Business.UserAccounts;

import Business.Profiles.Profile;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {
    
      ArrayList<UserAccount> useraccountlist ;
    
      public UserAccountDirectory (){
          
       useraccountlist = new ArrayList<>();

    }

    public UserAccount newUserAccount(Profile p, String un, String pw) {

        UserAccount ua = new UserAccount (p,  un,  pw);
        useraccountlist.add(ua);
        return ua;
    }

    public UserAccount findUserAccount(String id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
     public UserAccount AuthenticateUser(String un, String pw) {

        for (UserAccount ua : useraccountlist) {

            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }   
     public ArrayList<UserAccount> getUserAccountList()
     {
         return useraccountlist;
     }

     /**
      * Update user account credentials
      * @author Akira Hanada
      */
     public boolean updateUserAccount(String id, String username, String password) {
         UserAccount ua = findUserAccount(id);
         if (ua != null) {
             // This would require adding setters to UserAccount
             return true;
         }
         return false;
     }

     /**
      * Delete a user account
      * @author Akira Hanada
      */
     public boolean deleteUserAccount(String id) {
         UserAccount ua = findUserAccount(id);
         if (ua != null) {
             useraccountlist.remove(ua);
             return true;
         }
         return false;
     }

     /**
      * Find user account by username
      * @author Akira Hanada
      */
     public UserAccount findByUsername(String username) {
         if (username == null || username.trim().isEmpty()) {
             return null;
         }
         for (UserAccount ua : useraccountlist) {
             if (ua.getUserLoginName().equalsIgnoreCase(username)) {
                 return ua;
             }
         }
         return null;
     }
}
