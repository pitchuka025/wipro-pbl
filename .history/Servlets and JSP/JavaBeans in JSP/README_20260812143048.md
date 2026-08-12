# Assignment Solutions - Servlets and JSP

## Assignment 2: Servlet Request Forwarding

**Objective:** Create a servlet that forwards requests to different JSP pages based on input value.

### Files:
- `assignment2_q.html` - HTML form to input a number
- `OperationServlet.java` - Servlet that routes based on input
- `page1.jsp` - Displays when input < 10
- `page2.jsp` - Displays when input is 10-99
- `error.jsp` - Displays when input >= 100

### How It Works:
1. User enters a number in the HTML form
2. Servlet receives the number
3. Based on value:
   - **< 10** → Forward to page1.jsp
   - **10-99** → Forward to page2.jsp
   - **>= 100** → Forward to error.jsp

### Steps to Run:
```
1. Compile OperationServlet.java
2. Deploy to Tomcat
3. Configure web.xml mapping for OperationServlet
4. Place all JSP files in application root
5. Access http://localhost:8080/yourapp/assignment2_q.html
```

---

## Assignment 3: Employee CRUD Application

**Objective:** Create a complete CRUD application with HTML, Servlet, JSP, JavaBean, and Database.

### Files:
- `assignment3.html` - Employee registration form
- `Employee.java` - JavaBean with name, id, designation
- `DatabaseConnection.java` - Database connection and operations
- `EmployeeServlet.java` - Handles employee insertion
- `DisplayEmployeeServlet.java` - Displays all employees
- `EditEmployeeServlet.java` - Edit employee record
- `DeleteEmployeeServlet.java` - Delete employee record
- `employee_success.jsp` - Success page after insert
- `employee_error.jsp` - Error page
- `display_employees.jsp` - Display all employees with Edit/Delete options
- `edit_employee.jsp` - Edit form
- `delete_result.jsp` - Delete result
- `update_result.jsp` - Update result
- `database_setup.sql` - Database creation script

### Database Setup:

**Step 1: Create Database**
```sql
-- Run this in MySQL/Oracle
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE emp (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    designation VARCHAR(100) NOT NULL
);
```

Or import the `database_setup.sql` file.

**Step 2: Update DatabaseConnection.java**
```java
private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

### How It Works:

**1. Add Employee:**
- Fill form in assignment3.html
- Click "Add Employee"
- Data sent to EmployeeServlet
- Inserted into database via DatabaseConnection
- Success/Error page displayed

**2. View Employees:**
- Click "View All Employees"
- DisplayEmployeeServlet fetches all records
- display_employees.jsp shows table with Edit/Delete buttons

**3. Edit Employee:**
- Click "Edit" button
- EditEmployeeServlet fetches employee data
- edit_employee.jsp shows form with current data
- Update data and submit
- Database updated

**4. Delete Employee:**
- Click "Delete" button
- DeleteEmployeeServlet deletes from database
- Confirmation message shown

### Steps to Deploy:

**Step 1: Setup Database**
```
1. Open MySQL/Oracle
2. Run database_setup.sql
3. Verify emp table is created
```

**Step 2: Copy Files**
```
1. Copy all .java files to: Tomcat\webapps\yourapp\WEB-INF\classes\
2. Copy all .jsp files to: Tomcat\webapps\yourapp\
3. Copy assignment3.html to: Tomcat\webapps\yourapp\
```

**Step 3: Compile Java Files**
```
cd Tomcat\webapps\yourapp\WEB-INF\classes\
javac -cp "C:\xampp\tomcat\lib\servlet-api.jar:mysql-connector-java.jar" *.java
```

**Step 4: Configure web.xml**
```xml
<!-- Add to web.xml -->
<servlet>
    <servlet-name>EmployeeServlet</servlet-name>
    <servlet-class>EmployeeServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>EmployeeServlet</servlet-name>
    <url-pattern>/EmployeeServlet</url-pattern>
</servlet-mapping>

<servlet>
    <servlet-name>DisplayEmployeeServlet</servlet-name>
    <servlet-class>DisplayEmployeeServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>DisplayEmployeeServlet</servlet-name>
    <url-pattern>/DisplayEmployeeServlet</url-pattern>
</servlet-mapping>

<servlet>
    <servlet-name>EditEmployeeServlet</servlet-name>
    <servlet-class>EditEmployeeServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>EditEmployeeServlet</servlet-name>
    <url-pattern>/EditEmployeeServlet</url-pattern>
</servlet-mapping>

<servlet>
    <servlet-name>DeleteEmployeeServlet</servlet-name>
    <servlet-class>DeleteEmployeeServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>DeleteEmployeeServlet</servlet-name>
    <url-pattern>/DeleteEmployeeServlet</url-pattern>
</servlet-mapping>
```

**Step 5: Start Tomcat and Access**
```
http://localhost:8080/yourapp/assignment3.html
```

### Features:
✓ Add new employee  
✓ View all employees  
✓ Update employee details  
✓ Delete employee  
✓ Database persistence  
✓ Error handling  
✓ Responsive UI  

---

## Important Notes:

1. **Database Connection:** Make sure MySQL/Oracle is running before starting application
2. **JDBC Driver:** Add mysql-connector-java.jar to classpath
3. **Servlet Mapping:** Configure web.xml properly
4. **File Placement:** Keep JSP and HTML in application root, classes in WEB-INF\classes
5. **Tomcat:** Keep Tomcat running while using the application

---

## Troubleshooting:

**Database Connection Error:**
- Check if MySQL is running
- Verify credentials in DatabaseConnection.java
- Check if emp table exists

**File Not Found Error:**
- Verify JSP files are in correct folder
- Check web.xml mapping
- Restart Tomcat after deployment

**Compilation Error:**
- Ensure servlet-api.jar is in classpath
- Check Java syntax
- Verify all dependencies are available
