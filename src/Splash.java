import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread thread;
    Splash() {

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image img2 = img1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel ig = new JLabel(img3);
        add(ig);

        setUndecorated(true);
        setVisible(true);
        thread = new Thread(this);
        thread.start();
    }
    public void run(){
        try {
            Thread.sleep(7000);
            setVisible(false);
        }
        catch (Exception e){

        }

    }

    public static void main(String[] args) {
        Splash frame = new Splash();

        int screenWidth = 1500;
        int screenHeight = 800;
        int centerX = screenWidth / 2;
        int centerY = screenHeight / 2;

        int j = 1;
        for (int i = 1; i <= 500; j += 7, i += 6) {
            int x = centerX - (j + i) / 2;
            int y = centerY - i / 2;
            frame.setLocation(x, y);
            frame.setSize(j + i, i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }


        frame.setLocation(centerX - 600, centerY - 300);
        frame.setSize(1200, 600);
    }
}
