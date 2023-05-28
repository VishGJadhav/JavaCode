package strings;

import java.util.Scanner;

public class Anagram2 {

	 public static void main(String[] args) 
	 {
			// Tow String have same name without shirting
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Eneter  1st String ");
		   String s1=sc.next().toLowerCase().trim();
		   
		 System.out.println("Enter 2nd String ");  
		   String s2=sc.next().toLowerCase().trim();
		   
		   if(s1.length()!=s1.length())
		   {
			   System.out.println("It is NOT ANAGRAM.");
			   return;
		   }
		  
		   for(int i=0;i<s1.length();i++)
		   {
			   char c1=s1.charAt(i);
			   
			  for(int j=0;j<s2.length();j++) 
			  { 
				 char c2=s2.charAt(j);
				  if(c1==c2)
				  {
					  s2=removeChar(s2, c2); 
					 
					  break;
				  }
			  }		   
		   }
		   
		   if(s2.length()==0)
		   {
			   System.out.println("It is an ANAGRAM");
		   }
		   else
		   {
			   System.out.println("It is not an ANAGRAM");
		   }	   
	 }
	 
	 public static String removeChar(String s,char c)
	 { 
		 String s2="";
		 
		 for(int i=0;i<s.length();i++)
		 {
			 char c1=s.charAt(i);
			 if((c1==c))
			 {
				if(i==s.length()-1)
				{
					s2=s2;
				}
				else
				{
					 s2=s2+(++c);
				}
				
			 }
			 else
			 {
				 s2=s2+c1;
			 }
		 }
		 
		 return s2;   
	 }
}
