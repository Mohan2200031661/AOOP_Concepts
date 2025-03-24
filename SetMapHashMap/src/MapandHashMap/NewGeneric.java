package MapandHashMap;

import java.util.*;  
class NewGeneric{  
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(99,"Rahul");  
  System.out.println(map);
  //Elements can traverse in any order  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }
   
   
   TreeMap<Integer, String> tree_map   = new TreeMap<Integer, String>();  
   tree_map.put(100,"Amit");  
   tree_map.put(101,"Vijay");  
   tree_map.put(102,"Rahul");  
 //Elements can traverse in an Asc order 
   System.out.println("TreeMap: " + tree_map);
   
   
   
   //put(), putAll(), putIfAbsent()
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
   System.out.println("Initial list of elements: "+hm);  
     hm.put(100,"Amit");    //put()
     hm.put(101,"Vijay");    
     hm.put(102,"Rahul");   
      
     System.out.println("After invoking put() method "); 
     //Iterate through the Map & Display the elements
     for(Map.Entry m:hm.entrySet())
     {    
      System.out.println(m.getKey()+" "+m.getValue());    
     }  
       
     hm.putIfAbsent(103, "Gaurav");  //putIfAll()
     System.out.println("After invoking putIfAbsent() method ");  
     for(Map.Entry m:hm.entrySet())
     {    
          System.out.println(m.getKey()+" "+m.getValue());    
     }  
     HashMap<Integer,String> map1=new HashMap<Integer,String>();  
     map1.put(104,"Ravi");  //putAll()
     map1.putAll(hm);  
     System.out.println("After invoking putAll() method ");  
     
     for(Map.Entry m:map1.entrySet())
     {    
          System.out.println(m.getKey()+" "+m.getValue());    
     }
     
     
     
     
     //remover() - keybased, pair based,
     System.out.println("Initial list of elements: "+map1);  
     //key-based removal  
     map1.remove(100);  
     System.out.println("Updated list of elements: "+map1);  

     //key-value pair based removal  
     map1.remove(102, "Rahul");  
     System.out.println("Updated list of elements: "+map1);  
     
       //replace() - hm.replace(102, "Gaurav");  
     //,replaceAll(k,v) -  hm.replaceAll((k,v) -> "Ajay");  
}  
  

 }  
 