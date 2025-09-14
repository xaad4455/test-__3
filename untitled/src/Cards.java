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
        
        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");
        cardPanel.add(card3, "Card3");

        JButton btn1 = new JButton("Show Card 1");
        btn1.setFont(new Font("Segoe UI", Font.PLAIN,14));
        btn1.setBackground(new Color(100, 149, 237));
        btn1.setForeground(Color.WHITE);
        btn1.setFocusPainted(false);
        btn1.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));

        JButton btn2 = new JButton("Show Card 2");
        btn2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btn2.setBackground(new Color(100, 149, 237));
        btn2.setForeground(Color.WHITE);
        btn2.setFocusPainted(false);
        btn2.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));

        JButton btn3 = new JButton("Show Card 3");
        btn3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btn3.setBackground(new Color(100, 149, 237));
        btn3.setForeground(Color.WHITE);
        btn3.setFocusPainted(false);
        btn3.setBorder(BorderFactory.createEmptyBorder(8,16,8,16));
        btn1.addActionListener(e -> cardLayout.show(cardPanel, "Card1"));
        btn2.addActionListener(e -> cardLayout.show(cardPanel, "Card2"));
        btn3.addActionListener(e -> cardLayout.show(cardPanel, "Card3"));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(245,245,245));
        

}
