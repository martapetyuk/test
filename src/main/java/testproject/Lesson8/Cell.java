package testproject.Lesson8;

import java.awt.*;

public class Cell {
    private int x, y;
    private int size;
    private Color color;


    public Cell(int x, int y, int cellSize, Color color){
        //this.x = x;
        //this.y = y;
        set(x,y);
        this.size = size;
        this.color = color;
    }
    public void set(int x, int y){ // отдельный класс чтобы не поврорять координаты
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void paint(Graphics2D g){
        g.setColor(color);
        g.fillOval(x = size, y= size, size, size);
    }
}
