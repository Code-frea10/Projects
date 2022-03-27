// import for GUI
import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        // GUI (Graphical User Interface)
        // it is a program which we can communicate with it

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+ name);
        //System.out.println("Welcome: " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please Enter a Number "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double price = Double.parseDouble((JOptionPane.showInputDialog("Please Enter a Price ")));
        JOptionPane.showMessageDialog(null, "Your price is "+price+" awesome");

    }
}
