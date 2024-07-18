package org.seedofcode.com.enums;

public enum Day {
    SUNDAY("Weekend", 7) {
        @Override
        public String getGreeting() {
            return "Relax, it's Sunday!";
        }
    },
    MONDAY("Weekday", 1) {
        @Override
        public String getGreeting() {
            return "Back to work, it's Monday!";
        }
    },
    TUESDAY("Weekday", 2) {
        @Override
        public String getGreeting() {
            return "Keep going, it's Tuesday!";
        }
    },
    WEDNESDAY("Weekday", 3) {
        @Override
        public String getGreeting() {
            return "Halfway there, it's Wednesday!";
        }
    },
    THURSDAY("Weekday", 4) {
        @Override
        public String getGreeting() {
            return "Almost there, it's Thursday!";
        }
    },
    FRIDAY("Weekday", 5) {
        @Override
        public String getGreeting() {
            return "Finally, it's Friday!";
        }
    },
    SATURDAY("Weekend", 6) {
        @Override
        public String getGreeting() {
            return "Enjoy, it's Saturday!";
        }
    };

    private final String type;
    private final int dayNumber;

    // Constructor
    Day(String type, int dayNumber) {
        this.type = type;
        this.dayNumber = dayNumber;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Getter for day number
    public int getDayNumber() {
        return dayNumber;
    }

    // Method to check if it is weekend
    public boolean isWeekend() {
        return type.equals("Weekend");
    }

    // Method to return a friendly name for the day
    public String friendlyName() {
        return this.name();
    }

    public abstract String getGreeting();

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println("Is " + day.friendlyName() + " a weekend ? " + day.isWeekend());
            System.out.println(day.getGreeting());
            System.out.println();
        }
    }

//    Output

//    Is SUNDAY a weekend ? true
//    Relax, it's Sunday!
//
//    Is MONDAY a weekend ? false
//    Back to work, it's Monday!
//
//    Is TUESDAY a weekend ? false
//    Keep going, it's Tuesday!
//
//    Is WEDNESDAY a weekend ? false
//    Halfway there, it's Wednesday!
//
//    Is THURSDAY a weekend ? false
//    Almost there, it's Thursday!
//
//    Is FRIDAY a weekend ? false
//    Finally, it's Friday!
//
//    Is SATURDAY a weekend ? true
//    Enjoy, it's Saturday!
}