public abstract class Piece {
    
    protected boolean isCaptured = false;
    protected String color;
    protected String shortName;

    boolean isCaptured() {
        return isCaptured;
    }

    
    abstract String capture(String pos);
    abstract String move(String pos);
    abstract String recordMove(String move);
    abstract boolean promotable(); // promote


}
