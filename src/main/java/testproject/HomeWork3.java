package testproject;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        Number1();
        Number2();
        Number3();
        Number4();
        Number5();
    }

    public static void Number1() {

        int[] arr = {1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                arr[i] = 1;
            } else {
                if (arr[i] >= 1) {
                    arr[i] = 0;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
    public static void Number2(){
        int[] arr = new int[100];
        for (int x =0; x < arr.length; x++){
            arr[x] = x;
            System.out.println(x);
        }
    }
    public static void Number3(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < 6) {
                arr[a] = a * 2;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
    public static void Number4(){
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++) { //строка
            for (int j = 0; j <  table[i].length; j++) { // столбец
                table [0][0] = 1;
                table [1][1] = 1;
                table [2][2] = 1;
                System.out.println(table[i][j]);
            }
            System.out.println();
        }


    }
    public static void Number5(){
 int [] len = new int[10]; // аргумент len. Задать длину
 for (int initialValue = 0; initialValue < len.length; initialValue++){ // задать цикл
     len[initialValue] = 3; // значение 3 равно длине всего массива
 }
        System.out.println(Arrays.toString(len));
    }
}





