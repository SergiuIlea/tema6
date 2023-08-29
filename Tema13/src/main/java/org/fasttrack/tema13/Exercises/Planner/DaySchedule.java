package org.fasttrack.tema13.Exercises.Planner;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private DayOfTheWeek dayOfTheWeek;
    private List<String> activity;

    public DaySchedule(DayOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
        this.activity = new ArrayList<>();
    }

    public DaySchedule(DayOfTheWeek dayOfTheWeek, List<String> activity){
        this.dayOfTheWeek = dayOfTheWeek;
        this.activity = activity;
    }

    public DayOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public List<String> getActivity() {
        return activity;
    }

    public void setActivity(List<String> activity) {
        this.activity = activity;
    }

    public boolean addActivity(String activity){
        return this.activity.add(activity);
    }

    public boolean removeActivity(String activity){ return this.activity.remove(activity); }
}
