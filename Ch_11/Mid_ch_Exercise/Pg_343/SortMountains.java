package Ch_11.Mid_ch_Exercise.Pg_343;

//Question
/*
Reverse Engineer
Assume this code exists in a single file. Your job is to fill in the blanks so the program will create the output shown.

import __________________;
public class SortMountains {
public static void main(String [] args) {
new SortMountains().go();
}
public void go() {
List______________ mountains = new ArrayList<>();
mountains.add(new Mountain("Longs", 14255));
mountains.add(new Mountain("Elbert", 14433));
mountains.add(new Mountain("Maroon", 14156));
mountains.add(new Mountain("Castle", 14265));
System.out.println("as entered:\n" + mountains);
mountains._______(____->____________);
System.out.println("by name:\n" + mountains);
_________._______(____->____________);
System.out.println("by height:\n" + mountains);
}
}
class Mountain {
__________________;
_________________;
______________________ {
_________________;
_________________;
}
_________________________ {
______________________________;
}
}

Output:
%java SortMountains
as entered:
[Longs 14255, Elbert 14433, Maroon 14156, Castle 14265]
by name:
[Castle 14265, Elbert 14433, Longs 14255, Maroon 14156]
by height:
[Elbert 14433, Castle 14265, Longs 14255, Maroon 14156]
 */


 //Solution:-
 
 import java.util.*;
 public class SortMountains {
 public static void main(String [] args) {
 new SortMountains().go();
 }
 public void go() {
 List<Mountain> mountains = new ArrayList<>();
 mountains.add(new Mountain("Longs", 14255));
 mountains.add(new Mountain("Elbert", 14433));
 mountains.add(new Mountain("Maroon", 14156));
 mountains.add(new Mountain("Castle", 14265));
 System.out.println("as entered:\n" + mountains);

 mountains.sort((one,two)->one.name.compareTo(two.name));
 System.out.println("by name:\n" + mountains);

 mountains.sort((one,two)->two.height - one.height);
 System.out.println("by height:\n" + mountains);
 }
 }
 class Mountain {
    String name;
    int height;

    Mountain(String name,int height){
       this.name=name;
       this.height=height; 
    }

    public String toString(){
        return name + " " + height;
    }

 }


//output:-
/*
[Longs 14255, Elbert 14433, Maroon 14156, Castle 14265]
by name:
[Castle 14265, Elbert 14433, Longs 14255, Maroon 14156]
by height:
[Elbert 14433, Castle 14265, Longs 14255, Maroon 14156]
 */