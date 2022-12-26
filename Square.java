import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square extends JPanel {
    
    private String color;
    private String name;
    private boolean onSquare;
    private int file, rank;

    public Square(int size, Color color) {
        setPreferredSize(new Dimension(size, size));
        setBackground(color);
    }

    public Square(int x, int y) {
        file = x;
        rank = y;
    }

    public boolean hasPiece() {
        return (onSquare)? true : false;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean isOnSquare() {
        return onSquare;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    // fix, prob dont need this 
    // can call this when piece leaves current square and moves to new square
    public void setOnSquare(boolean onSquare) {
        this.onSquare = onSquare;
    }

    @Override
    public String toString() {
        return "Square [color=" + color + "], [file=" + file + "], [rank="
        + rank + "], [name=" + name 
        + "], [onSquare=" + onSquare + "], \n\n";
    }

    

}
