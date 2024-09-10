package Week3.Assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver = new ChromeDriver();
       driver.get(" https://www.ajio.com/ ");
       driver.manage().window().maximize();
       driver.findElement(By.name("searchVal")).sendKeys("Bags" + Keys.ENTER);
     //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   //driver.findElement(By.id("Men")).click();
       
       //driver.findElement(By.xpath("//div[@class='facet-linkhead']//input[@id='Men']")).click();
       
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       org.openqa.selenium.WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-genderfilter')])[2]")));
       element.click();
     
       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
       org.openqa.selenium.WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(@for,'Men - Fashion Bags')]")));
       element1.click();
   
	}

}


