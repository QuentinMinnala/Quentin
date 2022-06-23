package week1.day1;

public class Solution_palindrome {

		

	    public static boolean checkPalindrome(String str){
	    	  char[] charArray = str.toCharArray();  
	    	    for(int i=0; i < str.length(); i++) {
	    	        if(charArray[i] != charArray[(str.length()-1) - i]) {
	    	            return false;
	    	        }
	    	    }
	    	    return true;
	    	}
	    public static void main(String[] args) {
			 String str = "madam";
			    if(checkPalindrome(str)) {
			        System.out.println("Palindrome");
			    } else {
			        System.out.println("Not a Palindrome");
			    }
	    }
}
