package Ch_6.Exercise.Pg_163_Code_Magnets;

//Question
/*
Can you reconstruct the code snippets to make a working Java program that produces the output
listed below? NOTE: To do this exercise, you need one NEW piece of info—if you look in the API for
ArrayList, you’ll find a second add method that takes two arguments:
add(int index, Object o)
It lets you specify to the ArrayList where to put the object you’re adding.

Output:-
% java ArrayListMagnet
zero one two three
zero one three four
zero one three four 4.2
zero one three four 4.2

*/

//Solution:-

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printList(a);
        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);
        printList(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printList(a);
        if (a.contains("two")) {
            a.add("2.2");
        }
        printList(a);
    }

    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

}

//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_6\Exercise\Pg_163_Code_Magnets> javac ArrayListMagnet.java
PS G:\Quinbay-Assignment1\Ch_6\Exercise\Pg_163_Code_Magnets> java ArrayListMagnet.java 
zero one two three 
zero one three four
zero one three four 4.2
zero one three four 4.2
 */