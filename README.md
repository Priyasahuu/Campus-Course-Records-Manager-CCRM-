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



## Test Data

files student, course, and enrollment data are provided in the `/test-data` directory for testing import/export features.



## Acknowledgments

- Official Java SE documentation and tutorials  
- Open-source educational projects inspiring this manager  
- Community support and Stack Overflow contributors  

---

This README provides all necessary project overview, requirements, setup instructions, usage guidance, and technical context for Campus Course Records Manager (CCRM).
