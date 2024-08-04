package Ch_13.Mid_ch_exercise.Pg_434_Sharpen_Your_Pencil;

//Question:-

/*
Flow Control
Look at the code to the left. What do you think the output of this program would be? What do you think
it would be if the third line of the program were changed to String test = "yes";?
Assume ScaryException extends Exception.
 */

public class TestExceptions {
    public static void main(String[] args) {
        // String test = "no";
        String test = "yes";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException se) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
    }
}

class ScaryException extends Exception {
}

// Solution:-
/*
 * Output when test = "no"
 
 start try
 start risky
 end risky
 end try
 finally
 end of main
 */

/*
 * Output when test = "yes"
 * 
 start try
 start risky
 scary exception
 finally
 end of main
 */