package Ch_13.Exercise.Pg_455_Code_Magnets;

//Question:-
/*
Code Magnets
A working Java program is scrambled up on the fridge. Can you reconstruct all the code snippets to make a working Java program that produces the
output listed below? Some of the curly braces fell on the floor and they were too small to pick up, so feel free to add as many of those as you need!
 
Output:-
% java ExTestDrive yes
thaws
% java ExTestDrive no
throws
*/

//Solution:-

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];
        try {
            System.out.print("t");
            doRisky(test);
            System.out.print("o");
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
        }
        System.out.println("s");
    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r");
    }
}

class MyEx extends Exception {
}


//Output:-
/*
PS G:\Quinbay-Assignment1> javac Ch_13/Exercise/Pg_455_Code_Magnets/ExTestDrive.java
PS G:\Quinbay-Assignment1> java Ch_13.Exercise.Pg_455_Code_Magnets.ExTestDrive no 
throws
PS G:\Quinbay-Assignment1> java Ch_13.Exercise.Pg_455_Code_Magnets.ExTestDrive yes
thaws
 */