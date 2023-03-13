import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileAppender {

    public static void appendFiles(File[] f , String format) throws IOException {
        

        try(FileOutputStream oStream = new FileOutputStream("Appended." + format)){
            
            for(int i = 0; i < f.length; i++){
                FileInputStream iStream = new FileInputStream(f[i]);
                byte[] transfer = iStream.readAllBytes();
                oStream.write(transfer);
                iStream.close();

            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
