public class AverageSpeedInKilometers {
    public static void main(String [] args)   {

        /* The task will be done in two steps
        1) calculation of the essential variables
        2) Printing out the result
         */

        // 1) Calculation the essential variables

        double speed = (24 * 1.6) / ((40./60) + (35/60.)); // Declaring and assigning the speed variable by calculation

        // 2) Printing out the result

        System.out.printf(
                "The average speed of the runner is: " +
                "%.2f", speed
        );
        System.out.print("km/Hour");
    }
}
