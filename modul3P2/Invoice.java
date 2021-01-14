package modul3P2;

import java.util.Date;
import java.util.List;

public class Invoice 
{
	private String InvoiceNo;
	private Date Date;
	private List<Part> Parts;
	
	public Invoice (String InvoiceNo, List<Part> Parts)
	{
		this.InvoiceNo = InvoiceNo;
		this.Date = new Date();
		this.Parts = Parts;
	}
	
	public void setInvoiceNo(String InvoiceNo)
	{
		this.InvoiceNo = InvoiceNo;
	}
	
	public void setDate(Date Date)
	{
		this.Date = Date;
	}
	
	public void setParts(List<Part> Parts)
	{
		this.Parts = Parts;
	}
	
	public String getInvoiceNo()
	{
		return InvoiceNo;
	}
	
	public Date getDate()
	{
		return Date;
	}
	
	public List<Part> getParts()
	{
		return Parts;
	}
}
