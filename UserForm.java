import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm extends JFrame {

    private JTextField nameField;
    private JTextField emailField;
    private JTextArea addressArea;
    private JLabel messageLabel; // For displaying a submission message

    public UserForm() {
        setTitle("User Information Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2)); // Simple grid layout

        // Create labels and text fields for name and email
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        addressArea = new JTextArea(5, 20); // Text area for multi-line input
        JScrollPane scrollPane = new JScrollPane(addressArea); // Enable scrolling for long addresses

        // Create a submit button
        JButton submitButton = new JButton("Submit");

        messageLabel = new JLabel(""); // Initialize message label

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(addressLabel);
        add(scrollPane); // Add the scrollable text area
        add(new JLabel()); // Empty label for spacing
        add(submitButton);
        add(new JLabel()); // Empty label for spacing
        add(messageLabel);

        // Add ActionListener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });

        setVisible(true);
    }

    private void handleSubmit() {
        String name = nameField.getText();
        String email = emailField.getText();
        String address = addressArea.getText();

        // Validate input (basic checks)
        if (name.isEmpty() || email.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop processing if any field is empty
        }

        // You can add more advanced validation here (e.g., email format)

        // Print the information to the console (for demonstration)
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);

        //  You would typically do something more useful with the data here, like:
        //  - Save it to a file
        //  - Send it to a database
        //  - Use it to update other parts of your application

        // Display a confirmation message
        messageLabel.setText("Submission successful!");

        // Optionally clear the form after submission
        nameField.setText("");
        emailField.setText("");
        addressArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserForm();
            }
        });
    }
}
