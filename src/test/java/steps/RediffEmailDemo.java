package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RediffEmailDemo {
	
WebDriver driver;
	
	@Given("I am on RediffPage")
	public void iAmOnRediffPage() {
	   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypage.rediff.com/login/dologin");
	}

	@When("I enter EmailID {string} & Password {string}")
	public void iEnterEmailPassword(String em, String p) throws InterruptedException {
	   driver.findElement(By.id("txtlogin")).sendKeys(em);
	   Thread.sleep(2000);
	   driver.findElement(By.id("pass_box")).sendKeys(p);
	   Thread.sleep(2000);
	}

	@When("click on Login")
	public void clickOnLogin() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"pass_div\"]/input[3]")).click();
	    Thread.sleep(2000);
	    driver.close();
	}


}
