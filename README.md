# Issues


## Issue 1: Extra Classes are still include but not Used
### Many of the classes and functions were never used in the actual game but were still included in case they were ever needed (example: spawner class, h) 
### Steps:
-Identify which functions and classes are not used
- Decide whether to keep them by integrating them into the current game, or delete them.
- The Program still contains useless code from the spawner class after switching our initial method of spawning objects into our game to a different method last second: our initial method was not working properly, so we had to develop a new process a week before our project was due.
- Goal is to delete any lefotover code that interacted with our previous method and allow users to identify the new method we developed more easily. 



## Issue 2: Project lacks any pseudo code or explanation of important functions
### Most of the functions and variables do not have pseudocode, so it is difficult to understand how the program actually functions without initially working on it
### Steps:
- Identify the overall purpose of the game and summarize each class
- Relate each function to it's respective class
- Explain how different functions and classes relate to each other
- Adding pseudo that allows any programmer to identify the purpose of our game and what each specific functions do. 
- Rename functions


## Issue 3:  Map_Graphics class has a lot of redundant code
### Condition statements and for loops in the Map_Graphics class have a lot repeating code
### Steps: 
  - create a new class for condition statements that iterate through an array of choices instead of pasting the same text over and over again. 
  - delete any repeating code, and add new classes that have a specific function. 
