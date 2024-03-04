# Theater-Management-with-Security-Systems
Security implementations include: User Authentication, CAPTCHA, Timer Module in Payments Page, etc.,

## Introduction

Welcome to the Theater Management with Security System project! This system is designed to manage theater operations such as Selecting Movie, Booking tickets, Paying for Tickets and receiving Reciepts seamlessly, while incorporating security features such as CAPTCHA, a timer module for secure payments, and a maximum limit of wrong login credentials.

## Features

- **MySQL Database Integration:** The project uses `mysql-connector-j-8.2.0` and WAMP Server for seamless integration with a MySQL database. Ensure you have the necessary database setup before running the application.

- **CAPTCHA Security:** An added layer of security is provided with CAPTCHA to prevent automated attacks and ensure secure user interactions.

- **Timer Module for Payment Page:** The payment page includes a timer module that automatically closes the page after a specified duration, enhancing the security of the payment process.

- **Login Security:** To prevent unauthorized access, the system has a maximum limit of 5 wrong login credentials. After reaching this limit, additional security measures may be implemented to protect against potential attacks.

## Class Diagram
![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/55bffe57-03db-4309-bdd1-b602a1b521a4)


## Security Implementations

### 1. Captcha Integration

To prevent automated attacks and ensure that users are human, we have implemented a CAPTCHA system. This additional layer of security is applied to the registration, login, and other critical forms within the application.

### 2. Timer Module in Payments Page

To mitigate the risk of unauthorized access and potential fraudulent activities during payment processes, a timer module has been incorporated on the payments page. Users are required to complete the transaction within a specified time limit, enhancing the security of financial transactions.

### 3. User Authentication

User authentication is a fundamental security measure implemented to validate the identity of users. This includes secure password storage, multi-factor authentication options, and account lockout policies to protect against unauthorized access.

## Prerequisites

- Ensure you have a MySQL database and WAMP server set up.
- Install the required dependencies, including `mysql-connector-j-8.2.0`.

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems
    ```

2. Set up the MySQL database by executing the SQL scripts provided in the `database-scripts` folder.

3. Update the `config.properties` file with your MySQL database credentials.

4. Run the application and navigate to the provided URL.

## Configuration

- Modify the config.properties file to update database credentials, CAPTCHA settings, and other configuration parameters.

## Usage

### Login Page
![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/606669f3-486b-4895-b935-ec655c73f707)

![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/9c7a5f9c-41dc-4b6c-9ff5-946a21a2fc15)


### Register Window
![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/e7be2f53-9824-417c-9d75-fc78b75c42ef)


### Movie Window
![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/34547746-9003-4465-846d-a9cdf72e2bcd)


### Booking Details
![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/244fdf28-dba7-4798-a5a6-6536927b940a)


### Payment Window
![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/56770b63-263a-47a0-a05c-5e2478d3beb7)

![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/b97a0438-d5c7-4d04-82ff-bc50b91d6902)


### Receipt Window
![image](https://github.com/nitheshnataraj/Theater-Management-with-Security-Systems/assets/158607288/b556969d-4914-4577-8cba-1ad03dfa67df)


## Conclusion
Me alongside my teammates developed this theatre management system using Java Swing concepts, which are a collection of libraries, events, and Graphical User Interface components for the desktop application's design and execution. Customisation of the programme is increased by using the Swing concept. Our project tackles quite a few common security issues and provides useful solutions for problems with the Theatre Management System, including safe payment, resource allocation, and brute force attacks.


Feel free to explore the codebase, report issues, and contribute to make this project even better!
