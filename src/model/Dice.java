package model;

public class Dice {

    private int max;

    public int roll(){
        return ((int)(Math.random()) % max)+1;
    }

}
