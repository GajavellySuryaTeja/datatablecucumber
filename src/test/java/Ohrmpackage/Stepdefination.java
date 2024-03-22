package Ohrmpackage;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination {
	WebDriver driver=null;
	int s1=3000;
	@Given("open browser for datatable practice")
	public void open_browser_for_datatable_practice() {
	 System.out.println("we have to open the browser");  
	}

	@And("passing the url for datatable practice")
	public void passing_the_url_for_datatable_practice() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(s1);
	}

	@Then("username and password credentials for datatable practice")
	public void username_and_password_credentials_for_datatable_practice(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		//single row data without key values
//		 List<List<String>> datafromtable=dataTable.asLists(String.class);
//		 driver.findElement(By.name("username")).sendKeys(datafromtable.get(0).get(0));
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("password")).sendKeys(datafromtable.get(0).get(1));
//		 Thread.sleep(s1);
//		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("username")).sendKeys(datafromtable.get(1).get(0));
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("password")).sendKeys(datafromtable.get(1).get(1));
//		 Thread.sleep(s1);
//		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		 Thread.sleep(s1); 
//		 driver.findElement(By.name("username")).sendKeys(datafromtable.get(2).get(0));
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("password")).sendKeys(datafromtable.get(2).get(1));
//		 Thread.sleep(s1);
//		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		 Thread.sleep(s1); 
//		 driver.findElement(By.name("username")).sendKeys(datafromtable.get(3).get(0));
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("password")).sendKeys(datafromtable.get(3).get(1));
//		 Thread.sleep(s1);
//		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		 Thread.sleep(s1); 
//		 driver.findElement(By.name("username")).sendKeys(datafromtable.get(4).get(0));
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("password")).sendKeys(datafromtable.get(4).get(1));
//		 Thread.sleep(s1);
//		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		 Thread.sleep(s1); 
//		 driver.findElement(By.name("username")).sendKeys(datafromtable.get(5).get(0));
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("password")).sendKeys(datafromtable.get(5).get(1));
//		 Thread.sleep(s1);
//		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		 Thread.sleep(s1); 
//		 driver.findElement(By.name("username")).sendKeys(datafromtable.get(6).get(0));
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("password")).sendKeys(datafromtable.get(6).get(1));
//		 Thread.sleep(s1);
//		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();  
//		 Thread.sleep(s1); 
//		 driver.findElement(By.name("username")).sendKeys(datafromtable.get(7).get(0));
//		 Thread.sleep(s1);
//		 driver.findElement(By.name("password")).sendKeys(datafromtable.get(7).get(1));
//		 Thread.sleep(s1);
//		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		 Thread.sleep(s1);

//multiple values
		List<Map<String, String>> multidata=dataTable.asMaps(String.class,String.class);
		for(Map<String, String> alldata : multidata) {
			
			WebElement e1=driver.findElement(By.name("username"));
			WebElement e2=driver.findElement(By.name("password"));
			//to clear field (we use this process because regular clear did not worked)
			String s=Keys.chord(Keys.CONTROL,"a"); //chord is used to join two keys
			e1.sendKeys(s);
			e1.sendKeys(Keys.DELETE);

			Thread.sleep(3000);
			e1.sendKeys(alldata.get("username"));  
			Thread.sleep(3000);

			//to clear field
			String s1=Keys.chord(Keys.CONTROL,"a"); //chord is used to join two keys
			e2.sendKeys(s1);
			e2.sendKeys(Keys.DELETE);

			Thread.sleep(3000);
			e2.sendKeys(alldata.get("password"));
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(3000);
		}
		
		 }

	@When("close browser for datatable practice")
	public void close_browser_for_datatable_practice() {
	driver.close();    
	}

}
