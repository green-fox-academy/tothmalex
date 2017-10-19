package otos;

import java.util.List;

public class LotteryFilter {

    CSVReader reader = new CSVReader(new FileReader("data.csv"), ';');
    List<String[]> lines = reader.readAll();

    CSVWriter writer = new CSVWriter(new FileWriter("copydata.csv"), ';', CSVWriter.NO_QUOTE_CHARACTER);
writer.writeAll(lines);
writer.close();
}
