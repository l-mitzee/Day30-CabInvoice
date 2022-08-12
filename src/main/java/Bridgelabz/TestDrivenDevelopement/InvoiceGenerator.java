package Bridgelabz.TestDrivenDevelopement;

public class InvoiceGenerator {

	private static final int Cost_Per_Time = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10;
	private static final double MINIMUM_FARE = 5;
	
	public double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * Cost_Per_Time;
		return Math.max(totalFare, MINIMUM_FARE);
//		if(totalFare<MINIMUM_FARE)
//			return MINIMUM_FARE;
//		return totalFare;		
	}
	
//	public double calculateFare(Ride[] rides) {
//		double totalFare = 0; 
//		for(Ride ride:rides) {
//			totalFare +=this.calculateFare(ride.distance, ride.time);
//			
//		}
//		return totalFare;
//	}
	
	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0; 
		for(Ride ride:rides) {
			totalFare +=this.calculateFare(ride.distance, ride.time);
			
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
}
