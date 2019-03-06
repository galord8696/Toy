package toy;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
            Toy dekel = new Toy("Dekel");
            dekel.setCount(20);
            
            Toy gary = new Toy("Dekel");
            dekel.setCount(10);
            
            Toy jack = new Toy("Dekel");
            dekel.setCount(40);
            
            Toy leo = new Toy("Dekel");
            dekel.setCount(30);
	}

	public void loadToys( String toys )
	{
            Toy t = new Toy(toys);
            toyList.add(t);
	}
  
  	public Toy getThatToy( String nm )
  	{
            return toyList.get(toyList.indexOf(nm));
            
  	}
  
  	public String getMostFrequentToy()
  	{
            int c;
            Toy high = new Toy();
            
            for (Toy num: toyList){
                c = num.getCount();
                if (c > high.getCount()){
                    high = num;
                }
            }
            return(high.getName());
  	}  
  
  	public void sortToysByCount()
  	{           
            List<Toy> out = new ArrayList<Toy>(toyList.size());
            int ind = 0;
            for (Toy num: toyList){
                for (int i = 0; i<toyList.size() ;i++){
                    ind = toyList.size()-1;
                    if (num.getCount() > toyList.get(i).getCount()){
                        ind--;
                    }
                    out.set(ind, toyList.get(i));
                }
            }
            toyList.clear();
            toyList.addAll(out);
  	}  
  	  

	public String toString()
	{
            String st = "";
            
            for (Toy x: toyList){
                st = st + x.getName() + " " + x.getCount() + ", ";
            }
            
	   return st;
	}
}