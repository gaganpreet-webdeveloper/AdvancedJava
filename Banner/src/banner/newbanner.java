/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package banner;

import java.applet.Applet;
import java.awt.*;

public class newbanner extends Applet {

    int x1 = 10;
    int y1 = 50;
    int x2 = 800;
    int y2 = 50;

    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.CYAN);
        setForeground(Color.red);
    }

    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
