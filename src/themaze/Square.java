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

    public static int hovX = 50, hovY = 0; //The square that is being hovered over
    public int x, y;
    public int state; //Whether or not the block is a wall or a path
    public boolean exit = false;

    public Square(int x, int y, int state, boolean exit) {
        this.x = x;
        this.y = y;
        this.state = state;
        this.exit = exit;
    }

    public void display(Graphics g) {
        if (exit) {
            g.setColor(Color.GREEN);
            g.fillRect(x,y,50,50);
        } else {
            if (state == 0) {
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.DARK_GRAY);
                g.fillRect(x, y, 50, 50);
            }
        }
    }
}
