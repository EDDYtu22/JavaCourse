package Exeptions.src;

public class MyException extends Exception{

    private String message;

    public MyException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }

    
}
