// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        


        // Please do not change the name of this variable
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900
        Day birthday = new Day(1989, 7, 1);
        Day date = new Day(1900,1,1);
        int weekday = (date.daysFrom(birthday))%7-1; //reduces 1 to make the count start from sunday
        if (weekday<0){ //becomes negative if the testcase is after the given date
            weekday*=-1;
        }
        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday

        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
