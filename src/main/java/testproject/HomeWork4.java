package testproject;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    //Создание игрового поля
    public static char[][] map; // создать массив. Создание игрового поля
    public static final int SIZE = 5; // задать размер
    public static final int DOTS_TO_WIN = 4; // указать кол-во фишек для победы
//Ячейки поля
    public static final char DOT_EMPTY = '*'; // пустая ячейка
    public static final char DOT_X = 'X'; //  задать значение. ячейка х
    public static final char DOT_O = 'O'; // задать константу. ячека о
    public static Scanner sc = new Scanner(System.in); // создать сканер  для считывания данных из консоли
    public static Random rand = new Random();

    //Тест программы
    public static void main(String[] args) {
        initMap();
        printMap();

        // Основной игровой цикл
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Игра закончена");
    }
    // Проверка победы
    public static boolean checkWin ( char symb ) {
        int diag1, diag2, hor, ver; // задать новые параметры
        for (int i = 0; i < SIZE; i++) {
            hor = 0; ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    hor++;
                }
                if (map[j][i] == symb) {
                    ver++;
                }
            }
            if (hor == SIZE|| ver == SIZE) {
                return true; //проверка по горизонтали и вертикали
            }
        }
        diag1 = 0; diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symb) {
                diag1++;
            }
            if (map[i][SIZE - i - 1] == symb) {
                diag2++;
            }
        }
        if (diag1 == SIZE || diag2 == SIZE) {
            return true; //проверка по диагоналям
        }
        return false;
    }

       /* if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return
                true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return
                true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return
                true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return
                true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return
                true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return
        true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return
                true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return
                true;
        return false;
    }*/

    public static boolean isMapFull () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    // Ход компьютера
    // Для реализации хода компьютера достаточно чуть изменить метод хода игрока,
    //добавив туда генератор случайных чисел

    public static boolean aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE); // возвращает случайное число в диапазоне от 0 до n – 1 включительно
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
        return false;
    }
    // Ход человека

    public static void humanTurn() {
        int x, y; //
        do {
            System.out.println("Введите значения в формате X Y"); // перед ходом игрока вывести сообщение о запросе координат
            x = sc.nextInt() - 1; // запросить координаты и уменьшить кординаты на -1. так как массив 0-2
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // проверить можно ли поставить значение в указ. ячейку
        map[y][x] = DOT_X; // если ячейка свободна, поставить крестик
    }
    //Проверка ячеек
    // Метод isCellValid() проверяет возможность установки фишки в указанную ячейку
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false; // указать если введение неверные данные вернуть ошибку
        if (map[y][x] == DOT_EMPTY) return true; // в остальных случаях - – true.
        return false;
    }
//Инициация поля
    public static void initMap() { // пронумеровать строки и столбцы
        map = new char[SIZE][SIZE]; // параметры поля с заданным параметром
        for (int i = 0; i < SIZE; i++) { // первый цикл для строк
            for ( int j = 0; j < SIZE; j++) { // второй цикл для столбцов
                map[i][j] = DOT_EMPTY; // заполнение происходит за счет двойного цикла, который пробегает по всем ячекам массива и в каждую ячейку записывает символ DOT_EMPTY

            }
        }
    }
    //Вывод поля в консоль
    public static void printMap() {
        for (int i = 0; i <=SIZE; i++ ) { // первый цикл. Отвечает за распечатку шапки игр поля
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {  //цикл отвечает за печать одной строки, после того как одна строка отпечаталась в консоль (закончился цикл j. происходит перевод на след. строки методом  System.out.println()
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }
