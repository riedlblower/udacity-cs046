// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        int days;
        int weekday;
        Day birthday = new Day(1989, 7, 1);

        // January 1, 1900 was a Monday
        Day reference_day = new Day(1900,1,1);
        
        days = birthday.daysFrom(reference_day);
        days = days + 1;
        weekday = days % 7;
        
        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
