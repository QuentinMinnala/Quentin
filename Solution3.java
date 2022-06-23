package week1.day1;

public class Solution3{
	 public static String reverseEvenWords(String str) {
		  str="I am a software tester";
		 String[] t = str.split(" ");

		 for (int i = 1; i < t.length; i += 2) {
			    t[i] = new StringBuilder(t[i]).reverse().toString();
				System.out.println(String.join(" ", t));

	}
		return str;
	 }
	 public static void main(String[] args) {
			Solution3.reverseEvenWords(null);

	 
	 }
}
