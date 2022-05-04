package testproject.Lesson8;

import java.awt.*;
import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> snake;
    private int direction;

private Food food;

    public Snake(int x, int y, int lenght, int direction) { // параметры змейки
        snake = new LinkedList<>();
        for (int i = 0; i < lenght; i++) {
            snake.add(new Cell(x - i, y, GameSnake.CELL_SIZE, GameSnake.SNAKE_COLOR));
        }
        this.direction = direction;
    }


public void setFood(Food food){
        this.food = food;
    }

   // public void setPoison(Poison poison) {
   // this.poison = poison;
    //}


    public int size() {
        return snake.size();
    }


    public void setDirection(int direction){ //
        if ((direction >= GameSnake.KEY_LEFT)&& (direction <= GameSnake.KEY_DOWN)){
       if (Math.abs(this.direction - direction) != 2){
           this.direction = direction;

            }
        }
    }

    public boolean isInSnake(int x, int y){
        for (Cell cell : snake){
            if ((cell.getX() == x) && (cell.getY() == y)) {
                return true;
            }
        }
        return false;
    }

    public void move(){
        int x = snake.getFirst().getX(); // движение с головы
        int y = snake.getFirst().getY();
        switch (direction) { // усоверщ. версия if
            case GameSnake.KEY_LEFT: x--; // на одну ячейку влево
            if (x<0) // до  левого достижения края, продолжит с другого противоположного
                x = GameSnake.CANVAS_WIDTH - 1;
            break;
            case GameSnake.KEY_RIGHT: x++;
            if (x== GameSnake.CANVAS_WIDTH) // правого края, возвращение с самого начала
                x = 0;
            break;
            case GameSnake.KEY_UP: y--;
            if (y<0)
                y= GameSnake.CANVAS_HEIGHT -1;
            break;
            case GameSnake.KEY_DOWN: y++;
            if ( y== GameSnake.CANVAS_HEIGHT)
                y=0;
            break;
        }

        if (isInSnake(x,y))  /* ||
                poison.isPoison(x,y) */
            {
            GameSnake.gameOver = true;
            return;
        }
        snake.addFirst(new Cell(x,y, GameSnake.CELL_SIZE, GameSnake.SNAKE_COLOR));
        if (food.isFood(x, y)){
            food.eat();
        } else {
            snake.removeLast();
        }
    }
    public void paint (Graphics2D g){
        for (Cell cell : snake) {
            cell.paint(g);
        }
    }

}
