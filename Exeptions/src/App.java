package Exeptions.src;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       String names[] = {"tedi", "sa40", "Disho", "petkan", "samuil"};
        int iterations = 0;
       while(iterations < 5){
        try {
            Person p = new Person(input.nextLine(), 10);
            System.out.println("Person created with name: " + p.name);
            break;
        } catch (InvalidPersonDataException e) {
            System.out.println(e.getAdditionalData());
            if(iterations == 4) System.out.println("You reached maximum tries for creating person!");
            iterations++;
            continue;
        }
       }
       
       



        

            

    }

}
