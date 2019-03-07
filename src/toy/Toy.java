package toy;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
            name = "Joe";
            count++;
	}

	public Toy( String nm )
	{
            name = nm;
	}
        
        public Toy( String nm, int ct)
	{
            name = nm;
            count = ct;
	}
	
	public int getCount()
	{
            return count;
	}
	
	public void setCount( int cnt )
	{
            count = cnt;
	}
	
	public String getName()
	{
            return name;
	}
	
	public void setName( String nm )
	{
            name = nm;
	}

	public String toString()
	{
	   return ("The toy is called " + name + "and there is a total of " + count + " toys.");
	}
}