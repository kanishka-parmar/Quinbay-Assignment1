package Ch_5.Exercise.Pg_121_Mixed_Messages;
//Question:-
/*
A short Java program is listed below. One block of the program
is missing. Your challenge is to match the candidate block of
code (on the left) with the output that you’d see if the block
were inserted. Not all the lines of output will be used, and some
of the lines of output might be used more than once. Draw lines
connecting the candidate blocks of code with their matching
command-line output.

public static void main(String[] args) {
int x = 0;
int y = 30;
for (int outer = 0; outer < 3; outer++) {
for (int inner = 4; inner > 1; inner--) {


y = y - 2;
if (x == 6) {
break;
}
x = x + 3;
}
y = y - 2;
}
System.out.println(x + " " + y);
}
 */

public class MixedMsg {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
        for (int inner = 4; inner > 1; inner--) {
            x=x+0;
        y = y - 2;
        if (x == 6) {
        break;
        }
        x = x + 3;
        }
        y = y - 2;
        }
        System.out.println(x + " " + y);
        } 
}

//Solution:-

//x = x + 3;         -->   54 6
//x = x + 6;         -->   60 10
//x = x + 2;         -->   45 6
//x++;               -->   36 6
//x--;               -->   18 6
//x = x + 0;         -->   6 14


