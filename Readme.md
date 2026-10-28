# Lab 07: Construction for Reuse

**Course:** Software Construction and Development  
**Department:** Software Engineering  
**Semester:** 5th  
**University:** University of Engineering & Technology, Peshawar, Pakistan

## Student Information

- **Name:** Hashir Azeem
- **Registration No.:** 24ABSWE0002
- **Submitted To:** Engr. Rizwan Shah

## Project Overview

This project demonstrates important software engineering principles for reusable, maintainable, and type-safe Java applications. It covers interfaces, generics, the Liskov Substitution Principle (LSP), and reusable ordering algorithms using `Comparable` and `Comparator`.

## Technologies Used

- Java
- Apache NetBeans IDE
- Maven

## Project Structure

```text
ConstructionReuseLab/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── software/
                └── reuse/
                    ├── task1/
                    │   ├── PaymentMethod.java
                    │   ├── CreditCardPayment.java
                    │   ├── JazzCashPayment.java
                    │   ├── EcommerceCart.java
                    │   └── Main.java
                    ├── task2/
                    │   ├── DataBox.java
                    │   └── Main.java
                    ├── task3/
                    │   ├── flawed/
                    │   └── fixed/
                    └── task4/
                        ├── Student.java
                        ├── CgpaComparator.java
                        └── Main.java
```

## Lab Tasks

### Task 1: Black-Box Reuse Using Interfaces

- Created a `PaymentMethod` interface.
- Implemented `CreditCardPayment` and `JazzCashPayment`.
- Used composition and constructor-based dependency injection in `EcommerceCart`.
- Demonstrated interchangeable payment implementations without modifying the cart class.

### Task 2: Generic Data Container

- Created a reusable generic class `DataBox<T>`.
- Used `DataBox<String>` to store a student name.
- Used `DataBox<Integer>` to store a student ID.
- Demonstrated compile-time type safety through Java generics.

### Task 3: Liskov Substitution Principle (LSP)

**Part A — Flawed Design**
- Demonstrated an LSP violation using `Rectangle` and `Square`.
- Showed how stricter preconditions in a subclass can break client code.

**Part B — Fixed Design**
- Introduced a common `Shape` interface.
- Implemented `Rectangle` and `Square` independently.
- Demonstrated safe substitution through the shared `area()` contract.

### Task 4: Reusable Ordering Algorithms

- Implemented `Comparable<Student>` for natural ordering by roll number in ascending order.
- Created `CgpaComparator` using `Comparator<Student>` for CGPA ordering in descending order.
- Used `ArrayList` and `Collections.sort()` to demonstrate both ordering strategies.

## How to Run

1. Clone or download this repository.
2. Open Apache NetBeans IDE.
3. Select **File → Open Project** and choose the `ConstructionReuseLab` folder.
4. Allow Maven to load the project and its dependencies.
5. Open the relevant `Main.java` file under the desired task package.
6. Right-click the file and select **Run File** to execute the task.

## Learning Outcomes

- Understanding interface-based design and black-box reuse.
- Applying composition and dependency injection.
- Using Java generics for compile-time type safety.
- Identifying and correcting violations of the Liskov Substitution Principle.
- Understanding the difference between `Comparable` and `Comparator`.

## Conclusion

This lab demonstrates how interfaces, composition, generics, contracts, and reusable comparison strategies contribute to maintainable and reusable software design in Java.

---

**Repository:** Add your GitHub repository URL here.

