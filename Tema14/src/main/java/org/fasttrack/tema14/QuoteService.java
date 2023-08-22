package org.fasttrack.tema14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class QuoteService {
    private List<Quote> quotes;
    private static Random random = new Random();

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }
    public List<String> getAllQuotes(){
        List<String> allQuotes = new ArrayList<>();
        for(Quote currentQuote: quotes){
            allQuotes.add(currentQuote.getQuote());
        }
        return allQuotes;
    }
    public List<Quote> getQuotesForAuthor(String author){
        List<Quote> quotesForAuthor = new ArrayList<>();
        for(Quote currentQuote: quotes){
            if(currentQuote.getAuthor().equals(author)){
                quotesForAuthor.add(currentQuote);
            }
        }
        return quotesForAuthor;
    }
    public List<String> getAuthors(){
        List<String> authors = new ArrayList<>();
        for (Quote currentQuote: quotes){
            if(!authors.contains(currentQuote.getAuthor())){
                authors.add(currentQuote.getAuthor());
            }
        }
        return authors;
    }
    public void setFavourites(int id){
        for(Quote currentQuote: quotes) {
            if(currentQuote.getId()==id){
                currentQuote.setFavourite(true);
            }
        }
    }

    public List<Quote> getFavourites(){
        List<Quote> favourites = new ArrayList<>();
        for(Quote currentQuote: quotes){
            if(currentQuote.isFavourite()){
                favourites.add(currentQuote);
            }
        }
        return favourites;
    }
    public String getRandomQuote(){
        int randomId = random.nextInt(quotes.size()) + 1;
        for(Quote currentQuote: quotes){
            if(currentQuote.getId()==randomId){
                return currentQuote.getQuote();
            }
        }
        return "";
    }

}
