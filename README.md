# Employee Payroll App

## Overview
The **Employee Payroll App** is a Spring Boot application that provides CRUD operations for managing employee payroll data. It follows a structured development approach with different branches for each use case.

## Branches and Features

### 1️⃣ **main**
- The primary branch containing the latest stable version of the project.

### 2️⃣ **default**
- Default project setup with initial configurations.

### 3️⃣ **UC1-EmployeePayrollAppSetup**
- Sets up the basic structure of the Employee Payroll Application.
- Includes dependencies, initial project files, and configurations.

### 4️⃣ **UC2-CRUD_Operations**
- Implements **CRUD (Create, Read, Update, Delete)** operations for managing employees.
- Uses an `EmployeeController` to handle API requests.
- `EmployeeService` interacts with an in-memory list for temporary storage.
- `EmployeeRepository` (for future database integration).
- API Endpoints:
  - `GET /employees` - Fetch all employees.
  - `GET /employees/{id}` - Fetch an employee by ID.
  - `POST /employees` - Add a new employee.
  - `PUT /employees/{id}` - Update an existing employee.
  - `DELETE /employees/{id}` - Delete an employee.

### 5️⃣ **UC3-dto**
- Introduces **Data Transfer Objects (DTOs)** to separate request/response models from database entities.
- `EmployeeDTO` is used to transfer employee data between layers.

### 6️⃣ **UC4-servicelayer**
- Enhances the **Service Layer** by storing employee payroll data in memory (`List<Employee>`).
- Implements a unique **employee ID generator** for in-memory storage.
- Prepares the project for **future database integration**.

###  **UC4-servicelayer**
- Enhances security.

## How to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo-url.git
