# Task 1.2 Exceptions Level 1

### Description - Statement of the exercise 📄

App developed in Java using an ArrayList, custom methods, and exceptions (including custom ones) to manage data and handle errors. Inheritance concepts and error handling with throws (basic) are also applied.
#### Exercise 1
Create a class called "Product" with the attributes name and price, and another class called "Sale." This class has a collection of products and the total sale price as attributes.

The "Sale" class has a method called calculateTotal() that throws the custom exception "SaleBuidaException" and displays "To make a sale, you must first add products" if the product collection is empty. If the collection contains products, it must iterate over it and save the sum of all product prices in the total sale price attribute.

The custom exception "SaleEmptyException" must be a child class of the Exception class. We must pass the message "To make a sale, you must first add products" to its constructor and, when catching the exception, display it using the exception's getMessage() method.

Write the code needed to throw and catch an "IndexOutOfBoundsException."

### Technologies Used 💻
- **IDE:** IntelliJ IDEA  

## How to Run the Exercises? 🚀

To compile and run these exercises, you will need:

* Java Development Kit (JDK), version 10 or higher.
* An IDE such as IntelliJ IDEA
 or Eclipse.

Simply clone the repository, open the project in your IDE, and run the main file of each exercise.

## Instructions for Reviewers ✍️

Thank you very much for taking the time to review my code! 😊 To ensure the review is as requested, please focus on the following points:

* Best practices: Does the code follow Java conventions? (Variable names, methods, etc.).
* Logic and efficiency: Is the solution correct and does it work? Could it be done in a simpler or more efficient way?
* Code clarity: Is it easy to read and understand? That would really help me improve as a programmer.

Leave your feedback

Please leave your comments and suggestions by creating an "Issue" in this repository. If it’s a comment on a specific line, you can do it directly in the "commit".
