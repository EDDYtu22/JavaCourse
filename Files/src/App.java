import java.io.File;
import java.sql.Array;
import java.util.Arrays;

import Exeptions.src.FilesTest;

public class App {
    public static void main(String[] args)  {

         File fileToSplit = new File("/Users/edko/Main/JavaCourse/Files/TxtFilesForTesting/errors.txt");

        // File[] dir = {
        //         new File("/Users/edko/Main/JavaCourse/errors.txt_1"),
        //         new File("/Users/edko/Main/JavaCourse/errors.txt_2"),
        //         new File("/Users/edko/Main/JavaCourse/errors.txt_3"),
        //         new File("/Users/edko/Main/JavaCourse/errors.txt_4"),
        //         new File("/Users/edko/Main/JavaCourse/errors.txt_5")
        // };
         
        //FileAppender.appendFiles(dir);

        try {
            FileSplitter.splitFile(fileToSplit, 4);
        } catch (Exception e) {
            System.out.println("IOException!");
        }
       

        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt"));

        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt_1"));
        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt_2"));
        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt_3"));
        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt_4"));

    }
}
