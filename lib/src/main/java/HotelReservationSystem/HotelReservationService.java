package HotelReservationSystem;

import java.util.HashMap;
import java.util.Map;

public class HotelReservationService 
{

	Map<String, Hotels> hotelList = new HashMap<String, Hotels>();
	Hotels hotels;
	Map<Integer, CustomerType> customerTypeList = new HashMap<Integer, CustomerType>();
	CustomerType customer = new CustomerType();
	
	//To add hotel to the System
	public boolean addHotel(String hotelName,int rating, double weekdayRateRegular, double weekdayRateReward, double weekendRateRegular, double weekendRateReward)
	{
		hotels = new Hotels();
		hotels.setHotelName(hotelName);
		hotels.setRating(rating);
		hotels.setWeekdayRegularCustomerPrice(weekdayRateRegular);
		hotels.setWeekdayRewardCustomerPrice(weekdayRateReward);
		hotels.setWeekendRegularCustomerPrice(weekendRateRegular);
		hotels.setWeekendRewardCustomerPrice(weekendRateReward);
		
		hotelList.put(hotelName, hotels);
		return true;
	}
	//to add customer details
	public void addCustomer(int customerType,String startDate,String endDate)
	{
		customer.setCustomerType(customerType);
		customer.setStartDate(startDate);
		customer.setEndDate(endDate);
		
		customerTypeList.put(customerType, customer);
	}	
}