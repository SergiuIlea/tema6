package org.fasttrack.tema14;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "files/quotes.txt";
        FileConverter converter = new FileConverter();
        List<Quote> quotes = converter.converter(filePath);

        QuoteService quoteService = new QuoteService(quotes);

        //System.out.println(quoteService.getAllQuotes());
        System.out.println(quoteService.getQuotesForAuthor("Lao Tzu"));
        //System.out.println(quoteService.getAuthors());
        quoteService.setFavourites(5);
        quoteService.setFavourites(8);
        System.out.println(quoteService.getFavourites());
        System.out.println(quoteService.getRandomQuote());

    }
}