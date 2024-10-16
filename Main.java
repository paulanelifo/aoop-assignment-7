import java.awt.Color;
import javax.swing.*;
public class Main {
    
    static int col1 = 10,
            col2=col1+151,
            col3=col2+151,
            col4=col3+151,
            col5=col4+151;
    static int row1 = 10,
            row2=row1+36,
            row3=row2+36,
            row4=row3+36,
            row5=row4+36,
            row6=row5+36;

    // Just Labels - Column Headers
    static JLabel lbl1 = new JLabel("Restaurant"){{
        setBounds(col1, row1, 150, 35);
        setHorizontalAlignment(CENTER);
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }};     
    static JLabel lbl2 = new JLabel("Reviewer"){{
        setBounds(col2, row1, 150, 35);
        setHorizontalAlignment(CENTER);
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }};      
    static JLabel lbl3 = new JLabel("Review"){{
        setBounds(col3, row1, 150, 35);
        setHorizontalAlignment(CENTER);
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }};
    static JLabel lbl4 = new JLabel("Rating"){{
        setBounds(col4, row1, 150, 35);
        setHorizontalAlignment(CENTER);
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }};
    static JLabel lbl5 = new JLabel("Rating"){{
        setBounds(col5, row1, 150, 35);
        setHorizontalAlignment(CENTER);
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }};
    
    // 1st Row of Data
    static JLabel lblRestaurant1 = new JLabel("Sample"){{
        setBounds(col1, row2, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblReviewer1 = new JLabel("Sample"){{
        setBounds(col2, row2, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblReview1 = new JLabel("Sample"){{
        setBounds(col3, row2, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblRating1 = new JLabel("Sample"){{
        setBounds(col4, row2, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JButton btnAddAction1 = new JButton("Sample"){{
        setBounds(col5, row2, 150, 35);
        setHorizontalAlignment(CENTER);
        setFocusable(false);
    }};
        
    // 2nd Row of Data
    static JLabel lblRestaurant2 = new JLabel("Sample"){{
        setBounds(col1, row3, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblReviewer2 = new JLabel("Sample"){{
        setBounds(col2, row3, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblReview2 = new JLabel("Sample"){{
        setBounds(col3, row3, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblRating2 = new JLabel("Sample"){{
        setBounds(col4, row3, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JButton btnAddAction2 = new JButton("Sample"){{
        setBounds(col5, row3, 150, 35);
        setHorizontalAlignment(CENTER);
        setFocusable(false);
    }};
    
    // 3rd Row of Data
    static JLabel lblRestaurant3 = new JLabel("Sample"){{
        setBounds(col1, row4, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblReviewer3 = new JLabel("Sample"){{
        setBounds(col2, row4, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblReview3 = new JLabel("Sample"){{
        setBounds(col3, row4, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblRating3 = new JLabel("Sample"){{
        setBounds(col4, row4, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JButton btnAddAction3 = new JButton("Sample"){{
        setBounds(col5, row4, 150, 35);
        setHorizontalAlignment(CENTER);
        setFocusable(false);
    }};
    
    // 4th Row of Data
    static JLabel lblRestaurant4 = new JLabel("Sample"){{
        setBounds(col1, row5, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblReviewer4 = new JLabel("Sample"){{
        setBounds(col2, row5, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblReview4 = new JLabel("Sample"){{
        setBounds(col3, row5, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JLabel lblRating4 = new JLabel("Sample"){{
        setBounds(col4, row5, 150, 35);
        setHorizontalAlignment(CENTER);
    }};
    static JButton btnAddAction4 = new JButton("Sample"){{
        setBounds(col5, row5, 150, 35);
        setHorizontalAlignment(CENTER);
        setFocusable(false);
    }};


    public static void main(String[] args) {
        // The Frame
        JFrame mainFrame = new JFrame("Restaurant Reviewer"){{
            setSize(790, 275);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(null);
        }};
        
        mainFrame.add(lbl1);   
        mainFrame.add(lbl2);  
        mainFrame.add(lbl3);      
        mainFrame.add(lbl4);          
        mainFrame.add(lbl5);
        
        mainFrame.add(lblRestaurant1);
        mainFrame.add(lblReviewer1);
        mainFrame.add(lblReview1);
        mainFrame.add(lblRating1);
        mainFrame.add(btnAddAction1);
        
        mainFrame.add(lblRestaurant2);
        mainFrame.add(lblReviewer2);
        mainFrame.add(lblReview2);
        mainFrame.add(lblRating2);
        mainFrame.add(btnAddAction2);
        
        mainFrame.add(lblRestaurant3);
        mainFrame.add(lblReviewer3);
        mainFrame.add(lblReview3);
        mainFrame.add(lblRating3);
        mainFrame.add(btnAddAction3);
        
        mainFrame.add(lblRestaurant4);
        mainFrame.add(lblReviewer4);
        mainFrame.add(lblReview4);
        mainFrame.add(lblRating4);
        mainFrame.add(btnAddAction4);
        
        // Add button
        JButton btnAdd = new JButton("Add"){{
            setBounds(col1, row6, 754, 35);
            setHorizontalAlignment(CENTER);
            setFocusable(false);
        }};
        mainFrame.add(btnAdd);
        
        mainFrame.setVisible(true);
    }
    public void setLabels(String a, String b, String c, String d, String e){
    }
}
