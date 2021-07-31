package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginstepDefination {

	public WebDriver driver;

	@Given("I launch the chrome browser")
	public void i_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://qualitypointtech.net/timesheetdemo/");
	}

	@Given("I enter username and password")
	public void i_enter_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.name("login")).click();
		driver.switchTo().alert().accept();
	}

	@Then("I redirect on dashboard page.")
	public void i_redirect_on_dashboard_page() {
		if (driver.findElement(By.linkText("Change Password")).isDisplayed()) {
			System.out.println("User successfully logged into portal.");
		} else {
			System.out.println("User faced some issues while login.");
		}
		driver.quit();
	}
}
