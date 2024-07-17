package Ch_1.Exercises.Pg_24_Pool_Puzzle;

//Question:-
/*
 Your job is to take code snippets from the pool and place them into the blank
lines in the code. You may not use the same snippet more than once, and 
you won’t need to use all the snippets. Your goal is to make a class that
will compile and run and produce the output listed. Don’t be fooled—this one’s
harder than it looks.

class PoolPuzzleOne {
public static void main(String [] args) {
int x = 0;
while ( __________ ) {
_____________________________
if ( x < 1 ) {
___________________________
}
_____________________________
if ( __________ ) {
____________________________
___________
}
if ( x == 1 ) {
____________________________
}
if ( ___________ ) {
____________________________
}
System.out.println();
____________
}
}
}

Output:-
%java PoolPuzzleOne
a noise
annoys
an oyster

 */


public class PoolPuzzleOne {
    public static void main(String[] args){
        int x=0;
        while(x<4){
            System.out.print("a");
            if(x<1){
              System.out.print(" ");
            }
            System.out.print("n");
            if (x>1) {
                System.out.print(" oyster");
                x=x+2;
            }
                if ( x==1 ) {
                    System.out.print("noys"); 
                }
                if (x<1) {
                    System.out.print("oise");
                }
                System.out.println();
             x=x+1;   

        }
    } 
}


//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_1> javac Exercises\Pg_24_Pool_Puzzle\PoolPuzzleOne.java         
PS G:\Quinbay-Assignment1\Ch_1> java Exercises\Pg_24_Pool_Puzzle\PoolPuzzleOne.java 
a noise
annoys
an oyster
 */