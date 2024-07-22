import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.proteanit.sql.DbUtils;

public class ViewCustomers extends JFrame {
    private Connection conn;
    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ViewCustomers frame = new ViewCustomers();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ViewCustomers() {
        // Initialize the database connection
        try {
            // Replace with your actual database connection code
            conn = DriverManager.getConnection("jdbc:your_database_url", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Setup the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(580, 220, 900, 680);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Add images
        addImages();

        // Setup the table
        table = new JTable();
        table.setBounds(0, 40, 900, 350);
        contentPane.add(table);

        // Fetch and display data
        fetchData();

        // Add back button
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnNewButton.setBounds(390, 400, 120, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        contentPane.add(btnNewButton);

        // Add labels
        addLabels();

        getContentPane().setBackground(Color.WHITE);
    }

    private void addImages() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i3 = i1.getImage().getScaledInstance(626, 201, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 450, 626, 201);
        add(l1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(626, 201, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(615, 450, 626, 201);
        add(l2);
    }

    private void fetchData() {
        try {
            String displayCustomersql = "SELECT * FROM customer";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(displayCustomersql);

            // Using DbUtils to set the table model
            table.setModel(DbUtils.resultSetToTableModel(rs));

            // Close the resources
            rs.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addLabels() {
        String[] labels = {"Username", "Id Type", "Number", "Name", "Gender", "Country", "Address", "Phone", "Email"};
        int[] positions = {10, 110, 220, 320, 420, 520, 620, 720, 820};

        for (int i = 0; i < labels.length; i++) {
            JLabel label = new JLabel(labels[i]);
            label.setBounds(positions[i], 15, 90, 14);
            contentPane.add(label);
        }
    }
}
