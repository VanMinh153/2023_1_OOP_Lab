import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        Object[] options = {"I do", "I don't", "I don't know"};

        int option = JOptionPane.showOptionDialog(null,
"Do you want to change to the first class ticket?",
  "Action",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,     //do not use a custom Icon
        options,  //the titles of buttons
        options[0]); //default button title

        // int option = JOptionPane.showConfirmDialog(null, 
        // "Do you want to change to the first class ticket?");

        JOptionPane.showMessageDialog(null, "You've chosen: "
                        + (option == JOptionPane.YES_OPTION?"I do":"I don't"));
        
        System.exit(0);
    }
}
