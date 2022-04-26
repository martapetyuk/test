package testproject.HomeWork6;

public class Main {
    public static void main(String[]args) {
        Cat cat = new Cat("200", "10");
        Dog dog = new Dog("500", "20");

        cat.swim();
        dog.swim();

        cat.run();
        dog.run();


        cat.setRunDistance(20);
        cat.setSwimDistance(0);
        dog.setRunDistance(500);
        dog.setSwimDistance(200);


        System.out.println(cat.toString());
        System.out.println(dog.toString());


    }


}
