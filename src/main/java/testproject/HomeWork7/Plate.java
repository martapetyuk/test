package testproject.HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n){
        food -= n;
    }

    public boolean ckeckFood(int n){
        return (food - n) >= 0;
    }

    public void increaseFood(){
        this.food +=50;
        System.out.println("Корм добавлен");
    }

    public void info (){
        System.out.println("plate " + food );
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
