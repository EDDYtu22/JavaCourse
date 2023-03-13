

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileDuplicator {

    public static void duplicateFile(String path) throws IOException{
        // try with resourses
        // buffered reader for char stream
        // writer for char stream

       try(
        BufferedReader br = new BufferedReader(new FileReader(path));
        PrintWriter pr = new PrintWriter(new FileWriter(path + "_copy", true));
       ) {
            String lineToWrite = null;

            while((lineToWrite = br.readLine()) != null){
                pr.println(lineToWrite);
                
            }
       }
    }
}
