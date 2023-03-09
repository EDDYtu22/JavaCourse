package DesignPatterns.src;

public class Mozarella extends PizzaDecorator {

    private Pizza pizza;
    
    public Mozarella(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mozarella";
    }
     public Float getCost(){
        return pizza.getCost() + 2.0f;
     }
}
