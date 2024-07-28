package Ch_9.Exercise.Pg_268_Be_the_garbage_collector;

//Question:-
/*
BE the Garbage Collector
Which of the lines of code on the right, if added to the class on the left at point A, would cause exactly
one additional object to be eligible for the Garbage Collector? (Assume that point A (//call more methods)
will execute for a long time, giving the Garbage Collector time to do its stuff.)

public class GC {
public static GC doStuff() {
GC newGC = new GC();
doStuff2(newGC);
return newGC;
}
public static void main(String[] args) {
GC gc1;
GC gc2 = new GC();
GC gc3 = new GC();
GC gc4 = gc3;
gc1 = doStuff();

____________________________________


// call more methods
}
public static void doStuff2(GC copyGC) {
GC localGC = copyGC;
}
}

1 copyGC = null;
2 gc2 = null;
3 newGC = gc3;
4 gc1 = null;
5 newGC = null;
6 gc4 = null;
7 gc3 = gc2;
8 gc1 = gc4;
9 gc3 = null;

 */

//Solution:-

 public class GC {
    public static GC doStuff() {
    GC newGC = new GC();
    doStuff2(newGC);
    return newGC;
    }
    public static void main(String[] args) {
    GC gc1;
    GC gc2 = new GC();
    GC gc3 = new GC();
    GC gc4 = gc3;
    gc1 = doStuff();
    
    // gc2 = null;
    // gc1 = null;
    // call more methods
    }
    public static void doStuff2(GC copyGC) {
    GC localGC = copyGC;
    }
    }


/*
Ans:-
2. gc2 = null;
4. gc1 = null;
These lines of code would cause exactly one additional object to be eligible for the Garbage Collector.
 */
