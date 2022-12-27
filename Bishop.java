import java.io.File;
import java.awt.Color;
import javax.swing.*;
import java.io.*;

public class Bishop extends Piece {

    protected final int POINTS = 3;
    private String name; 
    private String startPos;
    private String currentPos;
    private String side;

    private ImageIcon icon;

    // image
    File whitePath = new File("resources/images/W-Bishop.png");
    File blackPath = new File("resources/images/B-Bishop.png");

    public Bishop(Color color, String side) {
        name = "Pawn";
        this.shortName = "";
        this.color = color;
        this.side = side;
    }

    @Override
    void drawPiece(JFrame frame) throws IOException {
        // grab white or black pawn
        if (this.color == Color.WHITE)
            icon = new ImageIcon(whitePath.getAbsolutePath());
        else if (this.color == Color.BLACK) 
            icon = new ImageIcon(blackPath.getAbsolutePath());
        
        JLabel label = new JLabel(icon);
        frame.add(label);

    }

    @Override
    String setCurrentPos(String pos) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    String capture(String pos) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    boolean isLegalMove(String startPos, String destPos) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    String move(String pos) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    boolean promotable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    String recordMove(String move) {
        // TODO Auto-generated method stub
        return null;
    }
    


}
