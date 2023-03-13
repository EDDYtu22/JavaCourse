import java.io.File;
import java.sql.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        File fileToSplit = new File("/Users/edko/Main/JavaCourse/Files/src/IMG_2171.jpeg");

        File[] dir = {
                new File("/Users/edko/Main/JavaCourse/Files/src/IMG_2171.jpeg_031"),
                new File("/Users/edko/Main/JavaCourse/Files/src/IMG_2171.jpeg_033"),                
                new File("/Users/edko/Main/JavaCourse/Files/src/IMG_2171.jpeg_033"),                

        };

        try {
            FileAppender.appendFiles(dir, "jpeg");
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
