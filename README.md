# ToDoList

The To-Do List Application is a simple yet powerful task management tool designed to help users organize their daily activities efficiently. Built using Spring Boot for the backend and PostgreSQL for database management, the application offers a REST API to handle all CRUD (Create, Read, Update, Delete) operations for tasks. The frontend, developed with HTML, CSS, and JavaScript, provides a clean and responsive interface for users to add, edit, delete, and mark tasks as completed.

This project follows the MVC architecture, ensuring a clear separation of concerns and easy maintainability. It demonstrates seamless integration between the backend API and frontend, making it an ideal example of a full-stack web application.

Key Features:

! Create, view, update, and delete tasks

! Responsive and user-friendly interface

! RESTful API integration with frontend

! PostgreSQL database for secure and efficient data storage

! Follows MVC architecture for clean code organization

Technologies Used:

! Backend: Java, Spring Boot, REST API

! Frontend: HTML, CSS, JavaScript

! Database: PostgreSQL

 📸 Screenshots


 <img width="552" height="402" alt="todohtml" src="https://github.com/user-attachments/assets/b6f99cd1-d12f-480b-a19d-86df483f23e3" />












 
 
 
 
 <img width="1545" height="833" alt="todojava" src="https://github.com/user-attachments/assets/b10e975a-9521-489c-9af3-ce10077d2bb4" />


















🛢️ Database Schema:


CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    status boolean default false,
);




