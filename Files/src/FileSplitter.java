import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;

public class FileSplitter {

    public static void splitFile(File f, int splits) throws IOException {
        String parent = f.getParent();

        try (FileInputStream iStream = new FileInputStream(f)) {
            int bytesToRead = iStream.available() / splits;

            for (int i = 1; i <= splits; i++) {
                if (i == splits) {
                    bytesToRead = iStream.available();
                }

                byte[] transfer = iStream.readNBytes(bytesToRead);

                FileOutputStream oStream = new FileOutputStream(parent + "/" + i + "_" + f.getName());
                oStream.write(transfer);

                // iStream.skip(bytesToRead);
                oStream.close();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}