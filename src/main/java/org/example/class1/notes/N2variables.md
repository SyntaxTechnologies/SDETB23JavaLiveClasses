# INTRODUCTION TO VARIABLES

## 1) WHAT IS A VARIABLE?
A variable is like a **labeled box** in your computer's memory where you can store a piece of data.  
For example, if you have a variable named `age`, it can hold the number representing someone’s age.

Think of it this way:
- You have a box (the variable).
- You put a specific value in it (e.g., `25`).
- You label the box as `age`.

In Java, a variable needs:
- A **type** (which defines what kind of data it can hold, such as a number or text).
- A **name** (so you know how to refer to it in your code).

## 2) WHY DO WE NEED VARIABLES?
We use variables because we often need to work with data that can change or be reused throughout a program.

- If you want to display someone's age, you store it in a variable and use that variable wherever needed.
- If the age changes, you just update the variable's value in one place, instead of typing it everywhere again.

Without variables, you’d have to manually insert the data every time, making your code repetitive and harder to maintain.
## 3) HOW DO VARIABLES WORK? (EXAMPLES)

In Java, you generally **declare** (create) a variable by specifying its type and name, then **assign** a value. For example:

    int age;       // Declares a variable named 'age' to hold an integer
    age = 25;      // Assigns the value 25 to 'age'

You can also do this in **one line**:

    int numberOfStudents = 30; // Declares and assigns 30

Another example is storing text data:

    String greeting = "Hello world"; // Stores the text in 'greeting'

**Key points**:
- Use `int` for integer values (no decimal point).
- Use `String` (note the uppercase 'S') for text.
