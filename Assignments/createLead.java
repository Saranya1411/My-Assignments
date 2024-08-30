package Week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launching Browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
	 //Entering credentials
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click(); //Link
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); 
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//Entering details
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		//Clicking submit
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Printing title
		String title = driver.getTitle();
		System.out.println(title);
		//Closing browser
		driver.close();
	}

}
