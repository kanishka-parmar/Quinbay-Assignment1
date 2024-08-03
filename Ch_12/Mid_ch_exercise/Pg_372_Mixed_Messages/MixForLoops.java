package Ch_12.Mid_ch_exercise.Pg_372_Mixed_Messages;

import java.util.List;

//Question
/*
A short Java program is listed below. One block of the program is
missing. We expect the output of the program should be “1 2 3 4 5”
but sometimes it’s difficult to get a for loop just right.
Your challenge is to match the candidate block of code (on the left)
with the output that you’d see if the block were inserted. Not all the
lines of output will be used, and some of the lines of output might be
used more than once.

class MixForLoops {
public static void main(String [] args) {
List<Integer> nums = List.of(1, 2, 3, 4, 5);
String output = "";
  //Candidate code goes here
System.out.println(output);
}
}
 */
public class MixForLoops {
  public static void main(String [] args) {
List<Integer> nums = List.of(1, 2, 3, 4, 5);
String output = "";
for (int i = 1; i < nums.size(); i++)
output += nums.get(i) + " ";
System.out.println(output);
}  
}

//Solution:-

/*
1.
Candidate:
for (int i = 1; i < nums.size(); i++)
output += nums.get(i) + " ";

Output:-
2 3 4 5
 */

/*
2.
Candidate:
for (Integer num : nums)
output += nums + " ";

Output:-
[1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5] [1, 2, 3, 4, 5]
 */

/*
3.
Candidate:
for (int i = 0; i <= nums.length; i++)
output += nums.get(i) + " ";

Output:-
Compiler error

 error: cannot find symbol
for (int i = 0; i <= nums.length; i++)
                         ^
  symbol:   variable length
  location: variable nums of type List<Integer>
1 error
 */

/*
4.
Candidate:
for (int i = 0; i <= nums.size(); i++)
output += nums.get(i) + " ";

Output:-
Exception thrown

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5   
        at java.base/java.util.ImmutableCollections$ListN.get(ImmutableCollections.java:680)
 */