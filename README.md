# Employee-Crud-via-SpringBoot

This project is a simple Employee Management System developed using Spring Boot framework. It provides basic CRUD (Create, Read, Update, Delete) operations for managing employee records.
<br>

**Features**
- **View All Employees**: Retrieve a list of all employees stored in the system.
- **View Employee Details**: Retrieve details of a specific employee by their ID.
- **Create Employee**: Add a new employee to the system.
- **Update Employee**: Modify the details of an existing employee.
- **Delete Employee**: Remove an employee from the system.

Technologies Used
- **Spring Boot**: Framework for building Java-based applications.
- **Spring Data JPA**: Provides support for working with databases using Java Persistence API (JPA).
- **H2 Database**: In-memory relational database for development and testing purposes.
- **Postman**: API development environment used for testing and interacting with the application endpoints.
- **Maven**: Dependency management tool for Java projects.

**API Endpoints**
- **GET /employees**: Retrieve all employees.
- **GET /employee/{id}**: Retrieve details of a specific employee by ID.
- **POST /createEmployee**: Create a new employee.
- **PUT /updateEmployee/{id}**: Update details of an existing employee.
- **DELETE /deleteEmployee/{id}**: Delete an employee by ID.

**Sample JSON Payloads** <br>
- Create Employee

```json
{
    "employeeId":1,
    "employeeName":"Yash Mehta",
    "employeeCity":"India",

    "spouse" : {
        "name": "Derek",
        "mobileNo":"877054234",
        "age":"30"
    },

    "addresses": [{
        "line1":"Classic",
        "line2":"Villa",
        "zipCode":"B-6",
        "city":"Indore",
        "state":"Madhya Pradesh",
        "country":"India"
    },
    {
        "line1":"Pardesipura",
        "line2":"Chouraha",
        "zipCode":"105",
        "city":"Tempa",
        "state":"UK",
        "country":"United States"
    }
    ],
    "projects": [{
        "name":"Aflac",
        "clientName": "Cognizant"
    },
    {
        "name":"Wizland",
        "clientName": "TCS"
    }
    ]
}
```

- Update Employee
```json
{
    "employeeId":1,
    "employeeName":"Yash",
    "employeeCity":"India",

    "spouse" : {
        "name": "Derek",
        "mobileNo":"87705-42341",
        "age":"28"
    },

    "addresses": [{
        "line1":"Classic",
        "line2":"Villa",
        "zipCode":"B-6",
        "city":"Indore",
        "state":"Madhya Pradesh",
        "country":"India"
    },
    {
        "line1":"Pardesipura",
        "line2":"Chouraha",
        "zipCode":"105",
        "city":"Tempa",
        "state":"UK",
        "country":"United States"
    }
    ],
    "projects": [{
        "name":"Aflac",
        "clientName": "Cognizant"
    },
    {
        "name":"Wizland",
        "clientName": "TCS"
    }
    ]
}
```

- For the "Delete Employee," "List of Employees," and "Find Individual Employee" operations, no payload is needed. You can directly hit the API endpoints to retrieve the desired output.

<br> <br>
## Application Screenshots

- Updating Employee
 <img width="1506" alt="image" src="https://github.com/Yash919/Employee-Crud-via-SpringBoot/assets/60219195/8553e728-4bad-4602-9652-c713311fe32e">
<br>
- H2 Database <br> 
   <img width="519" alt="image" src="https://github.com/Yash919/Employee-Crud-via-SpringBoot/assets/60219195/30756be4-8639-4dc4-9ac5-25287f798524">

 <img width="794" alt="image" src="https://github.com/Yash919/Employee-Crud-via-SpringBoot/assets/60219195/a79e81a7-5909-4bc4-b7cc-3bc2cf75cb4e">



**Contributor** <br> 
   -Yash Mehta- 🚀
