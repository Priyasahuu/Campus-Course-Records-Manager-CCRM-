# Campus Course Records Manager (CCRM)

Campus Course Records Manager (CCRM) is a console-based Java application designed to help academic institutions efficiently manage students, courses, enrollments, grades, and transcripts. The application demonstrates robust object-oriented programming principles, effective use of Java SE features including streams, lambdas, NIO.2 file operations, and design patterns such as Singleton and Builder.

## Table of Contents

- [Features](#features)  
- [Installation](#installation)  
- [Usage](#usage)  
- [Java Platform Overview](#java-platform-overview)  
- [Java ME vs SE vs EE](#java-me-vs-se-vs-ee)  
- [JDK, JRE, JVM Explained](#jdk-jre-jvm-explained)  
- [Project Structure](#project-structure)  
- [Technical Highlights](#technical-highlights)  
- [Screenshots](#screenshots)  
- [Test Data](#test-data)  
- [License](#license)  
- [Acknowledgments](#acknowledgments)  

---

## Features

- Manage students: create, update, list, deactivate  
- Manage courses: add, modify, search by instructor/department/semester, deactivate  
- Enroll and unenroll students in courses with credit limits  
- Record grades, compute letter grades and GPA, print transcripts  
- Import/export data with CSV-like plain files and backup data using NIO.2  
- Menu-driven CLI interface supporting all operations  
- Demonstrates advanced Java concepts: encapsulation, inheritance, abstraction, polymorphism, lambdas, streams, exception handling  
- Includes custom exceptions, assertions, nested classes, interfaces, enums, and design patterns such as Singleton and Builder  

---

## Installation

1. **Install Java SE (JDK 17 or later)**  
   Download and install from the official Oracle website or OpenJDK. Verify installation via:  

2. **Clone the repository**  
git clone https://github.com/Priyasahuu/Campus-Course-Records-Manager-CCRM-.git

3. **Set up your IDE (optional)**  
Import as an existing Java project into Eclipse or your preferred IDE. Ensure project uses JDK 17+.  
Setup run configuration for the main class `edu.ccrm.cli.Main`.

4. **Build and run via command line (optional)**  
Compile:  
Run:  

---

## Usage

- Launch the program to see the menu-driven interface
- Manage students, courses, enrollments, and grades via options
- Import/export data using sample CSV files from `/test-data` directory
- Perform backup operations that create timestamped archives of the data
- Generate and print student transcripts and GPA distribution reports  
- Follow prompts carefully; error handling ensures robustness  

---

## Java Platform Overview

- Java evolution:  
- 1995: Java 1.0 released  
- 2004: Java 5 introduced generics and enums  
- 2014: Java 8 introduced lambdas and streams  
- 2017 onward: Java 9, 11 (LTS), 17 (LTS) adding modularity and long-term support  

---

## Java ME vs SE vs EE

| Aspect          | Java ME                    | Java SE                    | Java EE                              |
|-----------------|----------------------------|----------------------------|-------------------------------------|
| Primary Usage   | Embedded/mobile devices     | Desktop and server apps    | Enterprise web and applications     |
| Supported APIs  | Limited, compact            | Full core Java libraries   | Includes Java SE + enterprise APIs  |
| Example Devices | Feature phones, IoT devices | Desktop apps, tools        | Web servers, application servers    |

---

## JDK, JRE, JVM Explained

- **JDK (Java Development Kit):** Tools and libraries necessary to develop Java applications, including compiler and runtime.  
- **JRE (Java Runtime Environment):** Libraries and JVM needed to run Java applications but not develop them.  
- **JVM (Java Virtual Machine):** Interprets compiled Java bytecode to machine instructions, offering platform independence.  

---

## Project Structure

- `edu.ccrm.domain`: Entity classes representing students, courses, instructors, enrollment, grades.  
- `edu.ccrm.service`: Business logic for managing data and operations.  
- `edu.ccrm.io`: Input/output classes handling file import/export and data backup.  
- `edu.ccrm.cli`: Command line interface and application entry point.  
- `edu.ccrm.util`: Utility and helper classes including validators, comparators, recursion helpers.  

---

## Technical Highlights

- Statically typed Java with encapsulation, inheritance, polymorphism, and abstraction  
- Use of functional interfaces, lambdas, and stream API for filtering, sorting, and aggregating data  
- Exception handling with custom exceptions for domain-specific error conditions  
- File handling via Java NIO.2 APIs including directory traversal and file copying  
- Use of DateTime API for timestamps in enrollment dates and backups  
- Design patterns: Singleton for configuration, Builder for constructing complex objects  
- Use of enums for semesters and grades, nested and anonymous classes for encapsulated behaviors  
- Assertions used for runtime invariants and validation  

---

## Screenshots
<img width="1919" height="979" alt="Screenshot 2025-09-25 200252" src="https://github.com/user-attachments/assets/52d0cc60-20f0-4e1f-8896-db858bbc12e2" />
<img width="1919" height="976" alt="Screenshot 2025-09-25 200236" src="https://github.com/user-attachments/assets/ae48729d-3887-4f38-a893-840d8613707b" />
<img width="1919" height="881" alt="Screenshot 2025-09-25 200217" src="https://github.com/user-attachments/assets/7f97cf2c-4c97-43a5-bbbb-fce530eb64b4" />
<img width="1919" height="681" alt="Screenshot 2025-09-25 200106" src="https://github.com/user-attachments/assets/bfdb891a-15d7-46fc-a4c9-8d0942cc6ccc" />
<img width="1919" height="983" alt="Screenshot 2025-09-25 200003" src="https://github.com/user-attachments/assets/9083bb91-c641-4778-ae49-de2849e2b015" />
<img width="1919" height="1079" alt="Screenshot 2025-09-25 195917" src="https://github.com/user-attachments/assets/45ac6343-2854-4ff2-9dcc-f2ca45521eb3" />
<img width="1919" height="1078" alt="Screenshot 2025-09-25 195902" src="https://github.com/user-attachments/assets/af537133-bd6a-4279-9333-fe994e55cc89" />
<img width="1919" height="1079" alt="Screenshot 2025-09-25 195751" src="https://github.com/user-attachments/assets/3885305b-a0d9-407c-b4a0-6a58881c23b8" />
<img width="1869" height="1022" alt="Screenshot 2025-09-25 195653" src="https://github.com/user-attachments/assets/fbfff2dc-0f41-4b11-b868-81d29e85ec1d" />



## Test Data

files student, course, and enrollment data are provided in the `/test-data` directory for testing import/export features.



## Acknowledgments

- Official Java SE documentation and tutorials  
- Open-source educational projects inspiring this manager  
- Community support and Stack Overflow contributors  

---

This README provides all necessary project overview, requirements, setup instructions, usage guidance, and technical context for Campus Course Records Manager (CCRM).

