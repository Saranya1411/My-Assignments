package Week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookAccCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    // Creating New account
	//	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("TestLeaf");
		driver.findElement(By.name("lastname")).sendKeys("Selenium");
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("testleaf");
		//Selecting date by value
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select d = new Select(date);
		d.selectByValue("14");
		//Selecting month by visible text
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select m = new Select(month);
		m.selectByVisibleText("Nov");
		//Selecting date by value
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select y = new Select(year);
		y.selectByValue("1992");
		//selecting Radio button
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	    
	}

}
