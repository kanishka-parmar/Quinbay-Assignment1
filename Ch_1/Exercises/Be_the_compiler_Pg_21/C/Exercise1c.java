package Ch_1.Exercises.Be_the_compiler_Pg_21.C;

//Question:-
/*
 class Exercise1c {
    int x = 5;
    while (x > 1) {
    x = x - 1;
    if (x < 3) {
    System.out.println("small x");
    }
    }
    }
 */

 //Solution:-
 /*
  The above code misses the method. Loop cant be just put inside the class without method
  To compile it successfully we will add the method i.e. public static void main(String [] args) as in below code
  */

public class Exercise1c {
    public static void main(String[] args) { // method
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}

//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_1> javac Exercises\Be_the_compiler_Pg_21\C\Exercise1c.java 
PS G:\Quinbay-Assignment1\Ch_1> java Exercises\Be_the_compiler_Pg_21\C\Exercise1c.java  
small x
small x
 */

