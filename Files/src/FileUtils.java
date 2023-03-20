import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

public abstract class FileUtils {

    public static Date getLastModified(File file) {
        Date result = new Date(file.lastModified());
        return result;
    }

    public static boolean renameFile(File file, String newName) {
        File copy = new File(file.getParent() + "/" + newName + getExtension(file));
        if (file.renameTo(copy))
            return true;
        return false;
    }

    public static void changeDir(File file, String newDir) {
        try {
            file.renameTo(new File(newDir + "/" + file.getName()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // file.delete();
    }

    public static void printFirstLine(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String out = br.readLine();
            if(out.equals("null")) {
                System.out.println("Invalid file format!");
                
            } else{
                
                System.out.println(out);
            }
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean deleteFile(File file) {
        try {
            return file.delete();
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static String getExtension(File file) {
        String result = "";
        int iterator = file.getName().length() - 1;

        while (file.getName().charAt(iterator) != '.') {
            result += file.getName().charAt(iterator);
            iterator--;
        }
        StringBuilder rev = new StringBuilder(result);
        return "." + rev.reverse().toString();
    }
}
