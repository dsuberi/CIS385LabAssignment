## Modular Assignment - Stack Game
 
### Question 1

Using the push and pop function of the stack data structure, design a puzzle game to sort the numbers so that three stacks are filled with the same numbers to complete the game. The application should use 5 stacks of capacity four (4), and use four sets of three numbers ([1,1,1,1][2,2,2,2][3,3,3,3]). See the structure below. The program should count the number of moves made to solve the puzzle.

<img title="a title" alt="Alt text" src="images/Stack%20Sort%20It.JPG"/>

Design an interactive game where you offer the user to move numbers from one stack to another using the push and pop function until 3 stacks out of 5 contain the same number to mark the end of the game.
Example:

```Java
Menu:
1. Display Stack
2. Make a Move
------------------
Enter your choice: 1

Displaying Stack
S1: 3,3,2,1
S2: 1,1,2,2
S3: 2,3,3,1
S4: Empty
S5: Empty

Menu:
1. Display Stack
2. Make a Move
------------------
Enter your choice: 2
Choose a stack to move FROM: 1
Choose a stack to move TO: 4

Menu:
1. Display Stack
2. Make a Move
------------------
Enter your choice: 1

Displaying Stack
S1: 3,3,2
S2: 1,1,2,2
S3: 2,3,3,1
S4: 1
S5: Empty

```

Finally, the game is complete when you have the same number in 3 stacks (see below). It does not matter which stacks but there should be 3 stacks with the same numbers.

```
Displaying Stack
S1: 1,1,1,1
S2: 2,2,2,2
S3: Empty
S4: 3,3,3,3
S5: Empty
```

### Submission
Your submission should include the following files:
- Stack.java
- Game.java

Submit your work via the Canvas.
