package testproject.HomeWork6;

public class Animals {
    private String run;
    private String swim;


    public Animals(String run, String swim){
        this.run = run;
        this.swim = swim;
    }

    public String getRun() {
        return run;
    }
    public void setRun(String run) {
        this.run = run;
    }
    public String getSwim() {
        return swim;
    }
    public void setSwim(String swim) {
        this.swim = swim;
    }


    public String toString(){
        return "Ограничению по плаванию"+ swim + "Ограничение по бегу" + run;
    }

}


