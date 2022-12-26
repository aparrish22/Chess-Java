import java.util.ArrayList;

public class Board {
    
    private Square[][] grid = new Square[8][8];
    private ArrayList<String> coordinates = new ArrayList<String>();

    public Board() {
        this.newBoard();
    }

    public Square getSquare(String name) {
        
        Square square = null;

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (name == grid[x][y].getName()) {
                    square = grid[x][y];
                }
            }
        }
        return square;
    }

    public Square getSquare(int file, int rank) {
        return grid[file][rank];
    }

    private void newBoard() {
        coordinates = writeCoords(coordinates);
        // x = file, y = rank
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                grid[x][y] = new Square(x,y);
                grid[x][y].setColor(colorSquare(x, y));
                grid[x][y].setName(nameSquare(x, y)); // TODO, complete newBoard()
            }
        }
    }

    private String colorSquare(int file, int rank) {
    
        // USING CHESS NOTATION:
        // a1-8...g1-8...
        if (even(file)) {
            if (!even(rank)) {
                return "white";
            } else {
                return "black";
            }
        }
        
        // b1-8...h1-8
        if (!even(file)) {
            if (!even(rank)) {
                return "white";
            } else {
                return "black";
            }
        }

        return "null";
    }

    private String nameSquare(int file, int rank) {
        String[][] names = new String[8][8];
        names = copyCoordinates(names);
        return names[file][rank];
    }

    private String[][] copyCoordinates(String[][] names) {

        int listCount = 0;
        int listSize = coordinates.size() - 1;

        while (listCount <= listSize) {
            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++) {
                    names[x][y] = coordinates.get(listCount);
                    listCount++;
                }
            }
        }
        return names;
    }

    private ArrayList<String> writeCoords(ArrayList<String> coordinates) {

        String file;
        String currentName;

        for (char alphabet = 'a'; alphabet <= 'h'; alphabet++) {
            file = Character.toString(alphabet);
            for (int rank = 1; rank <= 8; rank++) {
                currentName = file + Integer.toString(rank);
                coordinates.add(currentName);
            }
        }
    
        return coordinates;
    }

    private boolean even(int num) {
        // if even
        if (num % 2 == 0)
            return true;
        else
            return false;
    }



}