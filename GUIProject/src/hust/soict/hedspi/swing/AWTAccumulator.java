package hust.soict.hedspi.swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
  private final TextField tfInput;
  private final TextField tfOutput;
  private int sum = 0;
  
  
  public AWTAccumulator() {
    setLayout(new GridLayout(2, 2) );

    add(new Label("Enter an integer: ") );

    tfInput = new TextField(10);
    add(tfInput);
    tfInput.addActionListener(new TFInputListener());

    add(new Label("The Accumulated Sum is: ") );

    tfOutput = new TextField(10);
    tfOutput.setEditable(false);
    add(tfOutput);

    setTitle("AWT Accumulator");
    setSize(350, 120);
    setVisible(true);
  }

  public static void main(String[] args) {
      AWTAccumulator awtAccumulator = new AWTAccumulator();
  }

  private class TFInputListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent evt) {
      if ("".equals(tfInput.getText())) return;
      int numberIn = Integer.parseInt(tfInput.getText() );
      sum += numberIn;
      tfInput.setText("");
      tfOutput.setText(sum + "");
    }
  }
}