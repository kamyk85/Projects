package modul3P2;

import java.util.ArrayList;
import java.util.List;

public class Workshop 
{
	public List<Invoice> init()
	{
		Part p1 = new Part("Opona", "o1.xzy", 50.25);
		Part p2 = new Part("Lozysko", "l1.qwe", 70.00);
		Part p3 = new Part("Klamka", "k1.asd", 20.15);
		Part p4 = new Part("Opona", "o2.xzy", 52.50);
		Part p5 = new Part("Filtr", "f1.rty", 35.00);
		Part p6 = new Part("Migacz", "m1.ghj", 42.00);
		Part p7 = new Part("Lusterko", "l1.poi", 120.50);
		Part p8 = new Part("Opona", "o1.xzy", 60.15);
		Part p9 = new Part("Filtr", "f2.rty", 40.00);
		Part p10 = new Part("Filtr", "f3.rty", 45.00);
		
		List<Part> parts1 = new ArrayList<Part>();
		parts1.add(p1);
		parts1.add(p2);
		parts1.add(p3);
		
		List<Part> parts2 = new ArrayList<Part>();
		parts2.add(p4);
		parts2.add(p5);
		parts2.add(p6);
		
		List<Part> parts3 = new ArrayList<Part>();
		parts3.add(p7);
		parts3.add(p8);
		
		List<Part> parts4 = new ArrayList<Part>();
		parts4.add(p9);
		
		List<Part> parts5 = new ArrayList<Part>();
		parts5.add(p10);
		
		Invoice i1 = new Invoice ("001/2020", parts1);
		Invoice i2 = new Invoice ("002/2020", parts2);
		Invoice i3 = new Invoice ("003/2020", parts3);
		Invoice i4 = new Invoice ("004/2020", parts4);
		Invoice i5 = new Invoice ("005/2020", parts5);
		
		List<Invoice> invoices = new ArrayList<Invoice>();
		invoices.add(i1);
		invoices.add(i2);
		invoices.add(i3);
		invoices.add(i4);
		invoices.add(i5);
		
		return invoices;
	}
	
	public void listAll(List <Invoice> invoices)
	{
		for (Invoice invoice : invoices)
		{
			System.out.println("Invoice no: " + invoice.getInvoiceNo());
			System.out.println(" Date: " + invoice.getDate());
			System.out.println(" List of parts: ");
			for (Part part : invoice.getParts())
			{
				System.out.println("Part name: " + part.getName()+ " Series: "+ part.getSeries()+ " Price: "+ part.getPrice());
			}
			System.out.println();
		}
	}
	
	public void findPart(List <Invoice> invoices, String searchedPart)
	{
		boolean contains = false;
		for (Invoice invoice : invoices)
		{
			for (Part part : invoice.getParts())
			{
				if(part.getName() == searchedPart)
				{
					System.out.println("Invoice ID: " + invoice.getInvoiceNo());
					contains = true;
				}
			}
		}
		if (!contains)
			System.out.println ("Part not found");
		
		System.out.println();
	}
	
	public void sumAll (List <Invoice> invoices)
	{
		double sum = 0;
		
		for (Invoice invoice : invoices)
		{
			for (Part part : invoice.getParts())
			{
				sum += part.getPrice();
			}
		}
		
		System.out.println(sum);
		
	}


}
