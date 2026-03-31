import java.io.*;
import java.util.*;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
public class CSV2JSON {

	public static void main(String[] args) {
		try {
            File csvFile = new File("D:\\BT\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonHandling\\src\\main\\java\\students.csv");
            CsvMapper csvMapper = new CsvMapper();

            CsvSchema schema = CsvSchema.emptySchema().withHeader();

            MappingIterator<Map<String, String>> it = csvMapper.readerFor(Map.class)
                    .with(schema)
                    .readValues(csvFile);

            List<Map<String, String>> rows = it.readAll();

            ObjectMapper jsonMapper = new ObjectMapper();
            String jsonArray = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rows);

            System.out.println("CSV - JSON:");
            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}