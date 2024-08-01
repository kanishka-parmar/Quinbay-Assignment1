package Ch_11.Mid_ch_Exercise.Pg_353;

//Question:-
/*
Look at this code. Read it carefully, then answer the questions below. (Note: there are no syntax errors in this code.)
import java.util.*;
public class TestTree {
public static void main(String[] args) {
new TestTree().go();
}
public void go() {
Book b1 = new Book("How Cats Work");
Book b2 = new Book("Remix your Body");
Book b3 = new Book("Finding Emo");
Set<Book> tree = new TreeSet<>();
tree.add(b1);
tree.add(b2);
tree.add(b3);
System.out.println(tree);
}
}
class Book {
private String title;
public Book(String t) {
title = t;
}
}


1. What is the result when you compile this code?
2. If it compiles, what is the result when you run the TestTree class?
3. If there is a problem (either compile-time or runtime) with this code, how would you fix it?

*/


//Solution:-
/*
1. What is the result when you compile this code?
==> The code is compiled successfully.

2. If it compiles, what is the result when you run the TestTree class?
==>When we run the TestTree class, a ClassCastException will be thrown at runtime. This is because TreeSet requires
   elements to be comparable, but the Book class does not implement the Comparable interface.

3. If there is a problem (either compile-time or runtime) with this code, how would you fix it?
==>The problem is a runtime ClassCastException because Book instances are being added to a TreeSet without a natural ordering.
   To fix this, we need to make the Book class implement the Comparable interface and define the compareTo method.

*/

//Solution to fix above code:-

import java.util.*;
public class TestTree {
public static void main(String[] args) {
new TestTree().go();
}
public void go() {
Book b1 = new Book("How Cats Work");
Book b2 = new Book("Remix your Body");
Book b3 = new Book("Finding Emo");
Set<Book> tree = new TreeSet<>();
tree.add(b1);
tree.add(b2);
tree.add(b3);
System.out.println(tree);
}
}
class Book implements Comparable<Book> {
private String title;
public Book(String t) {
title = t;
}
public int compareTo(Book other) {
    return this.title.compareTo(other.title);
}

public String toString() {
    return title;
}
}

//Output:-
/*
[Finding Emo, How Cats Work, Remix your Body]
 */