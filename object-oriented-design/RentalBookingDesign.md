# RentalBooking - Software Design 

Version 1  
Prepared by Jeethesh Pallinti & Teo Kim\
RentalBooking\
June 4, 2025

Table of Contents
=================
* [Revision History](#revision-history)
* 1 [Product Overview](#1-product-overview)
* 2 [Use Cases](#2-use-cases)
  * 2.1 [Use Case Model](#21-use-case-model)
  * 2.2 [Use Case Descriptions](#22-use-case-descriptions)
    * 2.2.1 [Actor: Teacher](#221-actor-teacher)
    * 2.2.2 [Actor: Student](#222-actor-student) 
* 3 [UML Class Diagram](#3-uml-class-diagram)
* 4 [Database Schema](#4-database-schema)

## Revision History
| Name | Date    | Reason For Changes  | Version   |
| ---- | ------- | ------------------- | --------- |
|JP&TK |   6/4   | Initial Design      |     1     |

## 1. Product Overview
RentalBooking is a simple application for verified customers and providers to list and rent homes. Providers list properties, include images, price, amenities and other details. Customers are able to filter the listings by the providers, rent the properties and review them afterwards.

## 2. Use Cases
### 2.1 Use Case Model
![Use Case Model](https://github.com/JPUNCG/CSC340-Project/blob/7374cf3ceaf8b53473ef65f883fc160daa8dd536/object-oriented-design/Use%20case%20diagram.png)

### 2.2 Use Case Descriptions

#### 2.2.1 Actor: Provider
##### 2.2.1.1 Sign Up
A Provider can sign up to create their profile with their name, email, password, and bio. Emails must be unique.
##### 2.2.1.2 Log In
A provider shall be able to sign in using their registred email and password. After logging in, the provider shall be directed their dashboard where they see an overview of their homes, reviews and stats.
##### 2.2.1.3 Update Profile
A provider shall be to modify their profile by going to their profile page. They can change their email, password, profile picture, and biography.
##### 2.2.1.4 Create Home
The provider shall be able to create a new house listing. They would provide an address, images, description, tags.
##### 2.2.1.4 Manage Rental
A Provider shall be able to add, edit and remove homes, as well as read reviews for their homes.

#### 2.2.2 Actor: Renter
##### 2.2.2.1 Sign Up
A Renter can sign up to create their profile with their name, email, password, and bio. Emails must be unique.
##### 2.2.2.2 Log In
A Renter shall be able to sign in using their registred email and password. After logging in, the Renter shall be directed their dashboard where they see a list of homes and filters.
##### 2.2.1.3 Update Profile
A Renter shall be to modify their profile by going to their profile page. They can change their email, password, profile picture, and biography.
##### 2.2.2.4 Browse Homes
A Renter shall be able to view available Homes. They can do this from the home page or using a search function. They can also filter homes by location, tags, and price. They will also be able to select a home and view more details.
##### 2.2.1.5 Rent Home
Upon selecting a home, a renter will be able to check it out. This home will then appear on their profile, and they will be able to review the home.
##### 2.2.1.6 Review Home
A Renter may review a home from their profile.

## 3. UML Class Diagram
![UML Class Diagram](https://github.com/JPUNCG/CSC340-Project/blob/7374cf3ceaf8b53473ef65f883fc160daa8dd536/object-oriented-design/Class%20diagram.jpg)
## 4. Database Schema
![UML Database Schema](https://github.com/JPUNCG/CSC340-Project/blob/7374cf3ceaf8b53473ef65f883fc160daa8dd536/object-oriented-design/Database%20scheme.png)

