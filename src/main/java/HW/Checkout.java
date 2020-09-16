package HW;

import java.util.HashMap;
import java.util.Map.Entry;

public class Checkout {
	
	
	//A hashmap of classes(products, each consists of 3 values being name price amount. because this is an array consisting of multivalues so it functions as a list
	public HashMap<String, Product> prod = new HashMap<String, Product>();
	//Inserting the product into the list using HashMap functions key->name value->price&name of class because both need to be specified 
	public void addProd(String name, int price)
	{	
	
		prod.put(name, new Product(name,price));
		
	}
	//replace the initial count value with the given one.
	public void getProd(String name, int count)
	{
	prod.get(name).count+= count;
	}
	//We iterate through the hashmap using the Entryset, and specify values since we don't need the keys. Then we add to the total
	public int total()
	{
		int total=0;
		for (Entry<String, Product> entry : prod.entrySet()) {
		    total+= entry.getValue().p * entry.getValue().count;
		    
		    		
		}
		return total;
	}
	
}
