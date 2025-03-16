import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    private JLabel imageLabel;
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private String[] imagePaths = {
            "bird.png", "cat.png", "dog.png", "rabbit.png", "pig.png"
    };

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for radio buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(5, 1));

        // Create radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Group radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add action listeners
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Add buttons to panel
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        // Panel for image
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        updateImage("pig.png");  // Default image

        // Add components to frame
        add(radioPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == birdButton) {
            updateImage(imagePaths[0]);
        } else if (e.getSource() == catButton) {
            updateImage(imagePaths[1]);
        } else if (e.getSource() == dogButton) {
            updateImage(imagePaths[2]);
        } else if (e.getSource() == rabbitButton) {
            updateImage(imagePaths[3]);
        } else if (e.getSource() == pigButton) {
            updateImage(imagePaths[4]);
        }
    }

    private void updateImage(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        imageLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
