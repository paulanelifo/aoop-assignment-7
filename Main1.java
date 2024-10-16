import java.awt.Color;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
public class Main1 {
    public static void main(String[] args) {        
        // The Frame
        JFrame mainFrame = new JFrame("Restaurant Reviewer"){{
            setSize(790, 275);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(null);
        }};
        mainFrame.setVisible(true);
    }
    public void setLabels(String a, String b, String c, String d, String e){
    }
}

class makeLabels{
    private int column;
    private int row;
    private String text;
    private boolean isButton;
    private boolean isHeader;
    
    public makeLabels(int column, int row, String text, boolean isButton, boolean isHeader){
        this.column = column;
        this.row = row;
        this.text = text;
        this.isButton = isButton;
        this.isHeader = isHeader;
    }
    
    public JComponent createComponent(){
        if(isButton){
            JButton button = new JButton(text){{
                setBounds(column,row,150,35);
                setHorizontalAlignment(CENTER);
                setFocusable(false);
            }};
            return button;
        }
        else if(isHeader){
            JLabel label = new JLabel(text){{
                setBounds(column, row, 150, 35);
                setHorizontalAlignment(CENTER);
                setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }};
            return label;
        }
        else{
            JLabel label = new JLabel(text){{
                setBounds(column, row, 150, 35);
                setHorizontalAlignment(CENTER);
            }};
            return label;
        }
    }
}
