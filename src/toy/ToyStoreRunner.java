package toy;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
            ToyStore hi = new ToyStore();
            System.out.println(hi);
            
            hi.sortToysByCount();
            
            //System.out.println(hi.toString());
            
	}
}