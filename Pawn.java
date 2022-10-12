// TODO might use this?-> import java.awt.Color;
// TODO need to review this

public class Pawn extends Piece  {

    protected final int POINTS = 1;
    private String name;
    private String startPos;
    private String currentPos; // grid chess notation, board.square.getname

    public Pawn() {
        name = "Pawn";
        shortName = ""; // none for chess notation
        color = "null";
    }

    // TODO only need to set startPos once
    public void setStartPos(String startPos) {
        this.startPos = startPos;
    }

    // guaranteed to change once "moved"
    public void setCurrentPos(String currentPos) {
        this.currentPos = currentPos;
    }

    //TODO, only need to do once (if player1, color white, else black)
    public void setColor(Pawn piece, String color) {
        this.color = color;
    }

    // TODO capture pieces diagnally foward and change currentPos
    @Override
    public String capture(String pos) {
        // record move (ex: Qxa2)
        return "";
    }

    public Pawn getPiece() { 
        return this;
    }

    @Override
    public boolean isCaptured() {
        // TODO when captured() by another piece
        // record move (example: "Nxe4")
        return super.isCaptured();
    }

    @Override
    public String move(String pos) {
        // TODO rules for moving the piece & change new currentPos
        // record move (example: e4, Kd3)
        return "";
    }

    // TODO can probably move this to log class
    @Override
    protected String recordMove(String move) {
        // TODO we want to record this to a certain data type 
        // to post chess and record chess moves for players
        // arraylist?
        return "";
    }

    @Override
    public boolean promotable() {
        // if on 8th for white, or 1st rank for black
            // promote(pawn)
            
    }

    public Piece promote() {
        
            // read user input on which piece to promote to 
            // looking at promotable() pieces that are true
    }

    @Override
    public String toString() {
        return "This is a pawn: " + this.getClass() + "\n";
    }
    
}