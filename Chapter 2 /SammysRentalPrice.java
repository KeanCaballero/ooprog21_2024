import java.util.Scanner;

public class SammysSeashoreSupplies {

    public static void main(String[] args) {
        sammysRentalPrice();
    }

    public static void sammysRentalPrice() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        
        System.out.print("Enter the number of minutes rented: ");
        int minutesRented = scanner.nextInt();
        
        int hours = minutesRented / 60;
        int additionalMinutes = minutesRented % 60;
        
        final int costPerHour = 40;
        final int costPerMinute = 1;
        
        double totalPrice = calculateTotalPrice(minutesRented, hours, additionalMinutes, costPerHour, costPerMinute);
        
        System.out.println("Number of Minutes: " + minutesRented);
        System.out.println("Hours: " + hours);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.println("Total price: $" + totalPrice);
    }

    public static double calculateTotalPrice(int totalMinutes, int hours, int additionalMinutes, int hourlyRate, int minuteRate) {
        if (totalMinutes <= 60) {
            return hourlyRate;
        } else {
            return (hours * hourlyRate) + (additionalMinutes * minuteRate);
        }
    }
}
