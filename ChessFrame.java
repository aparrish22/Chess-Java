import javax.swing.*;
import java.awt.*;

public class ChessFrame extends JFrame {
    JButton newGame, load, save, exit;
    
    public ChessFrame() {
        super("Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        BoardPanel gBoard = new BoardPanel();
        

        // modify frame
        panelButtons(panel);

        // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       
        pack();
        
        // need to create resizeable frame/window for chess to be played
        setSize(500, 500);

        // set position of frame after resizing ****
        setLocationRelativeTo(null);

        // setBounds((int)screenSize.getWidth()/2, (int)screenSize.getHeight()/2, 500, 500);
        setVisible(true);

        
    }

    private void panelButtons(JPanel panel) {
         
        newGame = new JButton ("New");
        load = new JButton("Load");
        save = new JButton("Save");
        exit = new JButton("Exit");
        
        // need to modify Components first before adding
            // note: for some reason, I am able to modify buttons 
            // after adding to panel and have it show up on GUI
        load.setEnabled(false);
        save.setEnabled(false);

        panel.add(newGame);
        panel.add(load);
        panel.add(save);
        panel.add(exit);
        
        // add panel to a frame 
        add(panel);
    }



}
