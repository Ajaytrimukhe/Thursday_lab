package Pack1;

import java.util.HashMap;

public class Hash 
{
    public static void main(String[] args) 
    {
        
        HashMap<Integer, String> s1 = new HashMap<>();		// creating a HashMap of Students (Key-Value)
        
        s1.put(105, "ajay");			 // adding key-value mappings to the HashMap
        s1.put(106, "ram");
        s1.put(107, "riya");
        s1.put(108, "amar");
        s1.put(109, "akash");
        
        if(s1.containsKey(105)) 
        {								
            System.out.println("Map contains the key 105");
        }
        else 
        {
            System.out.println("Map doesn't contains the key 105");
        }
        
        System.out.println("count the number of key-value : " + s1.size());	 
        
        HashMap<Integer, String> s2 = new HashMap<>(s1);	  
        System.out.println("Copy the map: " + s2);
    }
}

/*
Map contains the key 105
count the number of key-value : 5
Copy the map: {105=ajay, 106=ram, 107=riya, 108=amar, 109=akash}
 */
