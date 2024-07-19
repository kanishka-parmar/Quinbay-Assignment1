package Ch_4.Exercise.Pg_88_Be_The_Compiler.B;

//Question:-
/*
Question:-
Each of the Java files on this page represents a complete source file.
Your job is to play compiler and determine whether each of these files
will compile. If they won’t compile, how would you
fix them, and if they do compile, what would be their output?

B
class Clock {
String time;
void setTime(String t) {
time = t;
}
void getTime() {
return time;
}
}
class ClockTestDrive {
public static void main(String[] args) {
Clock c = new Clock();
c.setTime("1245");
String tod = c.getTime();
System.out.println("time: "+tod);
}
}
 */

//Solution:-
/*
This will give an error as in getTime method the return type is void but we are trying to return string time
So to make it run successfully
String getTime(){
return time;
}
 */

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }

}

class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;
    }
}

// Output:-
/*
 PS G:\Quinbay-Assignment1\Ch_4\Exercise\Pg_88_Be_The_Compiler\B> javac
 ClockTestDrive.java
 PS G:\Quinbay-Assignment1\Ch_4\Exercise\Pg_88_Be_The_Compiler\B> java
 ClockTestDrive.java
 time: 1245
 */
