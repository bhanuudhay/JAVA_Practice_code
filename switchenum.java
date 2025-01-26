import java.util.Scanner;

enum Days {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}

public class switchenum {
    public static void main(String[] args) {
        Days day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week (in lowercase): ");
        String input = scanner.nextLine();

        // Convert the String input to an enum value
        day = Days.valueOf(input);

        switch (day) {
            case Sunday:
                System.out.println("Today is Sunday");
                break;
            case Monday:
                System.out.println("Today is Monday");
                break;
            case Tuesday:
                System.out.println("Today is Tuesday");
                break;
            case Wednesday:
                System.out.println("Today is Wednesday");
                break;
            case Thursday:
                System.out.println("Today is Thursday");
                break;
            case Friday:
                System.out.println("Today is Friday");
                break;
            case Saturday:
                System.out.println("Today is Saturday");
                break;
        }
    }
}