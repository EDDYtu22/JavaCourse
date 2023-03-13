

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesTest {
    public static void main(String[] args) {
      
        try {
            FileInputStream test = new FileInputStream("errors.txt");
            System.out.println((char)test.read());
            
            System.out.println((char)test.read());

            System.out.println(test.available());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    


        try{
            System.out.println(getFileSizeInBytes("errors.txt")); 
        } catch (IOException e){
            System.out.println("File not found!");
        }
    }

    public static long getFileSizeInBytes(String path) throws IOException {
        return Files.size(Path.of(path));
    }

   
}
