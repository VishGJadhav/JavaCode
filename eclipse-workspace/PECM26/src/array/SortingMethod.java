package array;

public class SortingMethod {

	public static char[] sortChar(char[] ch)
	{
		for (int i = 0; i < ch.length-1; i++)
		{
			
			for (int j = i+1; j < ch.length-1; j++) 
			{
				if(ch[i]>ch[j+1])
				{
					char temp = ch[i];
						ch[i] = ch[j+1];
						ch[j+1]=temp ;
				}
			}
		}
		return ch ;
	}
	
}
