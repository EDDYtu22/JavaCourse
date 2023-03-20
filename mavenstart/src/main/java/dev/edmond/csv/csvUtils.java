package dev.edmond.csv;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import javax.tools.FileObject;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class csvUtils {
   
    public static void parseCsv(String filePath) throws IOException {
        Reader in = new FileReader(filePath);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
        for (CSVRecord record : records) {
            List<String> firstColumn = record.toList();
            for(String value: firstColumn){
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
