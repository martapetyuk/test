package testproject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String args[]) {
        SingleLine();
        DobleLine();
        Libr();
        Rand();
        Number1();

    }

    public static void SingleLine() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
            System.out.println(arr.length); // вывести на экран длинну массива
        }
    }

    public static void DobleLine() { //двойной массив
        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) { //1й индекс строка. также можно просто указать длину i < arr.length;
            for (int j = 0; j < 4; j++) { // 2й индекс столбец.   j < arr[i].length;
                table[i][j] = counter;
                System.out.println(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void Libr() {
        String[] strArray = new String[5];
        strArray[1] = "jjdhfj";
        strArray[2] = "sad";

        for (int i = 0; i < strArray.length; i++) { // строчный формат
            //System.out.println(strArray[1]);
            Arrays.toString(strArray);
            System.out.println(Arrays.toString(strArray));

        }
    }

    public static void Rand() {
        Random random = new Random();
        int[] randomArray = new int[15];
        for (int i = 0; i < randomArray.length; i++) ;
        {
            randomArray[1] = random.nextInt(100);
        }
        //System.out.println(Arrays.toString(randomArray));

        Scanner scanner = new Scanner(System.in); // из консоли
        System.out.println("Введите количество эллементов в массиве");
        int count = scanner.nextInt();
        int[] newArray = new int[count]; //размер значение
        for (int i = 0; i < newArray.length; i++) {
            randomArray[1] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void Number1() {
        int[] arr = new int[10]; //задать масив со значениями
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));


    }
}