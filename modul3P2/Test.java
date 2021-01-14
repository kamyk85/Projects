package modul3P2;

import java.util.List;

public class Test 
{

	public static void main(String[] args) 
	{
		Workshop workshop = new Workshop();
		List<Invoice> invoices = workshop.init();
		
		System.out.println("Invoices list:");
		workshop.listAll(invoices);
		
		System.out.println("Find Part: ");
		//Part searchedPart = new Part ("Opona", "o1xyz", 50.25);
		String searchedPart = "Opona";
		workshop.findPart(invoices, searchedPart);
		
		System.out.println("Total: ");
		workshop.sumAll(invoices);

	}

}
