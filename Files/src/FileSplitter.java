import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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

    public static void splitFileInByteChunks(File file, Integer chunkSize) throws Exception {
        int currentChunkNo = 1;

        try (FileInputStream fis = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis)) {

                    byte[] buffer = new byte[chunkSize];

                    int bytesReadForChunk;

                    while((bytesReadForChunk = bis.read(buffer, 0, chunkSize))> 0){
                        String chunkFileFilename = String.format("%s_03%d", file.getAbsolutePath(), currentChunkNo++);

                        try (FileOutputStream fos = new FileOutputStream(chunkFileFilename)) {
                            fos.write(buffer);
                        } catch (Exception e) {
                            
                        }

                    }


        } catch (Exception e) {
            System.out.println("ba maamu");
        }
    }

}