package testproject.HomeWork6;

public class Cat extends Animals {
    private int runDistance;
    private int swimDistance;


        public Cat(String run, String swim) {
            super(run, swim);
        }
    public Cat(String run, String swim, int runDistance, int swimDistance ) {
        super(run, swim);
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }
    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }
    public int getSwimDistance() {
        return swimDistance;
    }
    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public void run(){
        System.out.println("Кот пробежал" + runDistance);
    }
   public void swim(){
        System.out.println("Кот проплыл" + swimDistance);
    }
    }





