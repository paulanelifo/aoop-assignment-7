import java.awt.Color;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Restaurant Reviewer"){{
            setSize(790, 540);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(null);
        }};
        
        int col1 = 10,
                col2=col1+151,
                col3=col2+151,
                col4=col3+151,
                col5=col4+151;
        int row1 = 10,
                row2=row1+36,
                row3=row2+36,
                row4=row3+36,
                row5=row4+36,
                row6=row5+36;
        
        // Just Labels - Column Headers
        JLabel lbl1 = new JLabel("Restaurant"){{
            setBounds(col1, row1, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl1);        
        JLabel lbl2 = new JLabel("Reviewer"){{
            setBounds(col2, row1, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl2);        
        JLabel lbl3 = new JLabel("Review"){{
            setBounds(col3, row1, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl3);        
        JLabel lbl4 = new JLabel("Rating"){{
            setBounds(col4, row1, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl4);        
        JLabel lbl5 = new JLabel("Rating"){{
            setBounds(col5, row1, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl5);
        
        // 1st Row of Data
        JLabel lblRestaurant1 = new JLabel("Sample"){{
            setBounds(col1, row2, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblRestaurant1);
        JLabel lblReviewer1 = new JLabel("Sample"){{
            setBounds(col2, row2, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblReviewer1);
        JLabel lblReview1 = new JLabel("Sample"){{
            setBounds(col3, row2, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblReview1);
        JLabel lblRating1 = new JLabel("Sample"){{
            setBounds(col4, row2, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblRating1);
        JButton btnAddAction1 = new JButton("Sample"){{
            setBounds(col5, row2, 150, 35);
            setHorizontalAlignment(CENTER);
            setFocusable(false);
        }};
        mainFrame.add(btnAddAction1);
        
        // 2nd Row of Data
        JLabel lblRestaurant2 = new JLabel("Sample"){{
            setBounds(col1, row3, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblRestaurant2);
        JLabel lblReviewer2 = new JLabel("Sample"){{
            setBounds(col2, row3, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblReviewer2);
        JLabel lblReview2 = new JLabel("Sample"){{
            setBounds(col3, row3, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblReview2);
        JLabel lblRating2 = new JLabel("Sample"){{
            setBounds(col4, row3, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblRating2);
        JButton btnAddAction2 = new JButton("Sample"){{
            setBounds(col5, row3, 150, 35);
            setHorizontalAlignment(CENTER);
            setFocusable(false);
        }};
        mainFrame.add(btnAddAction2);
        
        // 3rd Row of Data
        JLabel lblRestaurant3 = new JLabel("Sample"){{
            setBounds(col1, row4, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblRestaurant3);
        JLabel lblReviewer3 = new JLabel("Sample"){{
            setBounds(col2, row4, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblReviewer3);
        JLabel lblReview3 = new JLabel("Sample"){{
            setBounds(col3, row4, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblReview3);
        JLabel lblRating3 = new JLabel("Sample"){{
            setBounds(col4, row4, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblRating3);
        JButton btnAddAction3 = new JButton("Sample"){{
            setBounds(col5, row4, 150, 35);
            setHorizontalAlignment(CENTER);
            setFocusable(false);
        }};
        mainFrame.add(btnAddAction3);
        
        // 4th Row of Data
        JLabel lblRestaurant4 = new JLabel("Sample"){{
            setBounds(col1, row5, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblRestaurant4);
        JLabel lblReviewer4 = new JLabel("Sample"){{
            setBounds(col2, row5, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblReviewer4);
        JLabel lblReview4 = new JLabel("Sample"){{
            setBounds(col3, row5, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblReview4);
        JLabel lblRating4 = new JLabel("Sample"){{
            setBounds(col4, row5, 150, 35);
            setHorizontalAlignment(CENTER);
        }};
        mainFrame.add(lblRating4);
        JButton btnAddAction4 = new JButton("Sample"){{
            setBounds(col5, row5, 150, 35);
            setHorizontalAlignment(CENTER);
            setFocusable(false);
        }};
        mainFrame.add(btnAddAction4);
        
        // Add button
        JButton btnAdd = new JButton("Add"){{
            setBounds(col1, row5+36, 754, 35);
            setHorizontalAlignment(CENTER);
            setFocusable(false);
        }};
        mainFrame.add(btnAdd);
        
        mainFrame.setVisible(true);
    }
}
