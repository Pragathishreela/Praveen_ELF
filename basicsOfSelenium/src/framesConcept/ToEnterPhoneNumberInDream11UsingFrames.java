package framesConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterPhoneNumberInDream11UsingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("7330817465");

	}

}
