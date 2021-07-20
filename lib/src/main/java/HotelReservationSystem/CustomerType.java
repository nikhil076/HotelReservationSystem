package HotelReservationSystem;

public class CustomerType 
{
	int customerType;
	String startDate;
	String endDate;
	public CustomerType()
	{
		super();
	}
	public CustomerType(int customerType, String startDate, String endDate) 
	{
		super();
		this.customerType = customerType;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getCustomerType() 
	{
		return customerType;
	}
	public void setCustomerType(int customerType) 
	{
		this.customerType = customerType;
	}
	public String getStartDate() 
	{
		return startDate;
	}
	public void setStartDate(String startDate) 
	{
		this.startDate = startDate;
	}
	public String getEndDate() 
	{
		return endDate;
	}
	public void setEndDate(String endDate) 
	{
		this.endDate = endDate;
	}
	@Override
	public String toString() 
	{
		return "CustomerType [customerType=" + customerType + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
