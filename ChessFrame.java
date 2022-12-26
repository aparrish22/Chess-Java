import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChessFrame extends JFrame implements WindowListener, ActionListener {

    JButton newGameButton, loadButton, saveButton, exitButton;

    public ChessFrame() {

        super();
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addWindowListener(this);


        setPreferredSize(new Dimension(600, 600));

        // buttons
        newGameButton = new JButton(new AbstractAction("new game") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                drawBoard();
            }
        });

        loadButton = new JButton(new AbstractAction("load game") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                // code here
            }
        });

        saveButton = new JButton(new AbstractAction("save game") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                // code here
            }
        });

        add(newGameButton);
        add(loadButton);
        add(saveButton);

        pack();

        newGameButton.addActionListener(this);
        loadButton.addActionListener(this);
        saveButton.addActionListener(this);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

    }

    private void drawBoard() {

        // Create the JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(new GridLayout(8, 8));

        Color color;

        // Create the board squares
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                boolean isLight = (row % 2) == (col % 2);

                // Determine the background color for the square
                color = (isLight)? Color.WHITE : Color.BLACK;

                // Create the square and set its properties
                JLabel square = new JLabel();
                square.setPreferredSize(new Dimension(40, 40));
                square.setOpaque(true);
                square.setBackground(color);

                // Add the square to the panel
                panel.add(square);
            }

            
        }
        
        add(panel);
        setVisible(true);

    }

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}


}
