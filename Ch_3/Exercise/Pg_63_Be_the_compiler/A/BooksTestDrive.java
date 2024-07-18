package Ch_3.Exercise.Pg_63_Be_the_compiler.A;

//Question:-
/*
Each of the Java files on this page represents a complete source file.
Your job is to play compiler and determine whether each of these
files will compile and run without exception. If they won’t, how would
you fix them?

A
class Books {
String title;
String author;
}
class BooksTestDrive {
public static void main(String[] args) {
Books[] myBooks = new Books[3];
int x = 0;
myBooks[0].title = "The Grapes of Java";
myBooks[1].title = "The Java Gatsby";
myBooks[2].title = "The Java Cookbook";
myBooks[0].author = "bob";
myBooks[1].author = "sue";
myBooks[2].author = "ian";
while (x < 3) {
System.out.print(myBooks[x].title);
System.out.print(" by ");
System.out.println(myBooks[x].author);
x = x + 1;
}
}
}
 */

//Solution:-
/*
This code will not compile successfully as objects are not created
We will create the object as below:
myBooks[0] = new Books();
myBooks[1] = new Books();
myBooks[2] = new Books();
 */

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}

class Books {
    String title;
    String author;
}

// Output:-
/*
 PS G:\Quinbay-Assignment1\Ch_3\Exercise\Pg_63_Be_the_compiler\A> javac
 BooksTestDrive.java
 PS G:\Quinbay-Assignment1\Ch_3\Exercise\Pg_63_Be_the_compiler\A> java
 BooksTestDrive.java
 The Grapes of Java by bob
 The Java Gatsby by sue
 The Java Cookbook by ian
 */