package Ch_3.Exercise.Pg_65_Pool_Puzzle;
//Question:-
/*
Your job is to take code snippets from the pool and place them into the
blank lines in the code. You may use the same snippet more than
once, and you won’t need to use all the snippets. Your goal is to
make a class that will compile and run and produce the output listed.

class Triangle {
double area;
int height;
int length;
public static void main(String[] args) {
____________
_______________________
while ( __________ ) {
__________________________
________.height = (x + 1) * 2;
________.length = x + 4;
__________________________
System.out.print("triangle " + x + ", area");
System.out.println(" = " + _______.area);
________________
}
______________
x = 27;
Triangle t5 = ta[2];
ta[2].area = 343;
System.out.print("y = " + y);
System.out.println(", t5 area = " + t5.area);
}
void setArea() {
____________ = (height * length) / 2;
}
}

Output:-
%java Triangle
triangle 0, area = 4.0
triangle 1, area = 10.0
triangle 2, area = 18.0
triangle 3, area = ____
y = ______________________
 */

//Solution:-

public class Triangle {
        double area;
        int height;
        int length;
        public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];
        while (x < 4) {
        ta[x] = new Triangle();
        ta[x].height = (x + 1) * 2;
        ta[x].length = x + 4;
        ta[x].setArea();
        System.out.print("triangle " + x +
        ", area");
        System.out.println(" = " + ta[x].area);
        x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " +
        t5.area);
        }
        void setArea() {
        area = (height * length) / 2;
        }
}

//Output:-
/*
triangle 0, area = 4.0
triangle 1, area = 10.0
triangle 2, area = 18.0
triangle 3, area = 28.0
y = 4, t5 area = 343.0
 */