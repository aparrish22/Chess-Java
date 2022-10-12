import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;

public class BoardPanel extends JPanel {
    
    Board board = new Board();
    
    Graphics gBoard;

    public BoardPanel() {
        super();
    }



    // does not work because this is an "awt component" which cannot
    //   be shown in our JPanel
    /* public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        Graphics2D comp2d = (Graphics2D) comp;
        comp2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
           RenderingHints.VALUE_ANTIALIAS_ON);
        
        comp2d.create(5,5, 200, 200);
        comp2d.drawRect(10, 10, 100, 100);
        comp2d.setBackground(Color.BLUE);
    } */

}
