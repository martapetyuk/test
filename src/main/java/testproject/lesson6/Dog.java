package testproject.lesson6;
// наследование от extends Animal. дочерний класс
public class Dog extends Animal {


    public Dog(String name, String color, int age){
       super(name, color,age);
    }

    public void voice(){
        System.out.println("Gav");
    }
    public void swim(){
        System.out.println("Dog plivet");
    }

}
