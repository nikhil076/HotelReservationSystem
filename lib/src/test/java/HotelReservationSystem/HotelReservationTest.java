package HotelReservationSystem;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	
	@Test
	public void ifValuesEnteredInHotelReservationSystem_ShoulReturnTrue()
	{
		HotelReservationService hotelReservationService = new HotelReservationService();
		boolean isValidHotel1 = hotelReservationService.addHotel("Lakewood", 3, 110, 80, 90, 80);
		Assert.assertTrue(isValidHotel1);
		boolean isValidHotel2 = hotelReservationService.addHotel("Bridgewood", 4, 160, 110, 60, 50);
		Assert.assertTrue(isValidHotel2);
		boolean isValidHotel3 = hotelReservationService.addHotel("Ridgewood", 5, 220, 100, 150, 40);
		Assert.assertTrue(isValidHotel3);
	}
	
	@Test
	public void ifDatesEntered_ShouldReturnCheapestHotel()
	{
		HotelReservationService hotelReservationService = new HotelReservationService();
		hotelReservationService.addCustomer(1, "2021-07-15", "2021-07-16");
		String result = hotelReservationService.getCheapestHotel(1,"15-07-2021","19-07-2021");
		assertEquals("Lakewood", result);
	}
}