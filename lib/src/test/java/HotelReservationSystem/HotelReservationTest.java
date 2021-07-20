package HotelReservationSystem;

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
}