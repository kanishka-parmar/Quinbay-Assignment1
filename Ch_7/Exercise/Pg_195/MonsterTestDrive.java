package Ch_7.Exercise.Pg_195;

//Question:-
/*
BE the Compiler:-
Which of the A-B pairs of methods listed on the right, if inserted into the classes on the left, would compile and
produce the output shown? (The A method inserted into class Monster, the B method inserted into class Vampire.)

Code:-
public class MonsterTestDrive {
public static void main(String[] args) {
Monster[] monsters = new Monster[3];
monsters[0] = new Vampire();
monsters[1] = new Dragon();
monsters[2] = new Monster();
for (int i = 0; i < monsters.length; i++) {
monsters[i].frighten(i);
}
}
}
class Monster {
________________________
}
class Vampire extends Monster {
________________________
}
class Dragon extends Monster {
boolean frighten(int degree) {
System.out.println("breathe fire");
return true;
}
}

Output:-
% java MonsterTestDrive
a bite?
breathe fire
arrrgh
 */

//Solution:-

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();
        for (int i = 0; i < monsters.length; i++) {
        monsters[i].frighten(i);
        }
        } 
}

class Monster{
    boolean frighten(int d) {
    System.out.println("arrrgh");
    return true;
    }
    }
    class Vampire extends Monster {
    boolean frighten(int x) {
    System.out.println("a bite?");
    return false;
    }
    }
class Dragon extends Monster {
boolean frighten(int degree) {
System.out.println("breathe fire");
return true;
}
}


//1
/*
class Monster{
boolean frighten(int d) {
System.out.println("arrrgh");
return true;
}
}
class Vampire extends Monster {
boolean frighten(int x) {
System.out.println("a bite?");
return false;
}
}

This code when inserted in Monster and Vampire Class gives correct output.
Because in vampire class frighten method is efficiently overriden.
 */


//2
/*
class Monster {
    boolean frighten(int x) {
        System.out.println("arrrgh");
        return true;
        }
}
class Vampire extends Monster {
    int frighten(int f) {
        System.out.println("a bite?");
        return 1;
        } 
}

This code will not compile because  error: frighten(int) in Vampire cannot override frighten(int) in Monster
    int frighten(int f) {
        ^
  return type int is not compatible with boolean
 */

//3
/*
class Monster {
    boolean frighten(int x) {
        System.out.println("arrrgh");
        return false;
        }
}
class Vampire extends Monster {
    boolean scare(int x) {
        System.out.println("a bite?");
        return true;
    }
}

This code will compile but will provide following output:
PS G:\Quinbay-Assignment1\Ch_7\Exercise\Pg_195> java MonsterTestDrive.java
arrrgh
breathe fire
arrrgh

Because the vampire class doesnt overrides so it will use monster method which gives output "arrrgh".
 */

//4
/*
class Monster {
    boolean frighten(int z) {
        System.out.println("arrrgh");
        return true;
        } 
}
class Vampire extends Monster {
    boolean frighten(byte b) {
        System.out.println("a bite?");
        return true;
        } 
}

This code will compile but will provide following output:
PS G:\Quinbay-Assignment1\Ch_7\Exercise\Pg_195> java MonsterTestDrive.java
arrrgh
breathe fire
arrrgh

Because the vampire class doesnt overrides so it will use monster method which gives output "arrrgh".
It will not override because the argument type is changed in vampire class frighten method ie byte and in monster class its type is int.
 */