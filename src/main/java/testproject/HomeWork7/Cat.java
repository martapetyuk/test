package testproject.HomeWork7;

public class Cat {
    private String name;
    private int apetaite;
    private int satiety;
    private int satietyTime;


    public Cat(int apetaite, String name) {
        this.name = name;
        this.apetaite = apetaite;
        this.satiety = 0;
        this.satietyTime = satietyTime;



    }

    public void eat(Plate plate) {
        plate.decreaseFood(apetaite);
        satiety +=satietyTime;
    }


    public int getApetaite() {
        return apetaite;
    }

    public void setApetaite() {
        this.apetaite = apetaite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApetaite(int apetaite) {
        this.apetaite = apetaite;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getSatietyTime() {
        return satietyTime;
    }

    public void setSatietyTime(int satietyTime) {
        this.satietyTime = satietyTime;
    }
}



