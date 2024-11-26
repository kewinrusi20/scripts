# Swing-Callback
the "Swing" need and visual interface, like "ActionListener"

# ActionListener
> ActionListener has only one method to register the buttons actions:

```java
void actoinPerfomed(ActionEvent e) // -> Invoked when an action occurs
```

## Example 1
```java
public class CallbackDemo implements ActionListener {
	ok.addActionListener(this); // inside the Constructor

	public void actionPerformed(ActionEvent ae)
	String text = eingabe.getText();
	eingabe.setText("");
	ausgabe.append(text);
}
```

