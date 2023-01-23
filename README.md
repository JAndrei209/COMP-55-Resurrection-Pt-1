# Issues


## Issue 1: Extra Classes are still include but not Used
* Many of the classes and functions were never used in the actual game but were still included in case they were ever needed (example: composer class, spawner class, hit circle class, Conveyor Class, Etc.) 
* Steps:
- Identify which functions and classes are not used
- Decide whether to keep them by integrating them into the current game, or delete them.



## Issue 2: Project lacks any pseudo code or explanation of important functions
* Most of the functions and variables do not have pseudocode, so it is difficult to understand how the program actually functions without initially working on it
* Steps:
- Identify the overall purpose of the game and summarize each class
- Relate each function to it's respective class
- Explain how different functions and classes relate to each other


## Issue 3:  Map_Graphics class has a lot of redundant code
* Condition statements and for loops in the Map_Graphics class have a lot repeating code
* Steps: 
  - create a new class for condition statements that iterate through an array of choices instead of pasting the same text over and over again. 

