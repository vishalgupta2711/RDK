package com.RDK.qa.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestRDK {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.rishtadilka.com/");
		
		driver.findElement(By.cssSelector(".navbar-nav>li:last-of-type")).click(); // registration button click
		
		driver.findElement(By.cssSelector("#select2-step-0-1-container")).click(); //click on Im looking for
		driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Friend");
		List <WebElement> list = driver.findElements(By.cssSelector("#select2-step-0-1-results>li"));
		System.out.println(list.size());
		
		for(int i = 0 ; i< list.size() ; i++) {

			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("Myself")) {
				list.get(i).click();
			}
			else if(list.get(i).getText().equals("Son")) {
				list.get(i).click();
			}
			else if(list.get(i).getText().equals("Daughter")) {
				list.get(i).click();
			}
			else if(list.get(i).getText().equals("Brother")) {
				list.get(i).click();
			}
			else if(list.get(i).getText().equals("Sister")) {
				list.get(i).click();
			}
			else if(list.get(i).getText().equals("Relative")) {
				list.get(i).click();
			}
			else if(list.get(i).getText().equals("Friend")) {
				list.get(i).click();
			}
			
		}
		
		driver.findElement(By.cssSelector("#select2-step-0-2-container")).click();
		driver.findElement(By.cssSelector("li[id$='Female']")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Mobile Number']")).sendKeys("6233211234");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-red.w-100>b")).click(); //continue btn
		
		driver.findElement(By.xpath("(//input[@type = 'date'])[1]")).sendKeys("1010");
		driver.findElement(By.xpath("(//input[@type = 'date'])[1]")).sendKeys(Keys.ARROW_RIGHT);
		driver.findElement(By.xpath("(//input[@type = 'date'])[1]")).sendKeys("1998");
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Mobile Number']")).sendKeys("6232132145");
		driver.findElement(By.xpath("//input[@placeholder = 'Enter Email']")).sendKeys("test@723.com");
		driver.findElement(By.xpath("//input[@type= 'Password']")).sendKeys("test123");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-red.w-100>b")).click(); //continue btn
		
		driver.findElement(By.cssSelector("#select2-religion-container")).click(); //religion dd click
		
		String MyReligion = "Christian";
		
		List <WebElement> listReligion = driver.findElements(By.cssSelector("#select2-religion-results>li"));
		System.out.println(listReligion.size());
		
		driver.findElement(By.cssSelector(".select2-search__field")).sendKeys(MyReligion);
		/*for(int i=0 ; i< listReligion.size() ; i++) {
			if(list.get(i).getText().equals(MyReligion)) {
				list.get(i).click();
			}
		}*/
		String ActualLocatorReligion = "li[id$='"+MyReligion+"']";
		if(MyReligion.equals("Christian")) {
			driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
		}
		
		/*String arr[] = {"Hindu","Muslim - Shia","Muslim - Sunni","Muslim - Others","Christian","Sikh","Jain - Digambar",
				"Jain - Shwetambar","Jain - Others","Parsi","Buddhist","Inter-Religion"};
		System.out.println(arr.length);
		for(int i=0 ; i<arr.length ; i++) {
			String religionList = arr[i].toString();
			System.out.println(religionList);
			String ActualLocatorReligion = "li[id$='"+religionList+"']";
			
			if(religionList.equals("Hindu")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Muslim - Shia")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Muslim - Sunni")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Muslim - Others")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Christian")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Sikh")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Jain - Digambar")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Jain - Shwetambar")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Jain - Others")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Parsi")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Buddhist")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			else if(religionList.equals("Inter-Religion")) {
				driver.findElement(By.cssSelector(ActualLocatorReligion)).click();
			}
			
		}
		*/
		
		
		
		
		
		
	}

}
