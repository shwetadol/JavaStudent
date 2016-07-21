package Guru;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkcount {
	public static void main(String[] s){
		WebDriver driver= new FirefoxDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int s1=li.size();
		
		for(int i=0;i<s1;i++){
			System.out.println(li.get(i).getText());
		}
	}

}
