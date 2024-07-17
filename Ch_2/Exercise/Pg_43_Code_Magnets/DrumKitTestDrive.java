package Ch_2.Exercise.Pg_43_Code_Magnets;

//Question:-
/* A Java program is all scrambled up on the fridge. Can you reconstruct the
code snippets to make a working Java program that produces the output listed
below? Some of the curly braces fell on the floor and they were too small to pick
up, so feel free to add as many of those as you need.

Output:-
% java DrumKitTestDrive
bang bang ba-bang
ding ding da-ding

*/

//Solution:-

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        if (d.snare == true) {
            d.playSnare();
        }
    }
}

class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}

// Output:-
/*
 * PS G:\Quinbay-Assignment1\Ch_2\Exercise\Pg_43_Code_Magnets> javac
 * DrumKitTestDrive.java
 * PS G:\Quinbay-Assignment1\Ch_2\Exercise\Pg_43_Code_Magnets> java
 * DrumKitTestDrive.java
 * bang bang ba-bang
 * ding ding da-ding
 */