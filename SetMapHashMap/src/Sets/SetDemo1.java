package Sets;

import java.util.*;   
public class SetDemo1{   
    public static void main(String[] args)   
    {   
        // creating LinkedHashSet using the Set  
        Set<String> data = new LinkedHashSet<String>();   
    
        data.add("Stella");   
        data.add("Jeffrey");   
        data.add("Cersi");   
        data.add("Robert");   
    
        System.out.println(data);   
    }   
}