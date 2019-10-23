import javax.swing.*;

public class Menu {
    public String showMenu(){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        Object[] options = {"Freshman", "Sophomore", "Junior", "Senior"};
        Object selectionObject = JOptionPane.showInputDialog(frame, "Choose", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String selectionString = selectionObject.toString();
        return selectionString;
    }
    public String stateMenu(){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        Object[] options = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN",
                "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT",
                 "WA", "WI", "WV", "WY"};
        Object selectionObject = JOptionPane.showInputDialog(frame, "Choose", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[43]);
        String selectionString = selectionObject.toString();
        return selectionString;
    }
    public String streetTypeMenu(){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        Object[] options = {"St.","Rd.", "Dr.", "Ct.", "Blvd.", "Ave", "Loop"};
        Object selectionObject = JOptionPane.showInputDialog(frame, "Choose", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        String selectionString = selectionObject.toString();
        return selectionString;
    }
}
