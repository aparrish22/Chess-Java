package TestingFrames;

import javax.swing.*;
import java.awt.*;

public class TextFramePanel extends JPanel {

    String text;
    String fontName;

    public TextFramePanel(String text, String fontName) {
        super();
        this.text = text;
        this.fontName = fontName;
    }


    // does not wrap around window/panel
    public void paintComponent(Graphics comp) {
        super.paintComponents(comp);
        Graphics2D comp2d = (Graphics2D) comp;
        comp2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
            RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font(fontName, Font.BOLD, 18);
        FontMetrics metrics = getFontMetrics(font);
        comp2d.setFont(font);
        int x = (getSize().width - metrics.stringWidth(text)) / 2;
        int y = getSize().height / 2;
        comp2d.drawString(text, x, y);
    }

}