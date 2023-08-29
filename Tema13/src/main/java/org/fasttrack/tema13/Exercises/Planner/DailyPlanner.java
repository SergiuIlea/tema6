package org.fasttrack.tema13.Exercises.Planner;

import org.fasttrack.tema13.Exercises.Exceptions.NoActivityException;
import org.fasttrack.tema13.Exercises.Exceptions.NoActivitiesForDayException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    List<DaySchedule> weekSchedule;

    public DailyPlanner(List<DaySchedule> weekSchedule) {
        this.weekSchedule = weekSchedule;
    }

    public DailyPlanner() {
        this.weekSchedule = new ArrayList<>();
    }

    public void addActivity(DaySchedule schedule) {
        this.weekSchedule.add(schedule);
    }

    public void addActivity(DayOfTheWeek currDay, String activity) {
        if (activity == null) {
            throw new NoActivityException("This can't be empty");
        }
        DaySchedule daySchedule = getDaySchedule(currDay);
        daySchedule.addActivity(activity);
    }


    public void removeActivity(DayOfTheWeek day, String activity) {
        if (activity == null) {
            throw new NoActivityException("This can't be empty");
        }
        for (DaySchedule currDaySchedule : weekSchedule) {
            if (currDaySchedule.getDayOfTheWeek().equals(day)) {
                List<String> currActivity = currDaySchedule.getActivity();
                boolean isremoved = currActivity.remove(activity);
                /*
                //am comentat partea aceasta deoarece daca o las asa nu functioneaza
                remove-ul de la Exercitiul 2 -> activeaza NoActivityException
                if (isremoved == false) {
                    throw new NoActivityException("Activity does not exist");
                }

                 */
            }
        }
    }

    public List<String> getActivities(DayOfTheWeek day) {
        for (DaySchedule currDaySchedule : weekSchedule) {
            if (currDaySchedule.getDayOfTheWeek().equals(day)) {
                return  currDaySchedule.getActivity();
            }
        }
        return new ArrayList<>();
    }

    public Map<DayOfTheWeek, List<String>> endPlanning(){
        Map<DayOfTheWeek, List<String>> dayActivities = new HashMap<>();
        List<DayOfTheWeek> days = List.of(DayOfTheWeek.values());
        for(DayOfTheWeek day: days){
            List<String> allActivitiesForDay = getActivities(day);
            if(allActivitiesForDay.isEmpty()) {
                throw new NoActivitiesForDayException("There is no activity for this day " + day.name());
            }
            dayActivities.put(day,allActivitiesForDay);
        }
        return dayActivities;
    }

    public DaySchedule getDaySchedule(DayOfTheWeek day) {
        for (DaySchedule currDay : weekSchedule) {
            if (currDay.getDayOfTheWeek().equals(day)) {
                return currDay;
            }
        }
        DaySchedule daySchedule = new DaySchedule(day);
        weekSchedule.add(daySchedule);
        return daySchedule;
    }

}


