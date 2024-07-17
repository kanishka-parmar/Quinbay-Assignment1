package Ch_2.Exercise.Pg_42_Be_the_compiler.A;

//Question:-
/*
 Each of the Java files on this page represents a complete source file.
Your job is to play compiler and determine whether each of these files 
will compile. If they won’t compile, how would you fix them, and if 
they do compile, what would be their output?

A 
class StreamingSong {
String title;
String artist;
int duration;
void play() {
System.out.println("Playing song");
}
void printDetails() {
System.out.println("This is " + title +
" by " + artist);
}
}
class StreamingSongTestDrive {
public static void main(String[] args) {
song.artist = "The Beatles";
song.title = "Come Together";
song.play();
song.printDetails();
}
}
*/

//Solution:-
/*
No the above program will not compile successfully because object is not created. So we need to create object:- StreamingSong song = new StreamingSong();
Below code will run successfully 
 */
public class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
class StreamingSong {
    String title;
    String artist;
    int duration;

    void play() {
        System.out.println("Playing song");
    }

    void printDetails() {
        System.out.println("This is " + title +
                " by " + artist);
    }
}



//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_2\Exercise\Pg_42_Be_the_compiler\A> javac StreamingSongTestDrive.java
PS G:\Quinbay-Assignment1\Ch_2\Exercise\Pg_42_Be_the_compiler\A> java StreamingSongTestDrive.java 
Playing song
This is Come Together by The Beatles
 */