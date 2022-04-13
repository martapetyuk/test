package testproject;

public class HomeWork2 {
    public static void main(String[] args){
        PositiveOrNegative ();
        Cycle ();
    }
    public static boolean Comparison (int a, int b){
        int sum= a + b;
        if ( sum >= 50){
            return true;
        } else {
            return false;
        }
    }
    public static void PositiveOrNegative (){
        int i = 0;
        if ( i >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean TrueOrFalse (int x){
if (x< 0){
    return true;
} else{
    return false;
}
    }
    public static void Cycle (){
        for (int z=0;z>=5; z++){
            if (z > 7 ){
                break;
            }
            System.out.println("z =" + z);
        }
    }
}
