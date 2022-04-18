package testproject;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    Random random;
    Scanner scanner;
    char[][] table; //простой тип для символов

    Lesson4() { // метод, который называется как класс, в котором передаются входные данные
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }


    public static void main(String[] args) {
        new Lesson4().game(); //класс как название метода, через которое идет запуск игры
    }

    void game() {// из одного метода вызвать другие методы
        System.out.println("Game is started");
        initTable();
        printTable();

        while (true) {  //Бесконечный цикл, так ка не известно за сколько шагов закончится игра
            turnHuman(); //цикл хода человека
            if (checkWin('x')) {
                printTable();
                System.out.println("YOU WON!");
                break;
            }
            turnAI();// цикл хода компьютера
            printTable();
            if (checkWin('o')) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) { // цикл если все поля заполнены
                System.out.println("DRAW");
                break;
            }
        }
    }

    boolean isTableFull() {
        for (int x =0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (table[x][y] == '.') return false; // сравнить
            }
        }
        return true;
    }

    boolean checkWin(char symbol) {

       // проверить строки
        if (table[0][0] == symbol && table[0][1]== symbol && table[0][2] == symbol) return true;
        if (table[1][0] == symbol && table[1][1]== symbol && table[1][2] == symbol) return true;
        if (table[2][0] == symbol && table[2][1]== symbol && table[2][2] == symbol) return true;
        // проверить столбцы.
        if (table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol) return true;
        if (table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol) return true;
        if (table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol) return true;

        // проверить диагонали
        if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) return true;
        if (table[0][2] == symbol && table[1][1] == symbol && table[2][0] == symbol) return true;

        return false;
    }

    void turnHuman() { // ход человека
        int x, y; // обьявление 2х внутренних переменных одновременно видны только в данном методе
         do { // обьявление цикла do while
            System.out.println("Enter x y from [0..2]");// приглашение на ход
            x = scanner.nextInt(); // Считать введенные данные
            y = scanner.nextInt();
            //System.out.println(x + "," + y);
        } while (!isCellValid(x, y)); // проверка валлидации символов

        System.out.println("Enter x y from [0..2]");
        x = scanner.nextInt(); // Считать введенные данные
        y = scanner.nextInt();
        if (isCellValid(x, y)) table[x][y] ='x';
        else turnHuman();

    }

    boolean isCellValid(int x, int y) { // проверить чтобы значения были в пределать заданных чисел
        if (x<0 || y<0 || x>2 ||y>2) {
            return false;
        }
        return table[x][y] == '.'; // проверить что поле занято
    }


    void turnAI(){ // ход компьютера
        int x, y; // задать внутренние переменые, только для того метода

            x= random.nextInt(3); // рандомное число до 3х
            y = random.nextInt(3);
            if (isCellValid(x, y)) table[x][y] = 'o'; // проверка валлидации символов)

    }

    void initTable(){ //метод создать и с задать параметры игрового поля
   for (int x =0; x < 3; x++) {
       for (int y = 0; y < 3; y++) {
           table[x][y] = '.';
       }
   }
}

void printTable(){
    for(int y =0; y < 3; y++){
        for(int x = 0; x < 3; x++){
           System.out.print(table[x][y] + " ");
        }
        System.out.println();
    }
}
}
