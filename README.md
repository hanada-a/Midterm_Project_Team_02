# Midterm_Project_Team_02
INFO5100.20180.202610 Assignments8 — Midterm Project [Group]

## Team Members
- **Akira Hanada** - Administrator Use Case (Branch: `Akira-feature-admin-use-case`)
- **Maxwell Sowell** - Faculty Use Case (Branch: `Maxwell-feature-faculty-use-case`)
- **Travis Hodo** - Student Use Case (Branch: `Travis-feature-student-use-case`)

## Project Overview
Digital University System with Access Control Layer for proper authentication and role-based access control. The system manages three distinct user roles (Administrator, Faculty, Student) with role-based permissions and functionality.

## System Architecture

### Core Business Layer
- **Person**: Enhanced with name, email, phone, address attributes
- **PersonDirectory**: Complete CRUD operations for managing persons
- **Profile** (Abstract): Base class for all user profiles
  - **EmployeeProfile**: For administrators
  - **FacultyProfile**: For faculty members
  - **StudentProfile**: For students
- **UserAccount**: Links persons to their login credentials and profiles
- **UserAccountDirectory**: Manages all user accounts with authentication
- **EmployeeDirectory**: Manages employee profiles with CRUD operations
- **FacultyDirectory**: Manages faculty profiles with CRUD operations
- **StudentDirectory**: Manages student profiles with CRUD operations
- **Course**: For course details
- **CourseCatalog**: Directory of all available courses
- **CourseOffer**: Represents a course offered in a specific semester
- **CourseSchedule**: Manages all course offers for a semester
- **Assignment**: Represents individual assignments with name, grade, and submission status
- **Seat**: Represents an enrollment slot in a course offer
- **SeatAssignment**: Links students to seats with assignments and overall grade
- **FacultyAssignment**: Links faculty members to course offers

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

---

### Faculty Use Case Implementation (Maxwell Sowell)

#### Completed Features:

1. **Course Management System**
   - Created Course, CourseCatalog, CourseOffer, CourseSchedule classes
   - Implemented CRUD operations for courses and course offers
   - FacultyAssignment linking to course offers
   - Course attributes: ID, name, credits, isCore status

2. **Assignment and Grading System**
   - Created Assignment class for tracking coursework
   - SeatAssignment class linking students to courses
   - Individual assignment grade tracking
   - Overall course grade user input
   - Assignment submission status tracking

3. **Student Enrollment System**
   - Seat class for managing course enrollments
   - Student seat assignment with grade tracking
   - Supports multiple students per course offer

#### Faculty Responsibilities:

1. **Manage Courses** (ManageCoursesJPanel)
   - View all courses assigned to the logged-in faculty member
   - Display course ID, name, semester, and enrollment count
   - Create new course offers from catalog
   - Update course details (name, credits, core status, semester, faculty assignment)
   - Delete course offers
   - Add/remove assignments for courses
   - Navigation to detailed course view

2. **Manage Own Profile** (FacultyProfileJPanel)
   - View personal information (Person ID, Name, Email, Phone, Address)
   - View faculty-specific information (Department, Specialization)
   - Edit and save profile changes
   - Input validation for required fields

3. **Generate Performance Reports** (PerformanceReportsJPanel)
   - View all students enrolled in faculty's courses
   - Display student grades in table format
   - Shows: Student Name, Person ID, Course ID, Course Name, Semester, Grade
   - Navigate to detailed grade management for individual students

4. **Manage Student Grades** (ManageGradesJPanel)
   - View individual student's assignment grades
   - Edit assignment grades and submission status
   - Edit overall course grade
   - Input validation to prevent saving non-numeric grades
   - Table-based grade entry also with validation on save
   - Error messages for invalid input (non-numeric characters)
   - Updates reflected in performance report panel

5. **View Student Profiles** (ViewStudentProfilesJPanel)
   - View all students in the system
   - Display student contact information
   - Navigate to detailed student profile view
   - View student hobbies and interests
   - View complete academic history with grades

