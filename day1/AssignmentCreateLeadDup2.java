package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCreateLeadDup2 {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();	
	
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sabarikanth");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kandasamy");

	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sabari");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Coder");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sabresab92@gmail.com");

	Select sp = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
	sp.selectByVisibleText("New York");
	//WebElement ch = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLeaf");
    driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sabarikanth");
	driver.findElement(By.name("submitButton")).click();
    System.out.println(driver.getTitle());
		}
	}

