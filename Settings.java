import java.awt.Dimension;

import javax.swing.plaf.DimensionUIResource;;

/*
 * Contains default settings and settings which User/Player can change
 */
public class Settings {
    
    // window size
    private int width, height;

    // default Settings
    public Settings() {
        width = 700;
        height = 700;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
