package org.fasttrack.tema13.Exercises;

import org.fasttrack.tema13.Exercises.Exceptions.NoActivitiesForDayException;
import org.fasttrack.tema13.Exercises.Planner.DailyPlanner;
import org.fasttrack.tema13.Exercises.Planner.DayOfTheWeek;
import org.fasttrack.tema13.Exercises.Planner.DaySchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DaySchedule monday = new DaySchedule(DayOfTheWeek.MONDAY);
        monday.addActivity("homework");
        monday.addActivity("work");

        DaySchedule tuesday = new DaySchedule(DayOfTheWeek.TUESDAY);
        tuesday.addActivity("homework");
        tuesday.addActivity("gym");
        tuesday.addActivity("java class");

        DaySchedule wednesday = new DaySchedule(DayOfTheWeek.WEDNESDAY);
        wednesday.addActivity("gym");
        wednesday.addActivity("homework");

        DaySchedule thursday = new DaySchedule(DayOfTheWeek.THURSDAY);
        thursday.addActivity("gym");
        thursday.addActivity("work");

        DaySchedule friday = new DaySchedule(DayOfTheWeek.FRIDAY);
        friday.addActivity("homework");
        friday.addActivity("gym");
        friday.addActivity("work");

        DailyPlanner planner = new DailyPlanner();
        planner.addActivity(monday);
        planner.addActivity(tuesday);
        planner.addActivity(wednesday);
        planner.addActivity(thursday);
        planner.addActivity(friday);

        planner.addActivity(DayOfTheWeek.MONDAY, "clean rabbit cage");
        List<String> mondayActivities = planner.getActivities(DayOfTheWeek.MONDAY);
        System.out.println("Monday: " + mondayActivities);
        planner.removeActivity(DayOfTheWeek.MONDAY, "homework");
        List<String> newMondayActivities = planner.getActivities(DayOfTheWeek.MONDAY);
        System.out.println("Monday: " + newMondayActivities);

        List<String> errorMessages = new ArrayList<>();
        Map<DayOfTheWeek, List<String>> activities = new HashMap<>();
        try {
             activities = planner.endPlanning();
        }catch (NoActivitiesForDayException e){
            errorMessages.add(e.getMessage());
        }
        System.out.println("The errors are: "+ errorMessages);
        System.out.println("The days are : " + activities);


    }
}
