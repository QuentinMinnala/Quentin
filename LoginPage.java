package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

}
