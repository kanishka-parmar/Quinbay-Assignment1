package Ch_2.Exercise.Pg_42_Be_the_compiler.B;

//Question:-
/*
 Each of the Java files on this page represents a complete source file.
Your job is to play compiler and determine whether each of these files 
will compile. If they won’t compile, how would you fix them, and if 
they do compile, what would be their output?

B
class Episode {
int seriesNumber;
int episodeNumber;
void skipIntro() {
System.out.println("Skipping intro...");
}
void skipToNext() {
System.out.println("Loading next episode...");
}
}
class EpisodeTestDrive {
public static void main(String[] args) {
Episode episode = new Episode();
episode.seriesNumber = 4;
episode.play();
episode.skipIntro();
}
}
*/

//Solution:-
/*
This code will not compile because play method is not defined in episode class
We will add play method to episode class and then the code can compile and run successfully
 */

public class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();
        episode.skipIntro();
        } 
    
}
 class Episode {
    int seriesNumber;
    int episodeNumber;
    void play() {
    System.out.println("Playing episode " + episodeNumber);
    }
    void skipIntro() {
    System.out.println("Skipping intro...");
    }
    void skipToNext() {
    System.out.println("Loading next episode...");
    }
    }


//output
/*
PS G:\Quinbay-Assignment1\Ch_2\Exercise\Pg_42_Be_the_compiler\B> javac EpisodeTestDrive.java
PS G:\Quinbay-Assignment1\Ch_2\Exercise\Pg_42_Be_the_compiler\B> java EpisodeTestDrive.java 
Playing episode 0
Skipping intro...
 */


