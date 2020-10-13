package com.ust_global.app.MakeMyTrip;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class makeMyTrip {
	public static void main( String[] args ) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sujata/Documents/Test Automation_StackRoute/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		String baseUrl = "https://www.makemytrip.com";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//*[contains(text(),'Login or Create Account')]"));
		login.click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("sujata.2020.k@gmail.com");
		WebElement Continue = driver.findElement(By.xpath("//*[contains(text(),'Continue')]"));
		Continue.click();
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Sujata@123");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
		loginBtn.click();
		WebElement flights = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[2]"));
		flights.click();
		
		WebElement hotels = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[2]"));
		hotels.click();
		String text = driver.getCurrentUrl();
		System.out.println(text);
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]"));
		search.click();
		WebElement locality = driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_locality\"]/div/div[1]/ul/li[1]/span/label"));
		locality.click();
		WebElement stars = driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_star_category\"]/ul/li[2]/span[1]/label"));
		stars.click();
		WebElement selectedHotel = driver.findElement(By.xpath("//*[@id=\"htl_id_seo_201302141837083549\"]"));
		selectedHotel.click();
	
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("https://www.makemytrip.com/hotels/hotel-details/?hotelId=201302141837083549&mtkeys=N$$s9rHC9RN7n%2F15luQxtCuRfB79E2u14Vc8jOVrWLdR8IpCzMxl4zU9IHYlqqQB260eg72OLpa3F5s70nx3UKO6fDBcYEvgIsmaayslV7eH8tS6MjJh%2FD53%2BuobD7%2FJW3boiM7USzznI5vBxxExvj%2FPionqWquOVgdqYIVtw%2B1bwLD2kvZnkdO9YdrKDT1gqAKubhQ16HWxAhG3RzeOHSb1%2B7o4eRERzLXorEl9hKOG6cTvYb4eait7Mj%2BJoS%2B5nQcHME2tL%2BIKwQxubAZ6I12UKRoHSWXTMWZfLnVLxm7wFd2mhLjI4r2daAvL0mYS4jYe%2BL8NtjD6CI6EhnyezKzkVgDUAzsMTObJZAoyxoKPai9B5UMe7Fuak3BA38ZGNcx&_uCurrency=INR&checkin=10132020&checkout=10142020&city=CTGOI&country=IN&filterData=STAR_RATING%7C5&lat=15.54601&lng=73.76672&locusId=CTGOI&locusType=city&mmAreaTag=North%20Goa%7CARNOR&rank=3&roomStayQualifier=2e0e&searchText=Goa%2C%20India&visitorId=e5daf3a5-f947-4008-96de-08eab19229ac");
	    
		WebElement bookNow = driver.findElement(By.xpath("//*[@id=\"detpg_headerright_book_now\"]"));
		bookNow.click();
		
		WebElement fName = driver.findElement(By.id("fName"));
		fName.sendKeys("Sujata");
		
		WebElement lName = driver.findElement(By.id("lName"));
		lName.sendKeys("Ghosh");
		
		WebElement PayNow = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/a/div"));
		PayNow.click();
		/*Selecting GooglePay*/
		WebElement Gpay = driver.findElement(By.id("GPAY"));
		Gpay.click();
		
		WebElement GpayText = driver.findElement(By.id("upiId"));
		GpayText.sendKeys("abc");
		
		WebElement makePayment = driver.findElement(By.id("btn_gen_pmt_gpay"));
		makePayment.click();
		assertTrue(driver.getPageSource().contains("Invalid"));
		
		driver.close();
	}

}
