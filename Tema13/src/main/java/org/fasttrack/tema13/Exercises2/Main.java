package org.fasttrack.tema13.Exercises2;

import org.fasttrack.tema13.Exercises.Planner.DailyPlanner;
import org.fasttrack.tema13.Exercises.Planner.DayOfTheWeek;
import org.fasttrack.tema13.Exercises.Planner.DaySchedule;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        planner();
    }

    public static void menu(){
        System.out.println("Menu 1: ");
        System.out.println("1) add activity");
        System.out.println("2) remove an activity");
        System.out.println("3) list all activities");
        System.out.println("4) end planning");
        System.out.println("Please insert your menu option: ");
    }
    public static void planner(){
        menu();
        DaySchedule monday = new DaySchedule(DayOfTheWeek.MONDAY);
        DaySchedule tuesday = new DaySchedule(DayOfTheWeek.TUESDAY);
        DaySchedule wednesday = new DaySchedule(DayOfTheWeek.WEDNESDAY);
        DaySchedule thursday = new DaySchedule(DayOfTheWeek.THURSDAY);
        DaySchedule friday = new DaySchedule(DayOfTheWeek.FRIDAY);
        DaySchedule saturday = new DaySchedule(DayOfTheWeek.SATURDAY);
        DaySchedule sunday = new DaySchedule(DayOfTheWeek.SUNDAY);
        DailyPlanner planner = new DailyPlanner();
        String index;
        String day;
        String activity;
        Scanner scanner = new Scanner(System.in);
        index = scanner.nextLine();
        while (true){
            switch (index) {
                case "1":
                    System.out.println("day: ");
                    day = scanner.nextLine();
                    System.out.println("activity: ");
                    activity = scanner.nextLine();
                    switch (day){
                        case "MONDAY":
                            monday.addActivity(activity);
                            planner.addActivity(monday);
                            break;
                        case "TUESDAY":
                            tuesday.addActivity(activity);
                            planner.addActivity(tuesday);
                            break;
                        case "WEDNESDAY":
                            wednesday.addActivity(activity);
                            planner.addActivity(wednesday);
                            break;
                        case "THURSDAY":
                            thursday.addActivity(activity);
                            planner.addActivity(thursday);
                            break;
                        case "FRIDAY":
                            friday.addActivity(activity);
                            planner.addActivity(friday);
                            break;
                        case "SATURDAY":
                            saturday.addActivity(activity);
                            planner.addActivity(saturday);
                            break;
                        case "SUNDAY":
                            sunday.addActivity(activity);
                            planner.addActivity(sunday);
                            break;
                        default:
                            System.out.println("Insert a valid day!");
                            break;
                    }
                    menu();
                    index = scanner.nextLine();
                    break;
                case "2":
                    System.out.println("day: ");
                    day = scanner.nextLine();
                    System.out.println("activity: ");
                    activity = scanner.nextLine();
                    switch (day){
                        case "MONDAY":
                            planner.removeActivity(DayOfTheWeek.MONDAY, activity);
                            break;
                        case "TUESDAY":
                            tuesday.removeActivity(activity);
                            planner.removeActivity(DayOfTheWeek.TUESDAY, activity);
                            break;
                        case "WEDNESDAY":
                            wednesday.removeActivity(activity);
                            planner.removeActivity(DayOfTheWeek.WEDNESDAY, activity);
                            break;
                        case "THURSDAY":
                            thursday.removeActivity(activity);
                            planner.removeActivity(DayOfTheWeek.THURSDAY, activity);
                            break;
                        case "FRIDAY":
                            friday.removeActivity(activity);
                            planner.removeActivity(DayOfTheWeek.FRIDAY, activity);
                            break;
                        case "SATURDAY":
                            saturday.removeActivity(activity);
                            planner.removeActivity(DayOfTheWeek.SATURDAY, activity);
                            break;
                        case "SUNDAY":
                            sunday.removeActivity(activity);
                            planner.removeActivity(DayOfTheWeek.SUNDAY, activity);
                            break;
                    }
                    menu();
                    index = scanner.nextLine();
                    break;

                case "3":
                    List<String> mondayActivities = planner.getActivities(DayOfTheWeek.MONDAY);
                    List<String> tuesdayActivities = planner.getActivities(DayOfTheWeek.TUESDAY);
                    List<String> wednesdayActivities = planner.getActivities(DayOfTheWeek.WEDNESDAY);
                    List<String> thursdayActivities = planner.getActivities(DayOfTheWeek.THURSDAY);
                    List<String> fridayActivities = planner.getActivities(DayOfTheWeek.FRIDAY);
                    List<String> saturdayActivities = planner.getActivities(DayOfTheWeek.SATURDAY);
                    List<String> sundayActivities = planner.getActivities(DayOfTheWeek.SUNDAY);
                    System.out.println("MONDAY: " + mondayActivities);
                    System.out.println("TUESDAY: " + tuesdayActivities);
                    System.out.println("WEDNESDAY: " + wednesdayActivities);
                    System.out.println("THURSDAY: " + thursdayActivities);
                    System.out.println("FRIDAY: " + fridayActivities);
                    System.out.println("SATURDAY: " + saturdayActivities);
                    System.out.println("SUNDAY: " + sundayActivities);
                    menu();
                    index = scanner.nextLine();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Insert a valid number!");
                    menu();
                    index = scanner.nextLine();
                    break;
            }
        }
    }
}
