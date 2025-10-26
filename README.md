# Midterm_Project_Team_02
INFO5100.20180.202610 Assignments8 — Midterm Project [Group]

## Team Members
- **Akira Hanada** - Administrator Use Case (Branch: `Akira-feature-admin-use-case`)
- **Maxwell Sowell** - Faculty Use Case (Branch: `Maxwell-feature-faculty-use-case`)
- **Travis Hodo** - Student Use Case (Branch: `Travis-feature-student-use-case`)

## Project Overview
Digital University System with Access Control Layer for proper authentication and role-based access control.

## System Architecture

### Core Business Layer
- **Person**: Enhanced with name, email, phone, address attributes
- **PersonDirectory**: Complete CRUD operations for managing persons
- **Profile** (Abstract): Base class for all user profiles
  - **EmployeeProfile**: For administrators
  - **FacultyProfile**: For faculty members (with department, specialization)
  - **StudentProfile**: For students
- **UserAccount**: Links persons to their login credentials and profiles
- **UserAccountDirectory**: Manages all user accounts with authentication

### Administrator Use Case Implementation (Akira Hanada)

#### Completed Features:
1. **Fixed Compilation Errors**
   - Corrected package declarations
   - Fixed ArrayList generic type warnings
   - Moved files to correct package locations

2. **Enhanced Person Class**
   - Added attributes: name, email, phone, address
   - Implemented proper getters/setters with null validation
   - toString() method returns name instead of ID

3. **Created FacultyProfile and FacultyDirectory**
   - FacultyProfile extends Profile
   - Added department and specialization attributes
   - FacultyDirectory manages all faculty with CRUD operations

4. **Enhanced Directory Classes**
   - PersonDirectory: Added update, delete, getPersonList methods
   - UserAccountDirectory: Added update, delete, findByUsername methods
   - EmployeeDirectory: Added delete and getEmployeeList methods
   - StudentDirectory: Added delete and getStudentList methods

5. **Updated Business Class**
   - Added FacultyDirectory integration
   - getFacultyDirectory() method

6. **Enhanced Test Data (ConfigureABusiness)**
   - Created comprehensive test data with 9 persons
   - Each person has complete profile information
   - Created 1 admin, 2 faculty, and 5 student accounts
   - Pre-configured user accounts for testing

#### Test Credentials:
- **Admin**: Username: `admin`, Password: `admin123`
- **Faculty 1**: Username: `gina`, Password: `faculty123`
- **Faculty 2**: Username: `jim`, Password: `faculty123`
- **Student 1**: Username: `adam`, Password: `student123`
- **Student 2**: Username: `anna`, Password: `student123`

#### Administrator Responsibilities (To Be Completed in UI):

1. **Administer User Accounts**
   - View all user accounts in a table
   - Create new user accounts
   - Modify existing user accounts (username, password)
   - Delete user accounts
   - Link user accounts to person profiles

2. **Register Persons (HR)**
   - View all persons in the system
   - Add new persons with full details (name, email, phone, address)
   - Edit person information
   - Delete persons from the system

3. **Manage Student Records**
   - View all student profiles
   - Update student information
   - Delete student records
   - View student academic details

4. **Manage Faculty Records**
   - View all faculty profiles
   - Add new faculty members
   - Update faculty information (department, specialization)
   - Delete faculty records

5. **Manage Own Profile**
   - View admin's own profile
   - Update personal information

### UI Panels Structure

#### AdminRoleWorkAreaJPanel (Main Admin Dashboard)
Buttons for:
- Administer User Accounts
- Register Persons (HR)
- Manage Faculty
- Manage Students
- My Profile

#### ManageUserAccountsJPanel
- Display table of all user accounts
- Add/Edit/Delete functionality
- Navigate to AdminUserAccount panel for details

#### ManagePersonsJPanel
- Display table of all persons
- Add/Edit/Delete functionality
- Navigate to AdministerPersonJPanel for details

#### AdministerPersonJPanel
- Form to add/edit person details
- Input validation
- Save/Cancel buttons

## Setup Instructions

### Prerequisites
- JDK 8 or higher
- NetBeans IDE (recommended for form editing)
- Git for version control

### Running the Application
1. Clone the repository
2. Open the project in NetBeans
3. Navigate to `ProfileWorkareaExample` folder
4. Run `ProfileWorkAreaMainFrame.java`
5. Use test credentials to login

### Development Guidelines
1. **Null Checks**: Always validate input before processing
2. **Error Handling**: Use try-catch blocks and display user-friendly messages
3. **Code Documentation**: Add comments with author name
4. **Commit Frequently**: Make at least 10 commits on your branch
5. **Pull Requests**: Create at least 5 pull requests to main branch

## Current Project Status

### Completed (Akira Hanada):
✅ Business layer implementation
✅ Person class enhancement
✅ Faculty Profile and Directory creation
✅ CRUD operations for all directories
✅ Test data configuration
✅ Package structure fixes
✅ Compilation error fixes
✅ UI panels for Admin use case
✅ Form implementations for CRUD operations
✅ Input validation and error handling

### In Progress:
🔄 

### To Do:
- Testing and validation

## Code Attribution
All code modifications are signed with `@author Akira Hanada` to track individual contributions.

## Repository Guidelines
- Main branch must be runnable at all times
- Each team member works on their feature branch
- Minimum 30 commits on main branch
- Each member minimum 10 commits on their branch
- Each member minimum 5 pull requests

## License
Educational project for INFO5100 - Northeastern University
