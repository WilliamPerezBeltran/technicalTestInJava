# technicalTestInJava

# Question 1

Write a method that takes 2 parameters. The first parameter is an array of integers that has already been sorted from smallest to largest. The second parameter is an integer. The method should return the number of times the second parameter appears in the first parameter.

### Example:
If the first parameter is `[1, 2, 3, 3, 4, 5]` and the second parameter is `3`, the method should return `2`.

## Part 1: Explain Your Algorithm
## Part 2: Please implement the method in Java.

# Question 2

Assume you are climbing a staircase of 10 steps. Also, assume that you can only take 1 or 2 steps each time you move up the stairs. Below is an example of two different ways you can climb the staircase.

- 1, 1, 2, 2, 1, 2, 1  
- 2, 2, 2, 2, 2

Write an algorithm to calculate the total number of unique ways we can climb the staircase.

### Part 1: 
If you do a google search on this problem, you will find that one of the solutions uses the Fibonacci sequence. Explain how this solution works. You do not need to write any code.

### Part 2:
If we do not use Fibonacci sequence solution, how could we solve this problem? Please explain your algorithm.


# Question 3

Assume that someone is giving you the following requirements for developing a REST API with 2 endpoints.

## Endpoint 1: Create Car Entry (POST)
## Type POST
**URL:** /cars  
**Description:** Create a car entry

### Request:
```json
{
    "model": "Honda Civic",
    "year": 2020
}
```

### Response:
```json
{
    "id": 1
}
```

## Endpoint 2: Retrieve Car Details (GET)
**URL:** /cars/{id}  
**Description:** Retrieve car details using the provided ID (the ID is the same as the one from the response of the POST request)

### Response:
```json
{
    "model": "Honda Civic",
    "year": 2020
}
```

## API Implementation Details:
The microservice will store the car data in a database. The id of each car entry is the primary key of the record in the table.

##Part 1: What additional information do you need before you begin coding this?
##Part 2: Make some assumptions for the questions that you came up with in part 1. 
Create a list of test scenarios for the requirements listed above. Be sure to indicate what the input and expected output should be for each test.

