package Ch_1.Exercises.Pg_23_Mixed_Messages;

//Question:-
/*
 A short Java program is listed below. One block of the program is missing. Your challenge is to match the candidate block of
code (on the left) with the output that you’d see if the block were inserted. Not all the lines of output will be used, and some
of the lines of output might be used more than once. Draw linesconnecting the candidate blocks of code with their matching
command-line outp ut.
 */

 //Solution:-

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            // y = x - y;          //00 11 21 32 42
            
            //y = y + x;          // 00 11 23 36 410
           
            /* y = y + 2;      
            if (y > 4) {
                 y = y - 1;
            } */                  // 02 14 25 36 47 

             /*x = x + 1;
             y = y + x;*/          // 11 34 59 

            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }                   // 02 14 36 48
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    } 
}
