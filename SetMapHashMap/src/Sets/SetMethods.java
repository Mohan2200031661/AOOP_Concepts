package Sets;

import java.io.*;   
import java.util.*;  
class SetMethods {   
    public static void main(String args[])   
    {   
        Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   //1.add()
        data.add(21);   
        data.add(41);   
        System.out.println("Set: " + data); 
        
        
        ArrayList<Integer> newData = new ArrayList<Integer>();   
        newData.add(91);   
        newData.add(71);   
        newData.add(81); 
        
        data.addAll(newData);   //2.addAll()
        System.out.println("Set: " + data); 
        
        data.clear();   //3.clear()
        
        data.add(31);   
        data.add(21);   
        data.add(41);   
        data.add(51);   
        data.add(11);   
        data.add(81); 
        data.add(55);   
        data.add(44);   
        data.add(99);
        data.add(20);   
        data.add(30);   
        data.add(40);
        
        System.out.println("Set: " + data);  
        System.out.println("Does the Set contains '91'?" + data.contains(91));   //4. contains
        System.out.println("Does the Set contains 'Jeffery'? " + data.contains("Jeffery"));  
        System.out.println("Does the Set contains '51'? " + data.contains(51));  
        
        
        
        System.out.println("data: " + data);  
        
        //5. containsAll
        Set<Integer> newData1 = new LinkedHashSet<Integer>();   
        newData.add(31);   
        newData.add(21);   
        newData.add(41);   
          
       System.out.println("\nDoes data contains newData?: "+ data.containsAll(newData1)); 
       
       //6. isEmpty()
       System.out.println("\nIs data empty?: "+ data.isEmpty());  
       
       //Iterator()
       Iterator newData3 = data.iterator();  
       System.out.println("\nThe NewData values are: ");   
       while (newData3.hasNext()) {   
           System.out.println(newData3.next());   
        
    }   
       //7. remove()
       data.remove(81);  
       data.remove(21);  
       data.remove(11);      
       System.out.println("data after removing elements: " + data); 
       
       
       //8.removeAll()
       ArrayList<Integer> newData4 = new ArrayList<Integer>();   
       newData4.add(55);   
       newData4.add(44);   
       newData4.add(99);  
       System.out.println("NewData: " + newData4);  
         
       data.removeAll(newData4);  
       System.out.println("data after removing Newdata elements : " + data);
       
       //9.retainAll()
       ArrayList<Integer> newData5 = new ArrayList<Integer>();   
       newData5.add(20);   
       newData5.add(30);   
       newData5.add(40);  
       System.out.println("NewData: " + newData5);  
         
       data.retainAll(newData5);  
       System.out.println("data after removing Newdata elements : " + data);
       
       //10.size()
       System.out.println("size of the data is : " + data.size());   
}
}