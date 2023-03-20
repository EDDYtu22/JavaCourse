package Exeptions.src;

import java.util.UUID;

public class InvalidPersonDataException extends RuntimeException{

    private final String additionalData;
    private final String id;

    public InvalidPersonDataException(String message, String additionalData){
        super(message);
        this.additionalData = additionalData;
        this.id = UUID.randomUUID().toString();
    }

    public String getAdditionalData() {
        return super.getMessage() + ": " + additionalData;
    }

    public String getId() {
        return id;
    }
    

    
}
