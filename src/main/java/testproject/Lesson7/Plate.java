package testproject.Lesson7;

public class Plate {
    // sozdat klass tarelki
    private int foodCount;
    // construktor kolichestvo edi v tarelke
    public Plate(int foodCount){
        this.foodCount = foodCount;
    }
    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }
    public int getFoodCount() {
        return foodCount;
    }
    // dovavit metod info chtobi uznat kolichestvo edi
    public void info(){
        System.out.println("Current Food amaount"+ foodCount);
    }

    public void decresseFood(int amount){
        foodCount -= amount; //foodCount = foodCount - amount
    }


}
