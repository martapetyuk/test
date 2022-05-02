package testproject.HomeWork7;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat(4, "Murzik");
        cats[1] = new Cat(3, "Barsik");
        cats[2] = new Cat(6, "Soplik");
        Plate plate = new Plate(100);

        for (Cat i : cats) {
            if (i.getSatiety() == 0) { // кот голоден
                if (!plate.ckeckFood(i.getApetaite())) {
                    plate.increaseFood(); // если не достаточно еды. нужно добавить

                }
                i.eat(plate); // кот кушает
                System.out.println("Кот " + i.getName() + " покушал" + i.getApetaite());
            }

            plate.info();
            i.eat(plate);
            plate.info();
        }
    }
}
