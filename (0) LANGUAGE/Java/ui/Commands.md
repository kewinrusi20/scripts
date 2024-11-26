# JFrame
```java
import javax.swing.JFrame;
class myPanel extends JFrame {
    .setTitle("Data Base"); // (set name above the app)
    .setSize(200,200); // (width, height)

    // action after pressing the X
    .setDefaultCloseOperation(<className>.<command>);
    this.setDefaultCloseOperation(3);
    Jframe1.setDafaultCloseOperation(JFrame2.EXIT_ON_CLOSE);
        // ( EXIT_ON_CLOSE ) alternative ( 3 )
        // ( DISPOSE_ON_CLOSE ) or ( = 2 )
        // ( HIDE_ON_CLOSE )or ( = 1 )
        // ( DO_NOTHING_ON_CLOSE ) or ( = 0 )

    this.getContentPane(); // JFrame Container

    this.setVisible(true);  // must always stay a the buttom of the class
}
```

# ActionListener
```java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyPanel implemets ActionListener {
    ...

    @Override
    public void actionPerformed(ActionEvent ae) {
        // add an action to a button
    }
}

// for a second button, you need a second class
class MyPanel_b2 implemets Action Listener {
    @Override
    public void actionPerformed(ActionEvent ae2) {
        // add an action to a second button
    }
}
```


# JButton
```java
import javax.swing.JButton;
JButton b1 = new JButton("Save Data"); // Message within the Button
b1.addActionListener(this); // bind the button with the actionPerformed() method of the Interface "ActionListener"
```

# JTextField
```java
import javax.swing.JTextField;
JTextFiel tField = new JTextField(20); // (columns)

tFeild.getText(); // take the imput within the field
```

# JTextArea
```java
import javax.swing.JTextArea;
tArea = new JTextArea(5,20); // (rows, columns)

// addons
tArea.setLineWrap(true);
tArea.setWrapStyleWord(true);

tArea.append();
JScrollPane sPane = new JScrollPane(tArea);


System.getProperty("line.separator"); // idk
```

# JScrollPane
```java
import javax.swing.JScrollPane;
JScrollPane sPane = new JScrollPane(tArea);

```

# Container
```java
import java.awt.Container;

// extend the JFrame container
Container c = this.getContentPane();
c.add(tField, "North"); // (position)
c.add(sPane, "Center");
c.add(b1, "South");

// it works also without Container
this.add(); // but you can put only one element pro position
```

