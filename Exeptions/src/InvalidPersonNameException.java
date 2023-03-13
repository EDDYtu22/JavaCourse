package Exeptions.src;

public class InvalidPersonNameException extends InvalidPersonDataException {
    
    public InvalidPersonNameException(String message, String additionalData){
        super(message, additionalData);
    }
}
