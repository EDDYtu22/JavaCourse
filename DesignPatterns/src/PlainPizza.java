package DesignPatterns.src;

public class PlainPizza implements Pizza {
    public String getDescription(){
        return "Simple Pizza!";
    }
    public Float getCost(){
        return 5.0f;
    }
}
