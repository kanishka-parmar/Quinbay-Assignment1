package Ch_7.Exercise.Pg_196;

//Question:-

/*
Your job is to take code snippets from the pool and place them into
the blank lines in the code. You may use the same snippet more
than once, and you might not need to use all the snippets. Your
goal is to make a set of classes that will compile and run together
as a program. Don’t be fooled—this one’s harder than it looks.


public class TestBoats {
______ ______ _______ main(String[] args){
_________ b1 = new Boat();
Sailboat b2 = new __________();
Rowboat ________ = new Rowboat();
b2.setLength(32);
b1.__________();
b3.__________();
_______.move();
}
}
public class __________ ________ Boat {
public _______ _________() {
System.out.print("___________");
}
}

public class Rowboat ________ ________ {
public ___________ rowTheBoat() {
System.out.print("stroke natasha");
}
}
public class ________ {
private int __________ ;
_______ void _________ ( ______ ) {
length = len;
}
public int getLength() {
________ _________ ;
}
public ___________ move() {
System.out.print("___________");
}
}

OUTPUT: 
drift drift hoist sail
 */

//Solution:-
public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

class Boat {
    private int length;

    public void setLength(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.print("drift ");
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.print("stroke natasha");
    }
}
class Sailboat extends Boat {
    public void move() {
        System.out.print("hoist sail ");
    }
}
