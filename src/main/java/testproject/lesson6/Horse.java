package testproject.lesson6;
// НАСЛЕДОВАНИЕ. дочерний класс

public class Horse extends Animal {


 private boolean purebred = true;

    public boolean isPurebred() {
        return purebred;
    }

    public void setPurebred(boolean purebred) {
        this.purebred = purebred;
    }

    public Horse(String name, String color, int age) {
        super(name, color, age);
    }
    public void swim(){
        System.out.println("Horse plivet");

    }
    // putoe znachenie tak kak obiyavlen obstraktnij metod
     public void voice(){
     }
}