#### Faculty UI Panel Structure:
- **FacultyWorkAreaJPanel**: Main faculty dashboard with 4 navigation buttons
- **FacultyProfileJPanel**: Faculty profile management form
- **ManageCoursesJPanel**: Table of faculty's assigned courses with CRUD buttons
- **CreateCourseOfferJPanel**: Form to create new course offers (not courses, that would be an admin function)
- **ViewCourseOfferJPanel**: Detailed course editor (course info, offer info, and assignments)
- **PerformanceReportsJPanel**: Grade performance table for all enrolled students
- **ManageGradesJPanel**: Individual student grade editor with assignment breakdown
- **ViewStudentProfilesJPanel**: Table of all students
- **StudentProfileDetailsJPanel**: Detailed student view with hobbies, interests, and grades

#### Faculty Use Case Implementation Notes:

1. **Grade Validation**
   - Regex pattern `\\d+(\\.\\d+)?` prevents non-numeric character input (sorry for using a little regex!)
   - Clear error messaging: "Grade must be numeric"
   - Validates both individual assignment grades and overall grades
   - Prevents errors from invalid grade data

2. **Table Refresh Pattern**
   - Parent panels refresh tables when returning from detail views
   - Ensures data consistency across navigation

3. **Navigation Flow**
   - CardLayout for panel switching
   - Back buttons properly remove panels from card stack
   - Forward navigation adds new panels to sequence

4. **Faculty-Specific Data Filtering**
   - Courses filtered by faculty assignment
   - Grades shown only for faculty's courses
   - Course offers tied to authenticated faculty member


#### Faculty Usage Instructions:

1. Login with faculty credentials (gina/faculty123 or jim/faculty123)
2. **Manage Courses**:
   - View your assigned courses
   - Click "Create" to add a new course offer
   - Select a course and click "Update Details" to modify course + course offer information
   - Select a course and click "Delete" to remove a course offer
3. **Manage Grades**:
   - Click "Manage Grades" from main menu
   - Select a student from the performance reports table
   - Click "Update Grades" to edit
   - Modify assignment grades and overall grade
   - Click "Save Grade Changes" (validates numeric input)
4. **View Student Profiles**:
   - Click "View All Student Profiles"
   - Select a student and click "View Profile Details"
   - See student's hobbies, interests, and complete grade history
5. **My Profile**:
   - View and edit your personal faculty information
   - Update your department and specialization

---

### Student Use Case Implementation (Travis Hodo)





---

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
5. Use test credentials to login (displayed in login error message, or see Test Credentials section above)

### Development Guidelines
1. **Null Checks**: Always validate input before processing
2. **Error Handling**: Use try-catch blocks and display user-friendly messages
3. **Code Documentation**: Add comments with author name
4. **Commit Frequently**: Make at least 10 commits on your branch
5. **Pull Requests**: Create at least 5 pull requests to main branch


## Authentication & Access Control

### Authentication Process
1. User enters username and password on login screen
2. 'UserAccountDirectory.AuthenticateUser(username, password)' validates credentials
3. Returns 'UserAccount' object if valid, null if invalid
4. Error message displayed for invalid credentials
5. Nested if-statements route user according to role of valid UserAccount

### Authorization Rules
- **Admin Role**:
  - Full access to user account management
  - Personnel management (create/edit/delete persons)
  - Student and faculty record management
  - Cannot access course grading functions

- **Faculty Role**:
  - Manage only their assigned courses
  - View all student profiles (read-only for non-enrolled students)
  - Edit grades only for students in their courses
  - Create course offers for themselves
  - Cannot access administrative functions

- **Student Role**:
  -




---

## Testing Guide

### Test Case 1: Authentication
1. Run application
2. Try invalid credentials > Should show "Authentication Failed" message
3. Login with `admin/admin123` > Should route to Admin dashboard
4. Login with `gina/faculty123` > Should route to Faculty dashboard
5. Login with `adam/student123` > Should route to Student dashboard

### Test Case 2: Faculty Grade Management
1. Login as `gina/faculty123`
2. Click "Manage Grades"
3. Select Adam Rollen (enrolled in INFO5100)
4. Click "Update Grades"
5. Try entering "ABC" in an assignment grade field > Click Save > Should show "Grade must be numeric" error
6. Enter valid numeric grade (e.g., "89.5") > Click Save > Should save successfully
7. Return to performance reports > Grade should be updated

