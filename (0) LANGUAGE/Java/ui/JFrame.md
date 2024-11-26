


## Example

```java
// imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
```

```java
public class CoolPanel extends JFrame implements ActionListener {
    JButton b1;         // Button
    JTextField tField;  // Input Text Field
    JTextArea tArea;    // Outout Text Area

    public CoolPanel() {
        // Addons
        this.setTitle("Data Base");
        this.setSize(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // Button
        b1 = new JButton("Save Data");
            b1.addActionListener(this);

        // Input Text Field
        tField = new JTextField(20);

        // Output Text Area
        tArea = new JTextArea(5,20);
            tArea.setLineWrap(true);
            tArea.setWrapStyleWord(true);
            JScrollPane sPane = new JScrollPane(tArea);

        // Pane Design
        Container c = this.getContentPane();
        c.add(tField, "North");
        c.add(sPane, "Center");
        c.add(b1, "South");

        // Addons
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        tArea.append(tField.getText() + System.getProperty("line.separator"));
    }
}
```


## More
### Visibility:
```java
// must be performed at the very end of the class
this.setVisible(true);
```

```java
// close the program with the X
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
```

```java
tArea.setLineWrap(true);        // idk
tArea.setWrapStyleWord(true);   // idk
```

```java
// JFrame has already his own container
// but "Container" has more options
Container c = this.getContentPane();
```