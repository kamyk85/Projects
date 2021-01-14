package modul3P2;

public class Part 
{
	private String Name;
	private String Series;
	private Double Price;
	
	public Part(String Name, String Series, Double Price)
	{
		this.Name = Name;
		this.Series = Series;
		this.Price = Price;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setSeries(String Series)
	{
		this.Series = Series;
	}
	
	public void setPrice(Double Price)
	{
		this.Price = Price;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String getSeries()
	{
		return Series;
	}
	
	public Double getPrice()
	{
		return Price;
	}

}
