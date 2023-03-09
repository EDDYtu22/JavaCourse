package Exeptions.src;

import java.io.IOException;

public class App {
    
    public static void main(String[] args) {
        try{
            if(5 > 3){
                throw new MyException("Daa taka si e 5 e po golqmo ot 3!");
            }
        
        } catch (MyException e){
            System.out.println(e.getMessage());
        }

        // try{
        //     TextFileDuplicator.duplicateFile("errors.txt");
        // } catch(IOException e){
        //     System.out.println("Can't duplicate file " + e.getMessage());
        // }

            

    }

}
