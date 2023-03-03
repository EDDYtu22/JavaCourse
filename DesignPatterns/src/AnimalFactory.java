package DesignPatterns.src;

public class AnimalFactory {

    public Animal getAnimal(String request) {
        if (request.equalsIgnoreCase("Kuche")) {
            return new Dog();
        } else if (request.equalsIgnoreCase("Kotka")) {
            return new Cat();
        }
        return null;
    }
}
