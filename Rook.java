public class Rook extends Piece {

    protected final int POINTS = 5;
    private String name;
    private String startPos;
    private String currentPos;

    public Rook() {
        name = "Rook";
        shortName = "R";
    }


    
    @Override
    String capture(String pos) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    boolean isCaptured() {
        // TODO Auto-generated method stub
        return super.isCaptured();
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



    @Override
    public String toString() {
        return "This is a rook: " + this.getClass() + "\n";
    }
    
}
