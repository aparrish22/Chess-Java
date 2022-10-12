package TestingFrames;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class TextFrame extends JFrame {
    
    public static void main(String[] args) {
        String text = "Sup bro! HHOW YOU DOIN' PPOPOIUN EYE JOE SHABLABNALBLIASJD!";
        String fontName = "Georgia";   
        
        TextFrame tf = new TextFrame(text, fontName);
    }

    public TextFrame(String text, String fontName) {
        super("Show THE font!");
        setSize(425, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Test: Centering the frame after setSize(), before add()
        setLocationRelativeTo(null);

        TextFramePanel sf = new TextFramePanel(text, fontName);

        add(sf);
        setVisible(true);
    }

}
