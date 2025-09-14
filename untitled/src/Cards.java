public class Cards import javax.swing.*;
        import java.awt.*;
public class Cards {

    JFrame frame;
    JPanel cardPanel;
    CardLayout cardLayout;

    public Cards() {

        frame = new JFrame("Cards");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);


        JPanel card1 = new JPanel();
        card1.setBackground(new Color(135, 206, 250));
        JLabel label1 = new JLabel("This is Card 1");
        label1.setFont(new Font("Segoe UI", Font.BOLD,20));
        label1.setForeground(new Color(33, 33, 33));
        card1.add(label1);

        JPanel card2 = new JPanel();
        card2.setBackground(new Color(255, 182, 193));
        JLabel label2 = new JLabel("This is Card 2");
        label2.setFont(new Font("Segoe UI", Font.BOLD, 20));
        label2.setForeground(new Color(33, 33, 33));
        card2.add(label2);

        JPanel card3 = new JPanel();
        card3.setBackground(new Color(211, 211, 211));
        JLabel label3 = new JLabel("This is Card 3");
        label3.setFont(new Font("Segoe UI", Font.BOLD, 20));
        label3.setForeground(new Color(33, 33, 33));
        card3.add(label3);
        
}
