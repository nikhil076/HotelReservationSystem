package HotelReservationSystem;

public class Hotels 
{
	String hotelName;
	int rating;
	double weekdayRegularCustomerPrice;
	double weekdayRewardCustomerPrice;
	double weekendRegularCustomerPrice;
	double weekendRewardCustomerPrice;
	public Hotels() 
	{
		super();
	}
	public Hotels(String hotelName, int rating, double weekdayRegularCustomerPrice, double weekdayRewardCustomerPrice,
			double weekendRegularCustomerPrice, double weekendRewardCustomerPrice) 
	{
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekdayRegularCustomerPrice = weekdayRegularCustomerPrice;
		this.weekdayRewardCustomerPrice = weekdayRewardCustomerPrice;
		this.weekendRegularCustomerPrice = weekendRegularCustomerPrice;
		this.weekendRewardCustomerPrice = weekendRewardCustomerPrice;
	}
	public String getHotelName() 
	{
		return hotelName;
	}
	public void setHotelName(String hotelName) 
	{
		this.hotelName = hotelName;
	}
	public int getRating() 
	{
		return rating;
	}
	public void setRating(int rating) 
	{
		this.rating = rating;
	}
	public double getWeekdayRegularCustomerPrice() 
	{
		return weekdayRegularCustomerPrice;
	}
	public void setWeekdayRegularCustomerPrice(double weekdayRegularCustomerPrice) 
	{
		this.weekdayRegularCustomerPrice = weekdayRegularCustomerPrice;
	}
	public double getWeekdayRewardCustomerPrice() 
	{
		return weekdayRewardCustomerPrice;
	}
	public void setWeekdayRewardCustomerPrice(double weekdayRewardCustomerPrice) 
	{
		this.weekdayRewardCustomerPrice = weekdayRewardCustomerPrice;
	}
	public double getWeekendRegularCustomerPrice() 
	{
		return weekendRegularCustomerPrice;
	}
	public void setWeekendRegularCustomerPrice(double weekendRegularCustomerPrice) 
	{
		this.weekendRegularCustomerPrice = weekendRegularCustomerPrice;
	}
	public double getWeekendRewardCustomerPrice() 
	{
		return weekendRewardCustomerPrice;
	}
	public void setWeekendRewardCustomerPrice(double weekendRewardCustomerPrice) 
	{
		this.weekendRewardCustomerPrice = weekendRewardCustomerPrice;
	}
	@Override
	public String toString() 
	{
		return "Hotels [hotelName=" + hotelName + ", rating=" + rating + ", weekdayRegularCustomerPrice="
				+ weekdayRegularCustomerPrice + ", weekdayRewardCustomerPrice=" + weekdayRewardCustomerPrice
				+ ", weekendRegularCustomerPrice=" + weekendRegularCustomerPrice + ", weekendRewardCustomerPrice="
				+ weekendRewardCustomerPrice + "]";
	}
}
