package Ch_1.Exercises.Be_the_compiler_Pg_21.A;

//Question:-
/* 
Each of the Java files on this page represents a complete source file. Your job is to play compiler and determine whether each of these files will compile. If they won’t compile, how would you fix them?
class Exercise1a {
    public static void main(String[] args) {
    int x = 1;
    while (x < 10) {
    if (x > 3) {
    System.out.println("big x");
    }
    }
    }
    }
*/

/*
Solution:-
This will go in infinite loop. To avoid infinite loop we will need to increment x value as in below code
*/

public class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
          x=x+1;     // increment x value
        if (x > 3) {
        System.out.println("big x");
        }
    }
    }
}

//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_1> javac Exercises\Be_the_compiler_Pg_21\A\Exercise1a.java 
PS G:\Quinbay-Assignment1\Ch_1> java Exercises\Be_the_compiler_Pg_21\A\Exercise1a.java 
big x
big x
big x
big x
big x
big x
big x
 */
