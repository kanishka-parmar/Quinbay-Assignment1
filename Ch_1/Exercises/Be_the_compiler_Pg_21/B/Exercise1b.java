package Ch_1.Exercises.Be_the_compiler_Pg_21.B;

//Question:-
/*
  public static void main(String [] args) {
    int x = 5;
    while ( x > 1 ) {
    x = x - 1;
    if ( x < 3) {
    System.out.println("small x");
    }
    }
    } */

//Solution:-
/* 
 The above given code will not compile as it doesnt have class declaration.
This can be compiled successfully by adding the class declaration as given below-
*/



public class Exercise1b { //class declaration
    public static void main(String [] args) {
        int x = 5;
        while ( x > 1 ) {
        x = x - 1;
        if ( x < 3) {
        System.out.println("small x");
        }
        }
        } 
}

//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_1> javac Exercises\Be_the_compiler_Pg_21\B\Exercise1b.java 
PS G:\Quinbay-Assignment1\Ch_1> java Exercises\Be_the_compiler_Pg_21\B\Exercise1b.java  
small x
small x
 */

