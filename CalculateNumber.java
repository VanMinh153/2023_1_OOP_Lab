import javax.swing.JOptionPane;

public class CalculateNumber {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double num1, num2;
        strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ", "Input the first number",
                    JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number: ", "Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);

        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = Math.abs(num1 - num2); 
        double product = num1 * num2;
        double quotient = -1;

        if(num2 != 0) quotient = num1 / num2;
        JOptionPane.showMessageDialog(null, "You enterd: " + strNum1 + " and " + strNum2);
        JOptionPane.showMessageDialog(null, strNum1 + " + " + strNum2 + " = " + sum);        
        JOptionPane.showMessageDialog(null, strNum1 + " - " + strNum2 + " = " + difference);        
        JOptionPane.showMessageDialog(null, strNum1 + " * " + strNum2 + " = " + product);
        if(quotient != -1) JOptionPane.showMessageDialog(null, strNum1 + " / " + strNum2 + " = " + quotient);
        else JOptionPane.showMessageDialog(null, "Can not devide !");

        System.exit(0);
    }
}
