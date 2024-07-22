import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    Login(){
        setSize(900 , 400);
        setLocation(300 , 200);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131 , 193 , 233));
        p1.setBounds(0 , 0 , 400 , 400);
        p1.setLayout(null);
        add(p1);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image img2 = img1.getImage().getScaledInstance(200 , 200 , Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);
        image.setBounds(100 , 120 , 200 ,200);
        p1.add(image);

        JLabel p2 = new JLabel();
        p2.setLayout(null);
        p2.setBounds(400 , 30 , 450 , 300);
        p2.setOpaque(true);
        add(p2);

        JLabel userName = new JLabel("Username");
        userName.setBounds(60 , 20 , 100 , 25);
        userName.setFont(new Font("SAN_SERIF" , Font.PLAIN , 20));
        p2.add(userName);

        JTextField userNameInput = new JTextField();
        userNameInput.setBounds(60 , 50 , 300 , 30);
        userNameInput.setBorder(BorderFactory.createEmptyBorder());
        p2.add(userNameInput);

        JLabel userPassword = new JLabel("Password");
        userPassword.setBounds(60 , 100 , 100 , 25);
        userPassword.setFont(new Font("SAN_SERIF" , Font.PLAIN , 20));
        p2.add(userPassword);

        JTextField userPasswordInput = new JTextField();
        userPasswordInput.setBounds(60 , 130 , 300 , 30);
        userPasswordInput.setBorder(BorderFactory.createEmptyBorder());
        p2.add(userPasswordInput);

        JButton login = new JButton("Login");
        login.setBounds(60 , 180 , 130 , 30);
        login.setBackground(new Color(133 , 193 , 233));
        login.setForeground(Color.white);
        login.setBorder(BorderFactory.createEmptyBorder());
        p2.add(login);

        JButton signup = new JButton("Signup");
        signup.setBounds(220 , 180 , 130 , 30);
        signup.setBackground(new Color(133 , 193 , 233));
        signup.setForeground(Color.white);
        signup.setBorder(BorderFactory.createEmptyBorder());
        p2.add(signup);

        JButton forgot = new JButton("Forgot Password");
        forgot.setBounds(140 , 230 , 130 , 30);
        forgot.setBackground(new Color(133 , 193 , 233));
        forgot.setForeground(Color.white);
        forgot.setBorder(BorderFactory.createEmptyBorder());
        p2.add(forgot);

        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(300 , 230 , 150 , 20);
        text.setBackground(Color.red);
        p2.add(text);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
