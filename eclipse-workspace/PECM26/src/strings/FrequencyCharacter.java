package strings;

import java.util.Scanner;

public class FrequencyCharacter {
    
	     public static void main(String[] args) 
	     {   
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the String: ");
	        String str = sc.nextLine().toLowerCase().trim(); 
	        
	        int [] freq = new int[str.length()];    
	          
	            
	         
	        char string[] = str.toCharArray();    
	            
	        for(int i = 0; i <str.length(); i++)
	        {    
	            freq[i] = 1;
	            
	            for(int j = i+1; j <str.length(); j++) 
	            {    
	                if(string[i] == string[j]) 
	                {    
	                    freq[i]++;    
	                        
	                    
	                    string[j] = '0';    
	                }    
	            }    
	        }    
	               
	       
	        for(int i = 0; i <freq.length; i++) {    
	            if(string[i] != ' ' && string[i] != '0')    
	                System.out.println(string[i] + "---> " + freq[i]);    
	        }    
	    }    
	}    

