
public class Pawn extends Piece  {

    protected final int POINTS = 1;
    private String name; 
    private String startPos;
    private String currentPos;

    public Pawn() {
        name = "Pawn";
        shortName = ""; // none for chess notation
        color = "null";
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