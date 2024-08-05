package Ch_14.Exercise.Pg_506_Pool_Puzzle;

//Question
/*
Pool Puzzle
Your job is to take code snippets from the pool and place them into the blank
lines in the code. You may use the same snippet more than once,
and you won’t need to use all the snippets. Your goal is to make a
class that will compile and run and produce the output listed.

Code:-
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class Animate {
int x = 1;
int y = 1;
public static void main(String[] args) {
Animate gui = new Animate ();
gui.go();
}
public void go() {
JFrame _________ = new JFrame();
frame.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
______________________________________;
_________.getContentPane().add(drawP);
__________________________;
_________.setVisible(true);
for (int i=0; i<124; _______________) {
_____________________;
_____________________;
try {
TimeUnit.MILLISECONDS.sleep(50);
} catch(Exception ex) { }
}
}
class MyDrawP extends JPanel {
public void paintComponent (Graphics
_________) {
__________________________________;
__________________________________;
__________________________________;
__________________________________;
}
}
}

Output:-
The Amazing, Shrinking, Blue Rectangle.
This program will produce a blue rectangle
that will shrink and shrink and disappear into
a field of white.
*/


//Solution:-

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class Animate {
int x = 1;
int y = 1;
public static void main(String[] args) {
Animate gui = new Animate ();
gui.go();
}
public void go() {
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
MyDrawP drawP = new MyDrawP();
frame.getContentPane().add(drawP);
frame.setSize(500, 270);
frame.setVisible(true);
for (int i=0; i<124;i++,y++,x++) {
x++;
drawP.repaint();
try {
TimeUnit.MILLISECONDS.sleep(50);
} catch(Exception ex) { }
}
}
class MyDrawP extends JPanel {
public void paintComponent (Graphics g) {
    g.setColor(Color.white);
    g.fillRect(0, 0, 500, 250);
    g.setColor(Color.blue);
    g.fillRect(x, y, 500-x*2, 250-y*2);
}
}
}