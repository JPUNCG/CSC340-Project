# Software Requirements Specification  
## For RentalBooking  

Version 0.1  
Prepared by Jeethesh Pallinti & Teo Kim  
CSC340  
May 26, 2025  

Table of Contents
=================
* [Revision History](#revision-history)
* 1 [Introduction](#1-introduction)
  * 1.1 [Document Purpose](#11-document-purpose)
  * 1.2 [Product Scope](#12-product-scope)
  * 1.3 [Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
  * 1.4 [References](#14-references)
  * 1.5 [Document Overview](#15-document-overview)
* 2 [Product Overview](#2-product-overview)
  * 2.1 [Product Functions](#21-product-functions)
  * 2.2 [Product Constraints](#22-product-constraints)
  * 2.3 [User Characteristics](#23-user-characteristics)
  * 2.4 [Assumptions and Dependencies](#24-assumptions-and-dependencies)
* 3 [Requirements](#3-requirements)
  * 3.1 [Functional Requirements](#31-functional-requirements)
    * 3.1.1 [User Interfaces](#311-user-interfaces)
    * 3.1.2 [Hardware Interfaces](#312-hardware-interfaces)
    * 3.1.3 [Software Interfaces](#313-software-interfaces)
  * 3.2 [Non-Functional Requirements](#32-non-functional-requirements)
    * 3.2.1 [Performance](#321-performance)
    * 3.2.2 [Security](#322-security)
    * 3.2.3 [Reliability](#323-reliability)
    * 3.2.4 [Availability](#324-availability)
    * 3.2.5 [Compliance](#325-compliance)
    * 3.2.6 [Cost](#326-cost)
    * 3.2.7 [Deadline](#327-deadline)

## Revision History  
| Name | Date    | Reason For Changes | Version |
|---------|------|--------------------|---------|
| JP & TK | 5/26 | Initial Draft      |   1.0   |


## 1. Introduction

### 1.1 Document Purpose  
This document explains what the RentalBooking system should do. It helps both the users and the developers understand the goals and requirements of the application.

### 1.2 Product Scope  
RentalBooking is a web app where people can rent vacation homes. Providers list properties, and customers can browse and rent them. Both sides can review each other. The app is designed to be easy to use and quick to navigate.

### 1.3 Definitions, Acronyms and Abbreviations  
| Term       | Meaning                                                                                                                                                                            |
|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Customer   | A person who rents a vacation home using the app                                                                                                                                   |
| Provider   | A person who lists a vacation home on the app                                                                                                                                      |
| Review     | A written rating of the home or experience                                                                                                                                         |
| Rental     | The act of a customer reserving a home                                                                                                                                             |
| Java       | A programming language originally developed by James Gosling at Sun Microsystems. We will be using this language to build Class Connect.                                           |
| Postgresql | Open-source relational database management system.                                                                                                                                 |
| SpringBoot | An open-source Java-based framework used to create a micro Service. This will be used to create and run our application.                                                           |
| Spring MVC | Model-View-Controller. This is the architectural pattern that will be used to implement our system.                                                                                |
| Spring Web | Will be used to build our web application by using Spring MVC. This is one of the dependencies of our system.                                                                      |
| API        | Application Programming Interface. This will be used to interface the backend and the fronted of our application.                                                                  |
| HTML       | Hypertext Markup Language. This is the code that will be used to structure and design the web application and its content.                                                         |
| CSS        | Cascading Style Sheets. Will be used to add styles and appearance to the web app.                                                                                                  |
| JavaScript | An object-oriented computer programming language commonly used to create interactive effects within web browsers.Will be used in conjuction with HTML and CSS to make the web app. |
| VS Code    | An integrated development environment (IDE) for Java. This is where our system will be created.                                                                                    |

### 1.4 References  
- https://spring.io/guides  

### 1.5 Document Overview  
Section 1 introduces the project. Section 2 explains what the system does and who uses it. Section 3 lists all the requirements the system must meet.

---

## 2. Product Overview

### 2.1 Product Functions  
- Customers:
  - Create and edit their profile
  - Browse and filter properties
  - Rent a property
  - Review a property after staying
- Providers:
  - Create and manage property listings
  - Track reviews and statistics
  - Respond to customer reviews

### 2.2 Product Constraints  
- Only runs on systems with Java JDK 21  
- Relies on a free PostgreSQL database  
- Must be completed within a few weeks  
- May not support large user base initially

### 2.3 User Characteristics  
- Users only need basic web browser skills  
- App is simple enough to learn in a few minutes  
- Users include both tech-savvy and non-technical individuals

### 2.4 Assumptions and Dependencies  
- Built using Java, SpringBoot, and PostgreSQL  
- Developed in VS Code  
- Will use World Time API for time zone support  

---

## 3. Requirements

### 3.1 Functional Requirements  
- FR1: Customers can create, edit or remove their profile  
- FR2: Providers can create, edit, or remove their profile  
- FR3: Providers can list properties with images and details  
- FR4: Customers can view and filter listings  
- FR5: Customers can rent a listed property  
- FR6: Customers can leave reviews after renting  
- FR7: Providers can see customer reviews and stats  
- FR8: Providers can reply to reviews  

#### 3.1.1 User Interfaces  
- Web pages built using HTML, CSS, JavaScript  

#### 3.1.2 Hardware Interfaces  
- Requires devices that can run a modern web browser  

#### 3.1.3 Software Interfaces  
- Java JDK 21  
- PostgreSQL  
- SpringBoot  

---

### 3.2 Non-Functional Requirements  

#### 3.2.1 Performance  
- NFR0: The app should use under 100MB memory  
- NFR1: New users can book a home within 5 minutes
- NFR2: New providers can list a home within 5 minutes

#### 3.2.2 Security  
- NFR3: Only registered users can access the app. Login is required using username and password. 

#### 3.2.3 Reliability 

#### 3.2.4 Availability  
- NFR4: App should be available 24/7. Maintenance should happen on low-traffic days  

#### 3.2.5 Compliance  

#### 3.2.6 Cost  
- NFR5: No money will be spent to build this app  

#### 3.2.7 Deadline  
- NFR6: Final product is due by June 18, 2025  