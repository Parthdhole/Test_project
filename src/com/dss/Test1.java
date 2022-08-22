package com.dss;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		TreeMap< Product ,Integer> s = new TreeMap<Product,Integer>(new Mycons());
	    s.put(new Product(434, "ratrx"), 213);
	    s.put(new Product(243, "facc"),222);
	    s.put(new Product(234, "asgcd"), 345);
	   Set<Product>  a =  s.keySet();
for(Product p:a)
{
	System.out.println(p.pid+" "+p.pname);
}
	               
	}

}
class Mycons implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.pid.compareTo(o2.pid);
	}

	}