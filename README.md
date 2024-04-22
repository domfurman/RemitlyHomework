# Remitly Homework
This project is a solution for the Remilty homework assignement.

## Overview
The project provides functionalities to handle JSON file, with the format defined as *AWS::IAM::RolePolicy*.

## Getting started

### Prerequisites
* [JDK Java Development Kit](https://www.oracle.com/java/technologies/downloads/)
* [Maven](https://maven.apache.org/download.cgi)
### JSON File
The application is configured to search for **policy.json** file. It should be stored inside **RemitlyHomework** directory.
### Installation
1. Clone the repository:
```bash
git clone https://github.com/domfurman/RemitlyHomework
```
2. Navigate to the project directory:
```bash
cd RemitlyHomework
```
3. Compile the project:
```bash
mvn compile
```
4. Run:
```bash
mvn exec:java
```

5. If you wish to run tests:
```bash
mvn test
```