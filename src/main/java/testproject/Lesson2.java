package testproject;


public class Lesson2 {
    public static void main(String[] args) {
        int a =2;
        int b =3;
        char operator = '+'; //вывести оператор//
        switch (operator) {
            case '+':
                System.out.println ("Сумма ровна"+ sum(a= 2, b = 3));//вывксти суссу,,
                break;
            case '-':
                System.out.println(min(a = 2, b = 3));
                break;
            case '*':
                System.out.println(mult(a = 2, b = 3));
                break;
            case '/':
                System.out.println(devide(a = 2, b = 3));
                break;
            default:
                printNum(a = 5);
                break;
        }
    }


       // private static void printNum(){
            //for (int i =1; i <= 100; i++){
             //   System.out.println(i);
       //     }




   private static int sum(int a, int b){ // public можно указать//
        return a+b; // сложение//
    }
   private static int min(int a, int b){ //public можно указать//
        return a-b; //вычитание//
    }
   private static int mult(int a, int b){ //public можно указать//
        return a * b; //умножение//
    }
    private static int devide(int a, int b){ //public можно указать//
        return a /b; //деление//
    }
    static void printNum(int a){
        System.out.println(a); // возвращать ничего не будет voide//
    }

}


