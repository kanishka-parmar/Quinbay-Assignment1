package Ch_5.Exercise.Pg_118_Be_The_JVM;

//Question
/*
The Java file on this page represents a complete source file.
Your job is to play JVM and determine what would be the output when the program runs.

class Output {
public static void main(String[] args) {
Output output = new Output();
output.go();
}
void go() {
int value = 7;
for (int i = 1; i < 8; i++) {
value++;
if (i > 4) {
System.out.print(++value + " ");
}
if (value > 14) {
System.out.println(" i = " + i);
break;
}
}
}
}
 */

 class Output {
    public static void main(String[] args) {
    Output output = new Output();
    output.go();
    }
    void go() {
    int value = 7;
    for (int i = 1; i < 8; i++) {
    value++;
    if (i > 4) {
    System.out.print(++value + " ");
    }
    if (value > 14) {
    System.out.println(" i = " + i);
    break;
    }
    }
    }
    }

//Solution:-
/*
PS G:\Quinbay-Assignment1\Ch_5\Exercise\Pg_118_Be_The_JVM> javac Output.java
PS G:\Quinbay-Assignment1\Ch_5\Exercise\Pg_118_Be_The_JVM> java Output.java 
13 15  i = 6
 */
