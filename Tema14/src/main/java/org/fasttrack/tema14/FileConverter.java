package org.fasttrack.tema14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileConverter {
    public static List<Quote> converter(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int id = 0;
        boolean favourite = false;
        List<Quote> allQuotes = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            String[] splitLines = currentLine.split("~");
            id++;
            String name = splitLines[0];
            String quote = splitLines[1];
            Quote currentQuote = new Quote(id, name, quote, favourite);
            allQuotes.add(currentQuote);
        }
        return allQuotes;
    }
}