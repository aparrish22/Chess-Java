// import java.time.Year;
// import java.time.YearMonth;

public class Chess {
    
    public static void main(String[] args) {
        Board board = new Board();

        // test board grid coords
        printSquareInfo(board);

        ChessFrame chessFrame = new ChessFrame();

        

        // Player player1 = new Player();
        // Player player2 = new Player("name?");

        // bonus, ask user what color board they want and  enable resize of game board

        // Game game = new Game(board, player1, player2);

        // spawnPieces(); // in Game class? yes

    }

    public static void printSquareInfo(Board board) {
        int x,y;
        for (x = 0; x < 8; x++) {
            for (y = 0; y < 8; y++) {
                System.out.println(board.getSquare(x,y).toString());
            }
        }
    }

}

    // TODO board creation in separate java file, place in same folder,
    // then import it into main java file.

