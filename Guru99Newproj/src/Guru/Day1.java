package Guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new FirefoxDriver();
	  String baseurl="http://live.guru99.com/index.php/mobile.html";
	  driver.get(baseurl);
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getPageSource());
	  
	  //String title=driver.getTitle();
	  if(driver.getTitle().equals("Mobile")){
		  System.out.println("Title of the page is "+driver.getTitle());
	  }else {
		  System.out.println("Title is not same");
	  }
	  
	  driver.findElement(By.className("level0")).click();
	  if(driver.getTitle().equals("Mobile")){
		  System.out.println("Title of the page is "+driver.getTitle());
	  }else {
		  System.out.println("Title is not same");
	  }
	  Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
	  sel1.selectByIndex(1);
	  Thread.sleep(4000);
	  driver.close();
  
  
  }
}
