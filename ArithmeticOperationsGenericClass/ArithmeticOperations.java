package ArithmeticOperationsGenericClass;

import java.util.List; 
import java.util.Vector; 
/**
 * Supports arithmetic operations of +, -, *, / on any type that are subclasses 
 * of {@link java.lang.Number}.
 * @author pchandra
 *
 */
public class ArithmeticOperations 
{ 
/**
 * Generic method to add 2 numbers.
 * @param t1
 * @param t2
 * @return
 */
public static <T extends Number> Number add(T t1, T t2) 
 { return (t1.doubleValue() + t2.doubleValue()); } 
/**
 * Demostrates Upper Bounded Wildcards.
 * Generic method to add numbers from a list.
 * @param t1
 * @param t2
 * @return
 */

public static <T extends Number> Number add(List<? extends Number> list) { 
		 double d = 0;
		 for (int i = 0; i < list.size(); i++) 
		 d += list.get(i).doubleValue(); 
		 return d; 
 }

//Subtraction

public static <T extends Number> Number subtract (T t1, T t2){
	return(t1.floatValue() - t2.floatValue());
}

//Swapping
public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
    if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
        throw new IndexOutOfBoundsException("Invalid index. Ensure both positions are within bounds.");
    }

    T temp = list[firstPos];
    list[firstPos] = list[secondPos];
    list[secondPos] = temp;

    return list;
}

/**
 * Demostrates Unbounded Wildcards.
 * Generic method to dump list data to console.
 * @param t1
 * @param t2
 * @return
 */
public static void dumpList(List<?> list) { 
		 System.out.println("List dump with unbounded wildcard:"); 
		 for (int i = 0; i < list.size(); i++) 
		 System.out.println(list.get(i)); 
 } 


public static void main(String[] args) { 
			 // Adding 2 integers
			 Integer i1 = 34, i2 = 43; 
			 System.out.println("Add with generic method: " + 
			 ArithmeticOperations.add(i1, i2)); 
			 Float f1 = 12.56f , f2 = 3.6778f; 
			 System.out.println("Add with generic method: " + 
			 ArithmeticOperations.add(f1, f2)); 
			 // Adding 2 integers through a list
			 Vector<Number> l = new Vector<Number>(); 
			 l.add(34); 
			 l.add(43); 
			 System.out.println("Add with upper bounded wildcard: " + 
			 ArithmeticOperations.add(l)); 
			 
			 System.out.println("Subtract :" +ArithmeticOperations.subtract(23.56, 45.99));
			 Integer[] arrint = {23,54,657,75};
			 ArithmeticOperations.swap(arrint, 0, 3);
			 System.out.println("Swapped List : ");
			 for(int num: arrint) {
				 System.out.print(num +" ");}
			 
 
 // Dumping the list to the console.
			// ArithmeticOperations.dumpList(l); 
 	} 
} 

