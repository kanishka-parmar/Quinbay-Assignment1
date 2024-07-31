//Question
/*
Will this code compile? Will it run? If it runs,what will it do? Take your time and think about this one; it brings up an implication 
of autoboxing that we didn’t talk about. You’ll have to go to your compiler to find the answers. (Yes, we’re forcing you to
experiment, for your own good, of course.)
 */

 public class TestBox {
    private Integer i;
    private int j;
    public static void main(String[] args) {
    TestBox t = new TestBox();
    t.go();
    }
    public void go() {
    j = i;
    System.out.println(j);
    System.out.println(i);
    }
    }

//Output:-
/*
PS G:\Quinbay-Assignment1\Ch_10\Mid_ch_Exercise\Pg_293_Sharpen_your_Pencil> javac TestBox.java
PS G:\Quinbay-Assignment1\Ch_10\Mid_ch_Exercise\Pg_293_Sharpen_your_Pencil> java TestBox.java 
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "this.i" is null
        at TestBox.go(TestBox.java:16)
        at TestBox.main(TestBox.java:13)
 */


 
//Solution:-
/*
=> Will the code compile?
   Yes, the code will compile without errors.

=> Will it run?
   No, it will throw a NullPointerException at runtime when j = i; is executed.

=> What will it do?
   It will throw a NullPointerException because i is null and the code attempts to unbox it to assign to the primitive int variable j.
 */