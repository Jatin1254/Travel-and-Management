import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {

    Signup() {
        setSize(900, 400);
        setLocation(300, 200);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel userName = new JLabel("Username");
        userName.setFont(new Font("Tahoma", Font.BOLD, 15));
        userName.setBounds(50, 40, 125, 25);
        p1.add(userName);

        JTextField userNameInput = new JTextField();
        userNameInput.setBounds(175, 40, 180, 25);
        userNameInput.setBorder(BorderFactory.createEmptyBorder());
        p1.add(userNameInput);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 15));
        name.setBounds(50, 80, 125, 25);
        p1.add(name);

        JTextField nameInput = new JTextField();
        nameInput.setBounds(175, 80, 180, 25);
        nameInput.setBorder(BorderFactory.createEmptyBorder());
        p1.add(nameInput);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Tahoma", Font.BOLD, 15));
        password.setBounds(50, 120, 125, 25);
        p1.add(password);

        JTextField passwordInput = new JTextField();
        passwordInput.setBounds(175, 120, 180, 25);
        passwordInput.setBorder(BorderFactory.createEmptyBorder());
        p1.add(passwordInput);

        JLabel question = new JLabel("Question?");
        question.setFont(new Font("Tahoma", Font.BOLD, 15));
        question.setBounds(50, 160, 125, 25);
        p1.add(question);

        Choice ask = new Choice();
        ask.add("Nickname in school?");
        ask.add("Lucky number?");
        ask.add("Fav color?");
        ask.add("Fav Marvel character?");
        ask.setBounds(175 , 160 ,180 , 25);
        p1.add(ask);

        JLabel answer = new JLabel("Answer");
        answer.setFont(new Font("Tahoma", Font.BOLD, 15));
        answer.setBounds(50, 200, 125, 25);
        p1.add(answer);

        JTextField answerInput = new JTextField();
        answerInput.setBounds(175, 200, 180, 25);
        answerInput.setBorder(BorderFactory.createEmptyBorder());
        p1.add(answerInput);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }
}
