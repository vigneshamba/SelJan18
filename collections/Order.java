package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List; //
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Order {

	/**
	 * 
	 * Collections - 
	 * 
	 * 
	 * All collections frameworks contain the following:
	 * 
	 * 1) Interfaces: These are abstract data types that 
	 * represent collections.Interfaces allow collections 
	 * to be manipulated independently of the details
	 * 
	 * 2) Implementations: These are the concrete 
	 * implementations of the collection interfaces.
	 * In essence, they are reusable data structures.
	 * 
	 * 3) Algorithms: These are the methods that perform 
	 * useful computations, such as searching and sorting, 
	 * on objects that implement collection interfaces.
	 * The algorithms are said to be polymorphic: 
	 * that is, the same method can be used on many
	 * different implementations of the appropriate 
	 * collection interface. 
	 * 
	 * 
	 */


	/**
	 * Date: 17 Dec 2016
	 * 
	 * 1) 
	 * List is an interface
	 * An ordered collection (also known as a sequence). 
	 * The user of this interface has precise control over where in the list each element is inserted. 
	 * The user can access elements by their integer index (position in the list),
	 * and search for elements in the list.
	 * 
	 * Lists typically allow duplicate elements.
	 * Lists (like Java arrays) are zero based 
	 * 
	 * 2) 
	 * ArrayList is one of the implementation of the List interface 
	 * ArrayList has few additional methods on top of List interface
	 *
	 * 3) 
	 * Methods we will learn today
	 * 
	 * size, get(index), add, remove, clear, isEmpty
	 */

	public static void main(String[] args) {

		// Create a List
		List<Integer> number = new LinkedList<Integer>();

		// List of number -- Note the order
		number.add(477);
		number.add(343);
		number.add(842);
		
		//Sorting the given number in List
		Collections.sort(number);		
		//Get the Count of List
		int count = number.size();
		
		//Print the number in Reverse number
		for (int i = count-1; i >=0; i--) {
			
			System.out.println(number.get(i));
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



}
