package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chorme.driver", "\"C:\\Users\\win11\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector("div.ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all:nth-child(3) table.ui-datepicker-calendar tbody:nth-child(2) tr:nth-child(4) td.ui-datepicker-today:nth-child(3) > a.ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
		
	}

}
