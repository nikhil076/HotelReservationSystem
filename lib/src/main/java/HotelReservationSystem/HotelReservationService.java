package HotelReservationSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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

	// to add customer details
	public void addCustomer(int customerType, String startDate, String endDate) {
		customer.setCustomerType(customerType);
		customer.setStartDate(startDate);
		customer.setEndDate(endDate);

		customerTypeList.put(customerType, customer);
	}

	// type = 1 (Regular)
	public String getCheapestHotel(int customerType, String startDate, String endDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		LocalDate dateBefore = LocalDate.parse(customerTypeList.get(customerType).getStartDate());
		LocalDate dateAfter = LocalDate.parse(customerTypeList.get(customerType).getEndDate());
		Map<String, Long> hotelPrices = new HashMap<String, Long>();
		long totalPrice = 0;
		Date d1 = null, d2 = null;
		try {
			d1 = dateFormat.parse(startDate);
			d2 = dateFormat.parse(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar startCal = Calendar.getInstance();
		startCal.setTime(d1);
		Calendar endCal = Calendar.getInstance();
		endCal.setTime(d2);
		LocalDate date1 = dateBefore;
		if (customerType == 1) 
		{
			for (Map.Entry<String, Hotels> set : hotelList.entrySet()) 
			{
				String temp = set.getKey();
				dateBefore = date1;
				totalPrice = 0;
				do 
				{
					if (DayOfWeek.of(dateBefore.get(ChronoField.DAY_OF_WEEK)) == DayOfWeek.SATURDAY
							|| DayOfWeek.of(dateBefore.get(ChronoField.DAY_OF_WEEK)) == DayOfWeek.SUNDAY) 
					{
						totalPrice += hotelList.get(temp).getWeekendRegularCustomerPrice();
					} else 
					{
						totalPrice += hotelList.get(set.getKey()).getWeekdayRegularCustomerPrice();
					}
					dateBefore = dateBefore.plusDays(1);
				} while (dateBefore.compareTo(dateAfter) == 0 || dateBefore.isBefore(dateAfter));
				hotelPrices.put(set.getKey(), totalPrice);
			}
		}
		System.out.println(hotelPrices);
		String keyWithMinValue = Collections.min(hotelPrices.entrySet(), Entry.comparingByValue()).getKey();
		System.out.println("Cheapest hotel is " + keyWithMinValue + " with price " + hotelPrices.get(keyWithMinValue));
		return keyWithMinValue;
	}
	public boolean addAllWeekdayAndWeekendRatesOfHotel()
	{
		System.out.println(hotelList);
		return true;
	}
}