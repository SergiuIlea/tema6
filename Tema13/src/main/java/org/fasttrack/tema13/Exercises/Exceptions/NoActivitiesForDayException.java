package org.fasttrack.tema13.Exercises.Exceptions;

public class NoActivitiesForDayException extends RuntimeException{
    public NoActivitiesForDayException(String message){
        super(message);
    }
}
