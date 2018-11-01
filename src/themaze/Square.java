/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themaze;

import java.awt.*;

/**
 *
 * @author 073787251
 */
public class Square {

    static int hovX = 50, hovY = 0; //The square that is being hovered over
    int x, y;
    int state; //Whether or not the block is a wall or a path
    boolean exit = false;

    public Square(int x, int y, int state, boolean exit) {
        this.x = x;
        this.y = y;
        this.state = state;
        this.exit = exit;
    }

    public void display(Graphics g) {
        if (exit) {
            g.setColor(Color.RED);
            g.fillRect(x,y,50,50);
        } else {
            if (state == 0) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.DARK_GRAY);
                g.fillRect(x, y, 50, 50);
            }
            g.setColor(Color.RED);
            g.drawRect(hovX, hovY, 50, 50);
        }
    }
}
