package Ch_3.Exercise.Pg_63_Be_the_compiler.B;

/*
Question:-
Each of the Java files on this page represents a complete source file.
Your job is to play compiler and determine whether each of these
files will compile and run without exception. If they won’t, how would
you fix them?

class Hobbits {
String name;
public static void main(String[] args) {
Hobbits[] h = new Hobbits[3];
int z = 0;
while (z < 4) {
z = z + 1;
h[z] = new Hobbits();
h[z].name = "bilbo";
if (z == 1) {
h[z].name = "frodo";
}
if (z == 2) {
h[z].name = "sam";
}
System.out.print(h[z].name + " is a ");
System.out.println("good Hobbit name");
}
}
}

*/

//solution:-
/*
This code will not run successfully it will give error:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
And also array starts with index 0
 */

public class Hobbits {
        String name;

        public static void main(String[] args) {
                Hobbits[] h = new Hobbits[3];
                int z = -1;
                while (z < 2) {
                        z = z + 1;
                        h[z] = new Hobbits();
                        h[z].name = "bilbo";
                        if (z == 1) {
                                h[z].name = "frodo";
                        }
                        if (z == 2) {
                                h[z].name = "sam";
                        }
                        System.out.print(h[z].name + " is a ");
                        System.out.println("good Hobbit name");
                }
        }
}
// Output:-
/*
PS G:\Quinbay-Assignment1\Ch_3\Exercise\Pg_63_Be_the_compilr\B> javac Hobbits.java
PS G:\Quinbay-Assignment1\Ch_3\Exercise\Pg_63_Be_the_compiler\B> java Hobbits.java
bilbo is a good Hobbit name
frodo is a good Hobbit name
sam is a good Hobbit name
 */
