package testproject.lesson6;
// родительский класс
// Если обьявлен хотябы один острактный метод значит и класс должен быть
// final нельзя переопределять этот метод в наследниках
// 1. инкапсуляция. 2. наследование 3. метофармизм
public abstract class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Name is " + name +"color is " + color + "age " + age;
    }
    // абстрактный метод. Если обьявлен хотябы один острактный метод значит и класс должен быть обстрактным
    public abstract void voice();

    }

