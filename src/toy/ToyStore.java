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
	private ArrayList<Toy> toyList = new ArrayList<>();

	public ToyStore()
	{         
            Toy dekel = new Toy("dekel", 20);
            toyList.add(dekel);
            
            Toy gary = new Toy("gary",10);
            toyList.add(gary);
            
            Toy jack = new Toy("jack",40);
            toyList.add(jack);
            
            Toy leo = new Toy("leo",30);
            toyList.add(leo);
	}

	public void loadToys( Toy toys )
	{
            toyList.add(toys);
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
            List<Toy> out = new ArrayList<>(toyList.size());
            for (Toy n: toyList){
                out.add(n);
            }
            int ind;
            
            
            for (Toy num: toyList){
                ind = toyList.size()-1;
                for (int i = 0; i<toyList.size(); i++){
                    if (num.getCount() > toyList.get(i).getCount()){
                        ind--;
                    }
                }
                out.set(ind, num);
            }
            toyList.clear();
            toyList.addAll(out);
  	}  
  	  

        @Override
	public String toString()
	{
            String st = " ";
            for (Toy x: toyList){
                st = st + x.getName() + " " + x.getCount() + ", ";
                
            }
            
	   return st;
	}
}