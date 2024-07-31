package Ch_10.Exercise.Pg_306_Be_the_compiler;

//Question:-
/*
BE the Compiler
The Java file on this page represents a complete program. Your job is to play compiler and determine whether this
file will compile. If it won’t compile, how would you fix it? When it runs, what would be its output?

Which of these is the output?
a.)
%java StaticTests
static block 4
in main
super static block
super constructor
constructor

b.)%java StaticTests
super static block
static block 3
in main
super constructor
constructor
 */

//  Solution:-
class StaticSuper {
    static {
    System.out.println("super static block");
    }
    StaticSuper () {
    System.out.println("super constructor");
    }
    }
    public class StaticTests extends StaticSuper {
    static int rand;
    static {
    rand = (int) (Math.random() * 6);
    System.out.println("static block " + rand);
    }
    StaticTests() {
    System.out.println("constructor");
    }
    public static void main(String[] args) {
    System.out.println("in main");
    StaticTests st = new StaticTests();
    }
    }

    /*
     The code will compile successfully and will run without any errors.
     with output:-
     */
    /*
    super static block
    static block 1
    in main
    super constructor
    constructor
     */


