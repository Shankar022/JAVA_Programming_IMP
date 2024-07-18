
## Basics of Enums in  Java

### 1.1 Definition and Usage
In its simplest form, an enumeration is a list of named constants that define a new data type and its legal values. 
Thus, an enumeration object can hold only a value that was declared in the list. Other values are not allowed.
```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
```
Here, Day is an enum type with seven constants: SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY.

### 1.2 Accessing Enum Constants
You can access enum constants using the dot notation. 
*Enum constants are implicitly public, static, and final.*
*Furthermore, their type is the type of the enumeration in which they are declared, which is Day in this case.*

```java
public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        // Printing the enum constant
        System.out.println(today);

        // Comparing enums constants
        if(today == Day.MONDAY) {
            System.out.println("Start of the week!");
        }else {
            System.out.println("Not Monday");
        }
    }
}
```


### 1.3 Iterating Over Enum Constants

You can use the values() method to get an array of all enum constants, which can be used for iteration.
```java
public class Main {
    public static void main(String[] args) {
       for(Day day: Day.values()) {
           System.out.println(day);
       }
    }
}
```

*Output*
```
SUNDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
```

### 1.4 Converting String to Enum Constant
You can use the valueOf(String name) method to convert a string to the corresponding enum constant. 
This method throws an *IllegalArgumentException* if the specified name does not match any enum constant,

```java
public class Main {
    public static void main(String[] args) {
        String dayName = "FRIDAY";
        Day day = Day.valueOf(dayName);

        System.out.println("Day is: " + day); //Output: Day is: FRIDAY
    }
}
```
### 1.5 Enum in Switch Statements
Enums can be used in switch statements, which makes the code more readable and maintainable.

```java
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
```