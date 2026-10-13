# Student Management Portal

A full-stack web application developed using **React.js and Spring Boot** to manage student records through RESTful APIs.

## Technologies Used

- **Frontend:** React.js, JavaScript, HTML, CSS
- **Backend:** Java, Spring Boot, Spring Web
- **API Testing:** Postman
- **Version Control:** Git and GitHub

## Features

- Create new student records.
- Retrieve student details by ID.
- Display all student records.
- Update existing student information.
- Delete student records.
- Integrate React frontend with Spring Boot backend.
- Exchange data using JSON.
- Configure CORS for frontend-backend communication.

## Student Details

The application manages the following fields:

- Student ID (`sid`)
- First Name (`firstname`)
- Last Name (`lastname`)
- Age (`age`)
- Total Marks (`totalmarks`)
- City (`city`)

## REST API Endpoints

Base URL: `http://localhost:9898`

| Method | Endpoint | Description |
|---|---|---|
| GET | `/student/hello` | Test the API |
| GET | `/student/getStudent/{sid}` | Retrieve a student by ID |
| GET | `/student/getAllStudents` | Retrieve all students |
| POST | `/student/ss` | Create a student |
| PUT | `/student/updateStudent/{sid}` | Update student details |
| DELETE | `/student/deleteStudent/{sid}` | Delete a student |

## Application Architecture

1. React provides the user interface.
2. React sends HTTP requests to the Spring Boot backend.
3. The controller receives requests and calls the service layer.
4. The service layer processes operations and interacts with the data-access layer.
5. Spring Boot returns responses, typically in JSON format.
6. React displays the returned data to the user.

## How to Run the Project

### Backend

1. Open the Spring Boot project in Eclipse or another Java IDE.
2. Configure the database connection if required.
3. Run the Spring Boot application on port `9898`.

### Frontend

1. Open the React project folder in the terminal.
2. Install dependencies:

   ```bash
   npm install
   ```

3. Start the development server:

   ```bash
   npm run dev
   ```

4. Open `http://localhost:5173` in your browser.

## API Testing

Use Postman to test the GET, POST, PUT, and DELETE endpoints and verify the API responses.

## Future Enhancements

- Add input validation and exception handling.
- Implement search and pagination.
- Add authentication and authorization.
- Improve the UI and responsive design.
- Deploy the application online.

## Author

**Madala Jayendra**

Computer Science and Engineering

## License

This project is intended for educational and learning purposes.
