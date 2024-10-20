import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<ReviewPanel> arraylist = new ArrayList<>();//the scroll pane
    static JPanel pnlForScroll = new JPanel() {{
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        }};
    public static void refreshPanels() {
        // Sort the arraylist by rating in descending order
        Collections.sort(arraylist, (panel1, panel2) -> Integer.compare(panel2.rating, panel1.rating));

        pnlForScroll.removeAll(); // Clear existing components

        for (ReviewPanel rpanel : arraylist) {
            pnlForScroll.add(rpanel);
        }

        pnlForScroll.revalidate(); // Refresh layout
        pnlForScroll.repaint(); // Update display
    }

    
    public static void main(String[] args) {
        // The Frame
        JFrame mainFrame = new JFrame("Restaurant Reviewer") {{
            setSize(790, 275);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(null);
            setResizable(false);
        }};

        // Just Labels - Column Headers
        JLabel lbl1 = new JLabel("Restaurant") {{
            setBounds(10, 10, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl1);
        JLabel lbl2 = new JLabel("Reviewer") {{
            setBounds(161, 10, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl2);
        JLabel lbl3 = new JLabel("Review") {{
            setBounds(312, 10, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl3);
        JLabel lbl4 = new JLabel("Rating") {{
            setBounds(463, 10, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl4);
        JLabel lbl5 = new JLabel("Action") {{
            setBounds(614, 10, 150, 35);
            setHorizontalAlignment(CENTER);
            setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }};
        mainFrame.add(lbl5);
        
        JScrollPane scrollPane = new JScrollPane() {{
            setBounds(10, 46, 755, 144);
            setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        }};
        scrollPane.setViewportView(pnlForScroll);
        mainFrame.add(scrollPane);
        // Add button
        JButton btnAdd = new JButton("Add") {{
            setBounds(10, 190, 754, 35);
            setHorizontalAlignment(CENTER);
            setFocusable(false);
        }};
        mainFrame.add(btnAdd);

        // About panels
        
        ReviewPanel reviewPanel = ReviewPanel.create("Restaurant A", "Reviewer A", "Great food!", 1);
        arraylist.add(reviewPanel);
        ReviewPanel reviewPanel1 = ReviewPanel.create("Restaurant A", "Reviewer A", "Great food!", 2);
        arraylist.add(reviewPanel1);
        ReviewPanel reviewPanel2 = ReviewPanel.create("Restaurant A", "Reviewer A", "Great food!", 3);
        arraylist.add(reviewPanel2);
        ReviewPanel reviewPanel3 = ReviewPanel.create("Restaurant A", "Reviewer A", "Great food!", 4);
        arraylist.add(reviewPanel3);
        ReviewPanel reviewPanel4 = ReviewPanel.create("Restaurant A", "Reviewer A", "Great food!", 5);
        arraylist.add(reviewPanel4);
        ReviewPanel reviewPanel5 = ReviewPanel.create("Restaurant A", "Reviewer A", "Great food!", 5);
        arraylist.add(reviewPanel5);
        
        refreshPanels();
       

        mainFrame.setVisible(true);
    }

    public static class ReviewPanel extends JPanel {
//        private ArrayList<ReviewPanel> panelList; // Reference to the global ArrayList
        public int rating;                // Field for the rating
        public String restaurant;         // Field for the restaurant name
        public String reviewer;           // Field for the reviewer name
        public String review;             // Field for the review text

        // Constructor
        private ReviewPanel(String sRestaurant, String sReviewer, String sReview, int nRating) {
            // Store values in fields
            this.restaurant = sRestaurant; // Store restaurant name
            this.reviewer = sReviewer;     // Store reviewer name
            this.review = sReview;         // Store review text
            this.rating = nRating;         // Store the rating

            // Set up panel dimensions
            Dimension dimSize = new Dimension(737, 35);
            Dimension dimEachSize = new Dimension(150, 35);

            setPreferredSize(dimSize);
            setMaximumSize(dimSize);
            setMinimumSize(dimSize);
            setLayout(null);            
            setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
//            setBackground(Color.red);

            // Create and add labels
            addLabel(this.restaurant, 0, dimEachSize);
            addLabel(this.reviewer, 151, dimEachSize);
            addLabel(this.review, 302, dimEachSize);
            addRatingLabel(this.rating, 453, dimEachSize);

            // Create and add remove button
            addRemoveButton(604, dimEachSize);
        }

        // Static factory method to create a ReviewPanel instance
        public static ReviewPanel create(String sRestaurant, String sReviewer, String sReview, int nRating) {
            return new ReviewPanel(sRestaurant, sReviewer, sReview, nRating);
        }

        // Method to add a label
        private void addLabel(String text, int x, Dimension size) {
            JLabel label = new JLabel(text);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setPreferredSize(size);
            label.setMaximumSize(size);
            label.setMinimumSize(size);
            label.setBounds(x, 0, size.width, size.height);
            add(label);
        }

        // Method to add the rating label
        private void addRatingLabel(int rating, int x, Dimension size) {
            JLabel ratingLabel = new JLabel(String.valueOf(rating));
            ratingLabel.setHorizontalAlignment(SwingConstants.CENTER);
            ratingLabel.setPreferredSize(size);
            ratingLabel.setMaximumSize(size);
            ratingLabel.setMinimumSize(size);
            ratingLabel.setBounds(x, 0, size.width, size.height);
            add(ratingLabel);
        }

        // Method to add the remove button
        private void addRemoveButton(int x, Dimension size) {
            JButton btnRemove = new JButton("Remove");
            btnRemove.setBounds(x, 0, 133, 35);
            btnRemove.setPreferredSize(size);
            btnRemove.setMaximumSize(size);
            btnRemove.setMinimumSize(size);
            btnRemove.setHorizontalAlignment(SwingConstants.CENTER);
            btnRemove.setFocusable(false);
            
            // Adding ActionListener to remove the panel from the ArrayList
            btnRemove.addActionListener(e -> {
                arraylist.remove(this); // Remove this panel from the ArrayList
                refreshPanels();
            });
            
            add(btnRemove);
        }
    }

}
