package testproject.Lesson7;

public class Main {
    public static void main(String[] args){
        // sozdat kota
        Cat cat = new Cat("Boris", 10);
        Plate plate = new Plate(100);

        plate.info();
        cat.eat(plate);
        plate.info();

// sozdat esho odno kota
        Cat cat2  = new Cat("Tomas", 15);
        cat2.setVoluemToDrink(20);
        cat2.eat(plate); // el iz toj zhe tarelki shto i pervij kot
        cat2.drink(plate);



        plate.info();

        // skolko ostalos edi dlya 1 kota
        int count = plate.getFoodCount()/ cat.getAppetite();//
        int count2 = plate.getFoodCount()/ cat2.getAppetite();

        System.out.println("Kolichestvo kormlenij dlya" + cat.getName() + "=" + count);
        System.out.println("Kolichestvo kormlenij dlya" + cat2.getName() + "=" + count2);

    }
}
