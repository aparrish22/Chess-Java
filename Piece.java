public abstract class Piece {
    
    protected boolean isCaptured = false;
    protected String color;
    protected String shortName;

    boolean isCaptured() {
        return isCaptured;
    }

    public void setName(String s) {
        shortName = s;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsCaptured(boolean b) {
        isCaptured = b;
    }
    
    abstract String capture(String pos);
    abstract String move(String pos);
    abstract boolean isLegalMove();
    abstract String recordMove(String move);
    abstract boolean promotable(); // promote


}
