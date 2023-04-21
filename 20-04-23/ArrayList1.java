package Pack1;

import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args) 
    {
       
        ArrayList<String> v1 = new ArrayList<>();		 // Create a ArrayList 
        
        v1.add("Baleno");								// Add elements
        v1.add("BMW");
        v1.add("Harrier");
        v1.add("Toyoto");
        v1.add("Thar");
        v1.add("Fortuner");
        v1.add("Swift");
        v1.add("Ford");
        v1.add("KIA");
        v1.add("Ferrari");

        System.out.println("Array_List of Vehicles = " + v1);		

        
        System.out.println("ArrayList =");			
       
        for (String vehicle : v1)
        {			
            System.out.println(vehicle);			
        }

        v1.add(0, "BMW");					
        v1.add("Maybach");						

        String vehicleAtIndx = v1.get(4);						    	
        System.out.println("Vehicle on index 4: " + vehicleAtIndx);

        v1.set(7, "XUV300");						
        
        if (v1.contains("verna")) 
        {				                                  
            System.out.println("found the vehicle");
        }
          else 
        {
            System.out.println("Not found");
        }
        
        ArrayList<String> v2 = new ArrayList<>(v1);	 
        System.out.println("Copied Array_List = " + v2);
    }
}