### Test Case 3: Faculty Course Management
1. Login as faculty
2. Click "Manage Courses"
3. Click "Create" > Select course and enter semester > Click Create > Should create new course offer
4. Select a course > Click "Update Details"
5. Click "Update Course/Offer/Assignments"
6. Modify course name and semester
7. Click "Add Assignment" > Enter name > Should add to table
8. Click "Save Changes" > Should save all modifications

### Test Case 4: Admin User Management
1. Login as `admin/admin123`
2. Click "Administer User Accounts"
3. Click "Create" > Fill in all fields > Click Create > Should create new user
4. Try creating duplicate username > Should show error
5. Select user > Click "View/Edit" > Modify fields > Click Update > Should update successfully
6. Select user > Click "Delete" > Confirm > Should delete successfully

### Test Case 5: Input Validation
1. Test empty required fields > Should show "field is required" error
2. Test invalid email formats > Should show "valid email" error
3. Test password less than 6 characters > Should show "at least 6 characters" error
4. Test non-numeric grades > Should show "numeric" error

---

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
✅ Testing and validation

### Completed (Maxwell Sowell):
✅ Course offer management
✅ Faculty profile management (logged-in user only)
✅ View all student grades in faculty member's courses
✅ Edit overall and assignment grades
✅ Student profile viewing (including academic progress)
✅ Assignment management (add/delete assignments for course offers)
✅ Input validation and error handling
✅ Testing and validation


### In Progress:
🔄  

### To Do:
- 




## Challenges & Solutions
- This was our first time collaborating with multiple members across multiple branches. Through this project, we learned that it is possible.
- (Faculty) Invalid grade field text like "65.0fg" was saving because `Float.parseFloat()` would parse "65.0" and ignore the rest. Swapped to regex validation `\\d+(\\.\\d+)?` to ensure the entire String is numeric before parsing.

## Future Enhancements
- Further UI/UX Improvements
- Advanced searching and filtering
- (Faculty) Calculate overall course grade based on assignment grades
- (Faculty) Implement seats and seat assignments as separate classes so faculty can set a number of available seats
- (Faculty) Implement assignment due dates
- 

## Contribution Breakdown
- **Akira Hanada** - Administrator Use Case (Branch: `Akira-feature-admin-use-case`)
- **Maxwell Sowell** - Faculty Use Case (Branch: `Maxwell-feature-faculty-use-case`)
- **Travis Hodo** - Student Use Case (Branch: `Travis-feature-student-use-case`)

### Akira Hanada (Administrator Use Case)
- **Business Layer**: Person class enhancements, FacultyProfile/FacultyDirectory creation, Directory class CRUD methods
- **Data Layer**: ConfigureABusiness with comprehensive test data
- **UI Panels**: All admin UI panels (8 panels total)
- **Features**: User account management, person management, student/faculty management, admin profile
- **Testing**: Validation, error handling, null checks throughout admin use case
- **Documentation**: README contributions for admin section

### Maxwell Sowell (Faculty Use Case)
- **Business Layer**: Course system (Course, CourseCatalog, CourseOffer, CourseSchedule), Assignment system, SeatAssignment, FacultyAssignment
- **Data Layer**: Course, assignment, and enrollment test data in ConfigureABusiness
- **UI Panels**: All faculty UI panels (9 panels total)
- **Features**: Course management, grade management with validation, performance reports, student profile viewing, faculty profile management
- **Testing**: Grade validation testing, course CRUD operations
- **Documentation**: README contributions for faculty section

### Travis Hodo (Student Use Case)
- 


---


## Code Attribution
- All admin-related code signed with `@author Akira Hanada`
- All faculty-related code signed with `@author maxwellsowell`
- All student-related code signed with `@author Travis Hodo`
- Shared business classes include multiple author tags where applicable

## Repository Guidelines
- Main branch must be runnable at all times
- Each team member works on their feature branch
- Minimum 30 commits on main branch
- Each member minimum 10 commits on their branch
- Each member minimum 5 pull requests

## License
Educational project for INFO5100 - Northeastern University
