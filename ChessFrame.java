import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class ChessFrame extends JFrame implements WindowListener, ActionListener {

    JButton newGameButton, loadButton, saveButton, exitButton;
    Board board;
    Map<String,JLabel> map = new HashMap<>();


    public ChessFrame() throws IOException {   
       
        super();
        
        board = new Board();
        
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addWindowListener(this);

        setPreferredSize(new Dimension(600, 600));

        JFrame frame = this;

        // buttons
        newGameButton = new JButton(new AbstractAction("new game") {
            
            boolean newGameInstance = false;

            @Override
            public void actionPerformed( ActionEvent e ) {
                
                if (!newGameInstance) {
                    drawBoard();
                    newGameInstance = true;
                    try {
                        insertImages(frame);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    newGameButton.setVisible(false);
                }
                
            }
        });

        loadButton = new JButton(new AbstractAction("load game") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                // code here
            }
        });

        saveButton = new JButton(new AbstractAction("save game") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                // code here
            }
        });

        add(newGameButton);
        add(loadButton);
        add(saveButton);


        pack();

        newGameButton.addActionListener(this);
        loadButton.addActionListener(this);
        saveButton.addActionListener(this);

        setLocationRelativeTo(null);

        setVisible(true);

    }

    private void insertImages(JFrame frame) throws IOException {

        // 8 pieces
        Pawn[] blackPawns = new Pawn[8];
        Pawn[] whitePawns = new Pawn[8];
        
        // 2 pieces
        Rook[] blackRooks = new Rook[2];
        Rook[] whiteRooks = new Rook[2];
        Knight[] blackKnights = new Knight[2];
        Knight[] whiteKnights = new Knight[2];
        Bishop[] blackBishops = new Bishop[2];
        Bishop[] whiteBishops = new Bishop[2];

        Queen blackQueen = new Queen(Color.BLACK, "black");
        Queen whiteQueen = new Queen(Color.WHITE, "white");
        King blackKing = new King(Color.BLACK, "black");
        King whiteKing = new King(Color.WHITE, "white");
        

        // creating 8 pawns for each player
        for (int i = 0; i < 8; i++) {
            blackPawns[i] = new Pawn(Color.BLACK, "black");
            whitePawns[i] = new Pawn(Color.WHITE, "white");

            blackPawns[i].drawPiece(frame);
            whitePawns[i].drawPiece(frame);
        }

        // creating 2 pieces for each side
        for (int i = 0; i < 2; i++) {
            blackRooks[i] = new Rook(Color.BLACK, "black");
            whiteRooks[i] = new Rook(Color.WHITE, "white");

            blackKnights[i] = new Knight(Color.BLACK, "black");
            whiteKnights[i] = new Knight(Color.WHITE, "white");

            blackBishops[i] = new Bishop(Color.BLACK, "black");
            whiteBishops[i] = new Bishop(Color.WHITE, "white");

            blackRooks[i].drawPiece(frame);
            whiteRooks[i].drawPiece(frame);
            blackKnights[i].drawPiece(frame);
            whiteKnights[i].drawPiece(frame);
            blackBishops[i].drawPiece(frame);
            whiteBishops[i].drawPiece(frame);

        }

        blackQueen.drawPiece(frame);
        whiteQueen.drawPiece(frame);
        blackKing.drawPiece(frame);
        whiteKing.drawPiece(frame);




    }

    public void actionPerformed(ActionEvent e) {}

    private void drawBoard() {


        // Create the JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(new GridLayout(8, 8));

        Color color;

        // Create the board squares
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                boolean isLight = (row % 2) == (col % 2);

                // Determine the background color for the square
                color = (isLight)? Color.WHITE : Color.BLACK;

                // Create the square and set its properties
                JLabel square = new JLabel();
                square.setPreferredSize(new Dimension(40, 40));
                square.setOpaque(true);
                square.setBackground(color);

                // combine square name with square jpanels
                map.put(board.getSquareName(col, row), square);

                // Add the square to the panel
                panel.add(square);
            }

        }
        
        add(panel);
        setVisible(true);

    }

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}



}