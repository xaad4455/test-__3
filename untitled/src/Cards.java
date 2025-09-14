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
}
