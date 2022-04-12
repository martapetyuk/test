package testproject;
public class Lesson2<a, operator> {
    public static void main(String[] args) {
        ExampleFor();
        ExampleSwitch();
        InfrontCirle();
        FewValues();
        EndlessCycle();
        NestedCycle();
        CodeBlock();
        PractisPlus();
    }
    public static void ExampleSwitch() {
        int a =3;
        switch (a) {
            case 1:
                System.out.println("a=1");
                break;
            case 3:
                System.out.println("a=3");
                break;
            default:
                System.out.println("Ни один Case не сработал");
    }
}
public static void ExampleFor() {
for (int i= 0; i< 5; i++){
    System.out.println( "i= " + i);
}
System.out.println("end");
        }
public static void InfrontCirle() {
    int x; // объявление управляющей переменной вынесено до начала цикла
    for (x = 10; x >= 0; x -= 5) { // Шаг -5
        System.out.println(x + "");
    }
}
public static void FewValues() {
    for (int i = 0, j = 10; i < j; i++, j--) {
        System.out.println("i-j: " + i + "-" + j);
    }
}
public static void EndlessCycle(){
        for (int i = 0; i < 10; i++){
            if (i > 3) {
                break;
            }
            System.out.println("i = " + i);
        }
}
public static void NestedCycle(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.println(" " + i + j);
            }
        }
}
public static void CodeBlock(){ // Кодовый блок метода
int a = 0, b = 10, c = 0; // эта переменная доступна для всего кода в методе
if (a != 0) { // Кодовый блок тела if
    System.out.println("a не равно нулю");
    c = b / a;
    System.out.println("b / a равно " + c);
 } else {
    System.out.println("a = 0. Делить на 0 нельзя");
}
}
public static void PractisPlus() {
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            if (i == 0 || i == 5 || j == 5) {
                System.out.println("0");
            } else {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
    }

       // char operator = '+'; //вывести оператор//
        //switch (operator) {
       // case  '+':
              //  System.out.println ("Сумма ровна"+ sum(a= 2, b = 3));//вывксти суссу,,
              //  break;
           // case '-':
             //   System.out.println(min(a = 2, b = 3));
              //  break;
           // case '*':
           //     System.out.println(mult(a = 2, b = 3));
          //      break;
          //  case '/':
          //      System.out.println(devide(a = 2, b = 3));
          //      break;
          //  default:
           //     printNum(a = 5);
           //     break;


       // private static void printNum(){
            //for (int i =1; i <= 100; i++){
             //   System.out.println(i);
       //     }


  // private static int sum(int a, int b){ // public можно указать//
 // return a+b; // сложение//
  //  }
 // private static int min(int a, int b){ //public можно указать//
   //  return a-b; //вычитание//
   //      }

  //private static int mult(int a, int b){ //public можно указать//
   //    return a * b; //умножение//
   // }
  // private static int devide(int a, int b){ //public можно указать//
    //     return a /b; //деление//
   // }
  // static void printNum(int a){
  //      System.out.println(a); // возвращать ничего не будет voide//
  //  }

    public static int sum (int a, int b) { // возвращаем сумму чисел
        return a+ b;
    }
 public static void printSomeText() { // метод ничего не возвращает, не требует входных данных
        System.out.println("Hello");
 }
 public static void printMyText (String txtToPrint){ // метод ничего не возвращает, принимает на вход строку
        System.out.println(txtToPrint);
 }
}




