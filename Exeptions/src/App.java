package Exeptions.src;

public class App {
    
    public static void main(String[] args) {
       
        try {
            Person p = new Person("edo", 10);
        } catch (InvalidPersonDataException e) {
            System.out.println(e.getAdditionalData());
        }

        

            

    }

}
