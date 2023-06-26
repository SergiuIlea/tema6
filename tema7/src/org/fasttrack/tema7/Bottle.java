package org.fasttrack.tema7;
import java.util.Scanner;

public class Bottle {
    public int capacity;
    public int availableLiquid;
    public boolean open;
    public Bottle(int capacitate, int lichidDisponibil, boolean deschis){
        capacity = capacitate;
        availableLiquid = lichidDisponibil;
        open = deschis;
    }
    public boolean maxAvailability(){
        if(availableLiquid==capacity){
            return true;
        }
        else return false;
    }
    public int getAvailableLiquid(){
        return availableLiquid;
    }
    public int getEmptyCapaccity(){
        int emptyCapacity = capacity - availableLiquid;
        return emptyCapacity;
    }
    public String openBottle(){
        if(open==false){
            open = true;
            return "Bottle is opened";
        }
        else {
            return "The bottle is already opened";
        }
    }
    public String closeBottle(){
        if(open==true){
            open = false;
            return "Bottle is closed";
        }
        else {
            return "The bottle is already closed";
        }
    }
    public boolean isOpen(){
        if(open==true){
            return true;
        }
        else return false;
    }
    public static Scanner scanner = new Scanner(System.in);
    public String drink() {
        System.out.print("Please state how much watter you want to drink: ");
        int drankLiquid = scanner.nextInt();
        int newAvailableLiquid = availableLiquid - drankLiquid;
        if (isOpen() != true) {
            System.out.println("You cannot drink from a closed bottle. Please open it first");
            return "";
        }
        if (drankLiquid > availableLiquid) {
            System.out.println("You cannot drink this much liquid, only " + availableLiquid);
            return "";
        }

        return "You drank " + drankLiquid + " mL and there are " + newAvailableLiquid + " mL left";
    }
}
