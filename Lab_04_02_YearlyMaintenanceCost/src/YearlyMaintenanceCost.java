public class YearlyMaintenanceCost {

    public static void main(String[] args)
    {
        double springMaintenanceCost = 600.50;
        double winterMaintenanceCost = 645.05;
        double summerMaintenanceCost = 598.60;
        double fallMaintenanceCost = 545.65;
        double yearlyMaintenanceCost;

        yearlyMaintenanceCost = springMaintenanceCost + winterMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost;
        System.out.println("The spring maintenance cost is " + springMaintenanceCost);
        System.out.println("The winter maintenance cost is " + winterMaintenanceCost);
        System.out.println("The summer maintenance cost is " + summerMaintenanceCost);
        System.out.println("The fall maintenance cost is " + fallMaintenanceCost);
        System.out.println("The total yearly maintenance cost is " + yearlyMaintenanceCost);
    }
}
