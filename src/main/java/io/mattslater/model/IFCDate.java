package io.mattslater.model;

/**
 * Created by synapserelapse on 4/15/16.
 */
public class IFCDate {
    private int date;
    private String day;
    private String month;
    private int year;



    public IFCDate(int date, int day, int month, int year) {
        if (month==6 && date==29) {
            this.month = Month.get(month-1).toString();
            this.day = "Leap Day";
        } else if (month==13 && date==29) {
            this.month = Month.get(month-1).toString();
            this.day = "Year Day";
        } else {
            this.month = Month.get(month-1).toString();
            this.day = Day.get(day-1).toString();
        }

        this.date = date;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
