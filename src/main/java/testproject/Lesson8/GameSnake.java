package testproject.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameSnake extends JFrame { // NALEDOVANIE IZ INTERFEJSOV PAKETA JAVA
// poyavitsa okoshko prilozheniya

    // константы пишутся заглавными буквами

    private final String TITLE_OF_PROGRAM = "Classic Game Snake";
    private final String GAME_OVER_MSG ="GAME OVER";
    public final static int CELL_SIZE =20; // SIZE OF CELL IN PIX
    public final static int CANVAS_WIDTH = 30; //width in cells
    public final static int CANVAS_HEIGHT = 25; // HEIGHT IN CELLS
    public final static Color SNAKE_COLOR = Color.darkGray; //цвет скачан из java
    public final static Color FOOD_COLOR = Color.green;
    //public final static Color POISON_COLOR = Color.red;
    public final static int KEY_LEFT = 37; // codes
    public final static int KEY_UP = 38; // of
    public final static int KEY_RIGHT = 39; // CURSOR
    public final static int KEY_DOWN = 40; // keys
    public final int START_SNAKE_SIZE = 5; //initioizotion date
    public final int START_SNAKE_SIZE_X = CANVAS_WIDTH/2; //for
    public final int START_SNAKE_SIZE_Y = CANVAS_HEIGHT/2; // snake
    public final int SNAKE_DELAY =150; //задержка по времени. чтобы не летала змейка snake delay in milliseconds
    public int snakeSize = 0; // current snake size
    public static boolean gameOver = false; // o sign game is over or not

    Canvas canvas;      // canvas object for renderind (drowing)
    Snake snake;    // declare a snake object
    Food food;       // declare a food object
    // Poison poison;   // declare a poison object



public static void main (String[] args){ // starting method
    new GameSnake().game(); //create an object and call game()
}
    public GameSnake(){
    setTitle(TITLE_OF_PROGRAM);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // тобы закрыть всю программу

    canvas = new Canvas();
    canvas.setBackground(Color.white);
    canvas.setPreferredSize(new Dimension(
            CELL_SIZE +CANVAS_WIDTH,
            CELL_SIZE + CANVAS_HEIGHT));


    addKeyListener(new KeyAdapter() {
    public void KeyPressed(KeyEvent e){
    snake.setDirection(e.getKeyCode());
    }
    });



    add(canvas); // add a panel for rending
        pack(); // bringing the window to the required size нельзя менять размер
        setLocationRelativeTo(null); // the window resizing указать координаты
        setVisible(true); // make the window visible

    }


    private void game() {       // method controling game cycle
        Snake snake = new Snake(     // creating snake object
                START_SNAKE_SIZE_X,
                START_SNAKE_SIZE_Y,
                START_SNAKE_SIZE,
                KEY_RIGHT);
        food = new Food(snake); //create food object
        snake.setFood(food);

        //poison = new Poison(snake); // poison object
        //poison.setFood(food);
        //snake.setPoison(poison);
        //food.setPoison(poison);


        while (!gameOver) {  // if the snake ate the food
            snake.move();
            if (snake.size() > snakeSize) {
                snakeSize = snake.size();
                setTitle(TITLE_OF_PROGRAM + ": " + snakeSize);
            }


            if (food.isEaten()) { // snake ate the food
                food.appear(); // show food in the new place
                //   poison.add(); // add new poison point
            }

            canvas.repaint();  // repaint pannel/ window
            sleep(SNAKE_DELAY);  // to make delay in miliseconds
        }
        JOptionPane.showMessageDialog(this, GAME_OVER_MSG);
    }
        private void sleep(long ms){
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        class Canvas extends JPanel { //без public. класс внутри класса
            public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2D = (Graphics2D) g;
                g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                snake.paint(g2D);
                food.paint(g2D);
              //  poison.paint(g20);

            }
        }


}


