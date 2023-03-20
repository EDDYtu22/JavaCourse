import java.io.File;
import java.nio.file.Path;
import java.util.Date;

public class App {
    public static void main(String[] args) {


        
        //File fileToSplit = new File("/Users/edko/Main/JavaCourse/Files/src/IMG_2171.jpeg");

        // File[] dir = {
        //         new File("/Users/edko/Main/JavaCourse/Files/src/IMG_2171.jpeg_031"),
        //         new File("/Users/edko/Main/JavaCourse/Files/src/IMG_2171.jpeg_033"),                
        //         new File("/Users/edko/Main/JavaCourse/Files/src/IMG_2171.jpeg_033"),                

        // };

        // try {
        //     FileAppender.appendFiles(dir, "jpeg");
        // } catch (Exception e) {
        //     System.out.println("IOException!");
        // }

        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt"));

        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt_1"));
        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt_2"));
        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt_3"));
        // System.out.println(FilesTest.getFileSizeInBytes("/Users/edko/Main/JavaCourse/errors.txt_4"));

        //File test = new File("/Users/edko/Main/JavaCourse/Exerscise_Lab_2/src/BoxContainer.java");
        // long lm = test.lastModified();
        // Date date = new Date(lm);
        //System.out.println(test.lastModified());
        File test = new File("/Users/edko/Main/JavaCourse/Files/src/70014687318__EB2743CB-F743-43FB-BDF5-97C09C988396.jpeg");
        

        FileUtils.printFirstLine(test);
        
        // FileUtils.renameFile(test, "vrushtamegopak");
        //System.out.println(FileUtils.deleteFile(test));

        //System.out.println(test.getName());
        //  System.out.println(FileUtils.getExtension(test));

    }
}
