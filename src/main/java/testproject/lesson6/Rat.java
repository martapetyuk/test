package testproject.lesson6;

public class Rat extends Animal{

    public Rat (String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("PiPi");
    }
}
