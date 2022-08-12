package Bridgelabz.TestDrivenDevelopement;

import org.junit.Test;

import junit.framework.Assert;

public class InvoiceServiceTest {
	
	@Test
	public void givenDistanceTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time =5;
		double Fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25.0, Fare);
	}
	
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time =1;
		double Fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5.0, Fare);
	}
	
//	@Test
//	public void givenMultipleRIdes_ShouldReturnTotalFare() {
//		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
//		Ride[] rides = { new Ride(2.0 , 5),
//						new Ride(0.1, 1)
//		};
//		double fare = invoiceGenerator.calculateFare(rides);
//		Assert.assertEquals(30.0, fare);
//		
//	}
	
	@Test
	public void givenMultipleRIdes_ShouldReturnTnvoiceSummary() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0 , 5),
						new Ride(0.1, 1)
		};
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
		Assert.assertEquals(expectedInvoiceSummary, summary);
		
	}

}
