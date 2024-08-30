package Week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launching Browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		// Entering Credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click();
		
        driver.findElement(By.linkText("CRM/SFA")).click(); //Link
        driver.findElement(By.linkText("Accounts")).click(); //Account tab
        driver.findElement(By.linkText("Create Account")).click(); //Create Account 
        //Entering Details
        driver.findElement(By.id("accountName")).sendKeys("Saranya R");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.id("numberEmployees")).sendKeys("6");
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.className("smallSubmit")).click();
        //Printing title of the page
        String title = driver.getTitle();
        System.out.println(title);
        
        driver.close();

   }
}