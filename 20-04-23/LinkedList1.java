package Pack1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{
    public static void main(String[] args) 
    {
        
        LinkedList<String> c1 = new LinkedList<>(); 
        
        c1.add("Yellow");							
        c1.add("Blue");
        c1.add("Black");
        c1.add("Pink");
        c1.add("White");
        c1.add("Grey");
        c1.add("Purple");
        c1.add("Orange");
        c1.add("Brown");
        
        c1.addLast("Red");							
        
        System.out.println(c1);
        
        System.out.println("Elements from index 4 to end:" + c1.subList(4, c1.size( )));	 
        													

        System.out.print("Elements in reverse order: ");			
        ListIterator<String> iterator = c1.listIterator(c1.size());
        while(iterator.hasPrevious()) 
        {
            System.out.print(iterator.previous() + " ");
        }
    }
}

/*
[Yellow, Green, Blue, Black, Pink, White, Grey, Purple, Orange, Brown, Red]
Elements from index 4 to end:[Pink, White, Grey, Purple, Orange, Brown, Red]
Elements in reverse order: Red Brown Orange Purple Grey White Pink Black Blue Green Yellow  
 */

