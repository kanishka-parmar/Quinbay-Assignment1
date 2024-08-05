package Ch_14.Exercise.Pg_505_Be_the_compiler;
//Question:-

/*
BE the Compiler
The Java file on this page represents a complete source file. Your job is to play
compiler and determine whether this file will compile. If it won’t compile, how
would you fix it, and if it does compile, what would it do?
 */

/* 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class InnerButton {
private JButton button;
public static void main(String[] args) {
InnerButton gui = new InnerButton();
gui.go();
}
public void go() {
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
button = new JButton("A");
button.addActionListener();
frame.getContentPane().add(
BorderLayout.SOUTH, button);
frame.setSize(200, 100);
frame.setVisible(true);
}
class ButtonListener extends ActionListener {
public void actionPerformed(ActionEvent e) {
if (button.getText().equals("A")) {
button.setText("B");
} else {
button.setText("A");
}
}
}
}
*/

//Solution:-

/*
==> The addActionListener() method call is incorrect because it requires an ActionListener object as an argument.

==> The declaration class ButtonListener extends ActionListener is incorrect because ActionListener is an interface, not a class.
    The correct declaration should be class ButtonListener implements ActionListener.
*/

//This is the corrected code:-

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InnerButton {
    private JButton button;

    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        button = new JButton("A");
        button.addActionListener(new ButtonListener());
        frame.getContentPane().add(
                BorderLayout.SOUTH, button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (button.getText().equals("A")) {
                button.setText("B");
            } else {
                button.setText("A");
            }
        }
    }
}

// Output:-
// It will create a GUI with a button that toggles between A and B when we click it.