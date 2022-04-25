package testproject.lesson6;
//@override анатация
public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Boris", "Rizhij", 2);
        Dog dog = new Dog("Sharik", "Korichnevij", 3);
        Horse horse = new Horse("Konek", "Pegaya", 10);
        Rat rat = new Rat("Kriska", "grey", 1);

        // dopustim proshel gog. dobavit odin god
        cat.setAge(cat.getAge() +1);
        dog.setAge(dog.getAge() +1);
        horse.setAge(horse.getAge() +1);
        rat.setAge(rat.getAge() +1);

        // raspechatot
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(horse.toString());
        System.out.println(rat.toString());

        // voice
        cat.voice();
        dog.voice();
        horse.voice(); // tak kak net v klasse konkretnogo parametra, zadast iz roditelskogo
        rat.voice();

        //tolko dlya kota tak kak zadani parametri
        cat.setSwimmingSpead(25);

        // swim
        cat.swim();
        dog.swim();
        horse.swim();
        //rat.swimm();

        //horse
        System.out.println(horse.isPurebred());

    }
}
