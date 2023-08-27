public class LengthConversions {
    public static void main(String[] args) {
		
		//declare variable
        double feet;
        double meter;
		
		//declare strings
        String header1 = "Feet";
        String header2 = "Meters";
		
		//header display
        System.out.printf("%-10s%10s | %-15s%-12s\n",
                header1, header2, header2, header1);
        System.out.println
                ("----------------------------------------------");

        for (feet = 1, meter = 20; feet <= 10; feet++, meter = meter + 5) {
            System.out.printf("%-10.1f%-10.3f | %-15.1f%-12.3f\n", feet, footToMeter(feet), meter, meterToFoot(meter));
        }
    }
//end of main

    private static double meterToFoot(double meter) {
		//return feet
        return meter * 3.281;
    }

    private static double footToMeter(double foot) {
		//return meter
        return 0.305 * foot;
    }
}
//end of class
