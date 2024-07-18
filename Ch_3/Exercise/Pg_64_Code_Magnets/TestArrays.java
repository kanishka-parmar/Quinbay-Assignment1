package Ch_3.Exercise.Pg_64_Code_Magnets;

//Question
/*
A working Java program is all scrambled up on the fridge. Can you reconstruct the code
snippets to make a working Java program that produces the output listed below?
Some of the curly braces fell on the floor and they were too small to pick up, so feel
free to add as many of those as you need!

Output:-
island = Fiji
island = Cozumel
island = Bermuda
island = Azores
*/

//Solution:-

public class TestArrays {
    public static void main(String [] args) {
    int [] index = new int[4];
    String [] islands = new String[4];
    int y = 0;
    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;
    islands[0] = "Bermuda";
    islands[1] = "Fiji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";
    int ref;
    while (y < 4) {
        ref = index[y];
        System.out.print("island = ");
        System.out.println(islands[ref]);
        y = y + 1;
    }  
}
}

//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_3\Exercise\Pg_64_Code_Magnets>javac TestArrays.java 
PS G:\Quinbay-Assignment1\Ch_3\Exercise\Pg_64_Code_Magnets>java TestArrays.java 
island = Fiji
island = Cozumel
island = Bermuda
island = Azores
 */