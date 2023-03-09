package DesignPatterns.src;

public class Peperonni extends PizzaDecorator {

    private Pizza pizza;
    
    public Peperonni(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Peperonni";
    }
     public Float getCost(){
        return pizza.getCost() + 2.0f;
     }
}