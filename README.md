# DiscMathPromblemRecursiveSolution calculates the total number of discs and all rows and columns for each stage for the following problem
 The problem consists of deriving a recursive and closed form solution that will count the total number of discs needed to create the following structure for the n^th stage. 
 Stage 1 will have a stack of 3 discs. Stage 2 is created by placing 1 disc on top of the existing stack, and then laying 2 stacks each with 2 discs beside the existing stack to create a triangular arrangement. You should have 3 stacks of discs, one with 4 discs and 2 with 2 discs. Stage 3 is created by placing 1 disc on top of each existing stack, and then placing stacks of 2 discs beneath the existing arrangement to create a larger triangular arrangement. Stage 𝑛 continues in the same fashion, placing 1 disc on each existing stack and then creating a larger triangular arrangement by placing stacks of 2 discs beneath the existing arrangement.



Compile: javac *.java

Run: java driver.java

Then enter number of iterations, after calculation is done enter 1 to run again 2 to leave.

