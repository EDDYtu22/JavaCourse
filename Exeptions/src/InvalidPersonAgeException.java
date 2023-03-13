package Exeptions.src;

public class InvalidPersonAgeException extends InvalidPersonDataException {
    
    public InvalidPersonAgeException(String message, String additionalData){
        super(message, additionalData);
    }
}
