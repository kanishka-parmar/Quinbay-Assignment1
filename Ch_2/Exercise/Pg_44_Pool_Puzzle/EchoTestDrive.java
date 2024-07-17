package Ch_2.Exercise.Pg_44_Pool_Puzzle;

//Question:-
/*
Your job is to take code snippets from the pool and place them into the
blank lines in the code. You may use the same snippet more than
once, and you won’t need to use all the snippets. Your goal is to
make classes that will compile and run and produce the output listed below.
Some of the exercises and puzzles in this book might have more than one
correct answer. If you find another correct answer, give yourself bonus points!

public class EchoTestDrive {
public static void main(String []
args) {
Echo e1 = new Echo();
_________________________
int x = 0;
while ( ___________ ) {
e1.hello();
__________________________
if ( ____________ ) {
e2.count = e2.count + 1;
}
if ( ____________ ) {
e2.count = e2.count + e1.count;
}
x = x + 1;
}
System.out.println(e2.count);
}
}

class ____________ {
int _________ = 0;
void ___________ {
System.out.println("helloooo... ");
}
}

Output:
%java EchoTestDrive
helloooo...
helloooo...
helloooo...
helloooo...
10

 */

//Solution:-

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo(); // Filled
        int x = 0;
        while (x < 4) { // Filled
            e1.hello();
            e1.count = e1.count + 1; // Filled
            if (x == 3) { // Filled
                e2.count = e2.count + 1;
            }
            if (x > 0) { // Filled
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}

class Echo { // Filled
    int count = 0; // Filled

    void hello() { // Filled
        System.out.println("helloooo... ");
    }
}

// Output:-
/*
PS G:\Quinbay-Assignment1\Ch_2\Exercise\Pg_44_Pool_Puzzle> javac EchoTestDrive.java
PS G:\Quinbay-Assignment1\Ch_2\Exercise\Pg_44_Pool_Puzzle> java EchoTestDrive.java 
helloooo... 
helloooo... 
helloooo... 
helloooo... 
10
 */