package Ch_5.Exercise.Pg_119_Code_Magnets;

//Question:-
/*
A working Java program is all scrambled up on the fridge. Can you
reconstruct the code snippets to make a working Java program that
produces the output listed below? Some of the curly braces fell on the
floor and they were too small to pick up, so feel free to add as many of
those as you need!

Output:-
% java MultiFor
0 4
0 3
1 4
1 3
3 4
3 3
 */

 //Solution:-

public class Multifor {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++) {
            for(int j = 4; j > 2; j--) {
                System.out.println(i + " " + j); 
            }
            if (i == 1) {
                i++;
            }  
        }
    }
}
