package Ch_8.Pg_234_Pool_Puzzle;

//Question:-
/*
Your job is to take code snippets from the pool and
place them into the blank lines in the code and output.
You may use the same snippet more than once,
and you won’t need to use all the snippets. Your
goal is to make a set of classes that will compile and
run and produce the output listed.

____________ Nose {
________________________
}
abstract class Picasso implements ______{
_________________________
return 7;
}
}
class _________ ________ __________ { }
class _________ ________ __________ {
___________________________
return 5;
}
}

public ___________ ________ extends Clowns {
public static void main(String[] args) {
____________________________
i[0] = new __________
i[1] = new __________
i[2] = new __________
for (int x = 0; x < 3; x++) {
System.out.println(__________________
+ " " + _______.getClass());
}
}
}

Output:-
%java ______________
5 class Acts
7 class Clowns
________Of76
 */

//Solution:-

public class Of76 extends Clowns {
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod()
                    + " " + i[x].getClass());
        }
    }
}

interface Nose {
    public int iMethod();
}

abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso {
}

class Acts extends Picasso {
    public int iMethod() {
        return 5;
    }
}

// Output:-
/*
%java Of76
5 class Acts
7 class Clowns
7 class Of76
 */
