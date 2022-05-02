package testproject.Lesson7;

public class Cat {
    //appetit kota. skolko za raz kot mozhet sest kot edi
    private int appetite;
    private int voluemToDrink; // skolo piet
    private String name;

    // sozdaem costructor
    public Cat( String name, int appetite){
        this.appetite = appetite;
        this.name = name;
    }

    public void eat(Plate plate){ // TAREKA IZ KOTOROJ NUZHNO UMENSHIT EDU
        //plate.setFoodCount(plate.getFoodCount()- appetite );
        plate.decresseFood(appetite); // v argumet metoda peredaem appetite
    }

    // sozdat metod drink

    public void drink(Plate plate) {// metod skolko piet
        plate.decresseFood(voluemToDrink);
    }

    // get i set
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public int getAppetite() {
        return appetite;
    }
// kota nauchit kushat

    //ili v class plate//

    //get i set dlya 2kota

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //get i set

    public int getVoluemToDrink() {
        return voluemToDrink;
    }

    public void setVoluemToDrink(int voluemToDrink) {
        this.voluemToDrink = voluemToDrink;
    }
}
