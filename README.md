# Interview Screening Test - Full Stack Developer

## Java Version
This project uses **OpenJDK 17.0.12**:

```
openjdk 17.0.12 2024-07-16
OpenJDK Runtime Environment (build 17.0.12+7-Ubuntu-1ubuntu220.04)
OpenJDK 64-Bit Server VM (build 17.0.12+7-Ubuntu-1ubuntu220.04, mixed mode, sharing)
```

## Project Structure
```
.
├── interviewScreeningTest
│   └── interview_screening_test_FullStackDeveloper.docx
├── Question-1
│   ├── lessOptimalApproach
│   │   ├── explanation.md
│   │   ├── Response.class
│   │   └── Response.java
│   ├── mostOptimalResponse
│   │   ├── explanation.md
│   │   └── Response.java
│   └── ResponseTest.java
├── Question-2
│   ├── part-1.md
│   ├── part-2.md
│   ├── Response.class
│   ├── Response.java
│   ├── ResponseTest.class
│   └── ResponseTest.java
├── Question-3
│   ├── part-1.md
│   └── part-2.md
├── Question-4
│   └── response.md
└── README.md
```

### Location of the question paper
- The document with all the questions is located in the folder interviewScreeningTest


## Explanation of Solutions

### Question 1: Counting Occurrences in an Array
- **Less Optimal Approach:** Uses a simple loop to count occurrences. The solution is in `Response.java` inside `lessOptimalApproach/`.
- **Most Optimal Approach:** Uses **Binary Search** to find occurrences more efficiently. The optimized version is in `mostOptimalResponse/`.

#### Test File:
The correctness of both solutions is verified in `Question-1/ResponseTest.java`.

### Question 2: Climbing Stairs Problem
- **Part 1:** Explains the **Fibonacci-based** approach to solve the problem.
- **Part 2:** Implements the optimal dynamic programming solution in `Response.java`.

#### Test File:
The test cases are in `Question-2/ResponseTest.java`.

### Question 3: Problem Description
This section contains `part-1.md` and `part-2.md`, which explain and implement the required solutions.

### Question 4: General Response
The `response.md` file contains answers related to Question 4.

## How to Run the Project

1. Clone the repository:
   ```
   git clone <repository_url>
   cd <repository_folder>
   ```

2. Compile and run Java files example:
   ```
   javac Question-1/mostOptimalResponse/Response.java
   java Question-1/mostOptimalResponse/Response
   ```

3. Run tests:
   ```
   javac Question-1/ResponseTest.java
   java Question-1/ResponseTest.java
   ```

## Author
**Engineer William Perez**