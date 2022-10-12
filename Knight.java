public class Knight extends Piece {
    
    protected final int POINTS = 3;
    private String name;
    private String startPos;
    private String currentPos;
    
    public Knight() {
        name = "Knight";
        shortName = "K";
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStartPos() {
        return startPos;
    }
    public void setStartPos(String startPos) {
        this.startPos = startPos;
    }
    public String getCurrentPos() {
        return currentPos;
    }
    public void setCurrentPos(String currentPos) {
        this.currentPos = currentPos;
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
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
