import java.awt.Color;
import java.io.IOException;

import javax.swing.JFrame;

public abstract class Piece {
    
    protected boolean isCaptured = false;
    protected Color color;
    protected String shortName;

    boolean isCaptured() {
        return isCaptured;
    }

    public void setName(String s) {
        shortName = s;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setIsCaptured(boolean b) {
        isCaptured = b;
    }
    
    abstract void drawPiece(JFrame frame) throws IOException;
    abstract String setCurrentPos(String pos);
    abstract String capture(String pos);
    abstract String move(String pos); 
    abstract boolean isLegalMove(String startPos, String destPos);
    abstract String recordMove(String move);
    abstract boolean promotable(); // promote


}
