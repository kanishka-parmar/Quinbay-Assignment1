package Ch_1.Exercises.Code_Magnets_Pg_20;

/*
 Question:-
 Code Magnets
A working Java program is all scrambled up
on the fridge. Can you rearrange the code
snippets to make a working Java program
that produces the output listed below?
Some of the curly braces fell on the floor
and they were too small to pick up, so feel
free to add as many of those as you need!

Output:-
% java Shuffle1
a-b c-d
 */

 //Solution
public class Shufflel {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}


//Output
/*
PS G:\Quinbay-Assignment1\Ch_1> javac Exercises\Code_Magnets_Pg_20/Shufflel.java                    
PS G:\Quinbay-Assignment1\Ch_1> java Exercises\Code_Magnets_Pg_20/Shufflel.java 
a-b c-d
PS G:\Quinbay-Assignment1\Ch_1>  */