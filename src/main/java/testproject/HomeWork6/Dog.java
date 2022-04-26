package testproject.HomeWork6;

public class Dog extends Animals{
    private int runDistance;
    private int swimDistance;

        public Dog(String run, String swim) {
            super(run, swim);
    }

    public Dog(String run, String swim, int runDistance, int swimDistance) {
        super(run, swim);
        this.runDistance= runDistance;
        this.swimDistance= swimDistance;
    }

    public void run(){
        System.out.println("Собака пробежала" + runDistance);
    }
    public void swim(){
        System.out.println("Собака проплыла " + swimDistance);
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



}
