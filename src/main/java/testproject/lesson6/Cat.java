package testproject.lesson6;
//с помощью методов
// с помощью полей храним данные про данный обьект
// создан новый пакет, где создано два новыйх класса кат и дог


public class Cat extends Animal { // наследование от extends Animal
    private int swimmingSpead;

// alt+insert =  get &set
public Cat(String name, String color, int age) {
    super(name, color, age);
}
// dobatit swimmingSpead
    public Cat(String name, String color, int age, int swimmingSpead){
        super(name,color,age);
        this.swimmingSpead = swimmingSpead;
    }
// dobavit get i set dlya getSwimmingSpead
    public int getSwimmingSpead() {
        return swimmingSpead;
    }

    public void setSwimmingSpead(int swimmingSpead) {
        this.swimmingSpead = swimmingSpead;
    }

    public void voice(){ // свойственно только данному классу
        System.out.println("Mya");
    }
public void swim(){
        System.out.println("Kot plivet so skorostiyu" + swimmingSpead);
}


}
