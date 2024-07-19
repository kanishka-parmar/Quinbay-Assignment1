package Ch_4.Exercise.Pg_88_Be_The_Compiler.A;

//Question:-
/*
Each of the Java files on this page represents a complete source file.
Your job is to play compiler and determine whether each of these files
will compile. If they won’t compile, how would you
fix them, and if they do compile, what would be their output?

A 
class XCopy {
public static void main(String[] args) {
int orig = 42;
XCopy x = new XCopy();
int y = x.go(orig);
System.out.println(orig + " " + y);
}
int go(int arg) {
arg = arg * 2;
return arg;
}
}
 */

//Solution:-
/*
This code will compile and run successfully and will give output-
42 84
 */

public class XCopy {
    public static void main(String[] args) {
    int orig = 42;
    XCopy x = new XCopy();
    int y = x.go(orig);
    System.out.println(orig + " " + y);
    }
    int go(int arg) {
    arg = arg * 2;
    return arg;
    }
    }


//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_4\Exercise\Pg_88_Be_The_Compiler\A> javac XCopy.java
PS G:\Quinbay-Assignment1\Ch_4\Exercise\Pg_88_Be_The_Compiler\A> java XCopy.java 
42 84
 */