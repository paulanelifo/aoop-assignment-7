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
        refreshPanels();
        // The Frame
        JFrame mainFrame = new JFrame("Restaurant Reviewer") {{
            setSize(790, 275);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(null);
            setResizable(false);
        }};

        addHeaders(mainFrame); //add header panels

        // main scroll pane
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
        btnAdd.addActionListener(e -> {
            // Create a JPanel for data entry form
            JDialog EntryDialog = new JDialog(mainFrame, "Review Entry", true){{
                setLayout(null);
                setPreferredSize(new Dimension(500,220));
                setResizable(false);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setLocationRelativeTo(null);
            }};

            //RESTAURANT
            JLabel lbl1 = new JLabel("Restaurant"){{
                setBounds(2, 8, 70, 20);
                setHorizontalAlignment(CENTER);
//                setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//                setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }};
            EntryDialog.add(lbl1);
            JTextField tfRestaurantName = new JTextField(){{
                setBounds(73, 2, 400, 35);
                setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }};
            EntryDialog.add(tfRestaurantName);
            //REVIEWER
            JLabel lbl2 = new JLabel("Reviewer"){{
                setBounds(2, 44, 70, 20);
                setHorizontalAlignment(CENTER);
//                setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//                setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }};
            EntryDialog.add(lbl2); 
            JTextField tfReviewer = new JTextField(){{
                setBounds(73, 38, 400, 35);
                setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }};
            EntryDialog.add(tfReviewer);
            //REVIEW
            JLabel lbl3 = new JLabel("Review"){{
                setBounds(2, 80, 70, 20);
                setHorizontalAlignment(CENTER);
//                setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//                setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }};
            EntryDialog.add(lbl3); 
            JTextField tfReview = new JTextField(){{
                setBounds(73, 74, 400, 35);
                setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }};
            EntryDialog.add(tfReview);
            //RATING
            JLabel lbl4 = new JLabel("Rating"){{
                setBounds(2, 116, 70, 20);
                setHorizontalAlignment(CENTER);
//                setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//                setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            }};
            EntryDialog.add(lbl4); 
            JPanel pnlRButtons = new JPanel(){{
                setBounds(73, 110, 400, 35);
                setLayout(new GridLayout(1, 5));
            }};
            JRadioButton rating1 = new JRadioButton("1");
            JRadioButton rating2 = new JRadioButton("2");
            JRadioButton rating3 = new JRadioButton("3");
            JRadioButton rating4 = new JRadioButton("4");
            JRadioButton rating5 = new JRadioButton("5");
            ButtonGroup grpRadioButtons = new ButtonGroup();
            JRadioButton[] arrayRadioButtons = {rating1, rating2, rating3, rating4, rating5};
            for(JRadioButton rb : arrayRadioButtons){
                grpRadioButtons.add(rb);
                rb.setFocusable(false);
                pnlRButtons.add(rb);
            }
            EntryDialog.add(pnlRButtons);
            
            JButton btnSave = new JButton("Save"){{
                setBounds(2, 150, 245, 25);
                setFocusable(false);
                addActionListener(e -> {
                    String restaurantName = tfRestaurantName.getText();
                    String reviewerName = tfReviewer.getText();
                    String reviewText = tfReview.getText();
                    int rating = 1; //default rating
                    for(JRadioButton rb : arrayRadioButtons){
                        if(rb.isSelected()){
                            rating = Integer.parseInt(rb.getText());
                            break;
                        }
                    }
                    ReviewPanel reviewPanel = ReviewPanel.create(restaurantName, reviewerName, reviewText, rating);
                    arraylist.add(reviewPanel);
                    refreshPanels();
                    EntryDialog.dispose();
                });
            }};
            EntryDialog.add(btnSave);
            JButton btnCancel = new JButton("Cancel"){{
                setBounds(248, 150, 235, 25);
                setFocusable(false);
                addActionListener(e -> {
                    EntryDialog.dispose();
                });
            }};
            EntryDialog.add(btnCancel);
            
            //finalize the frame
            EntryDialog.pack();
            EntryDialog.setVisible(true);
            
            refreshPanels();
        });
        mainFrame.add(btnAdd);
        
        ReviewPanel reviewPanel = ReviewPanel.create("Restaurant A", "Reviewer A", "Great food!", 1);
        arraylist.add(reviewPanel);
        ReviewPanel reviewPanel1 = ReviewPanel.create("Restaurant B", "Reviewer B", "Excellent service!", 5);
        arraylist.add(reviewPanel1);
        
        refreshPanels();
        mainFrame.setVisible(true);
    }
    public static void addHeaders(JFrame mainFrame){
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
