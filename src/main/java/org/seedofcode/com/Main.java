package org.seedofcode.com;


import org.seedofcode.com.enums.Day;

public class Main {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Start of the week");
                break;
            case FRIDAY:
                System.out.println("End of the week");
                break;
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Midweek");
                break;
        }
    }
}

// Output: Midweek