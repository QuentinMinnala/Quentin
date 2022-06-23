package week1.day1;

public class Solution {

	public static int charCount(String str){
		// TODO Auto-generated method stub
		 str = "Selenium Webdriver";
		    String lower = str.toLowerCase();
		    char[] c = lower.toCharArray(); // converting to a char array
		    int freq =0, freq2 = 0,freq3 = 0,freq4=0,freq5 = 0;

		    for(int i = 0; i< c.length;i++) {
		        if(c[i]=='e') 
		        {
		        	freq++;
		      
		        }

		    }
		    if (freq > 0) {
			System.out.println("Number of 'e' are "+freq);
		}
			
			return 0;
		
		}
		public static void main(String[] args) 
		{
			Solution obj=new Solution();
			obj.charCount(null);
	
	}
		
}
