package genricUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	/**
	 * 
	 */
	public ExcelUtility eUtility=new ExcelUtility();
	public static ExtentTest test;
	
	public LoginPage lp;
	public WelcomePage wp;
	public HomePage hp;
	
	public WebDriver driver;
	public static WebDriver sdriver;
	public WebDriverUtility wUtility = new WebDriverUtility();
	public FileUtility fUtil = new FileUtility();

	public static ExtentReports extReport;
	public JavaUtility jUtil = new JavaUtility();

	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_eports/ExtentReport_" + jUtil.getSystemTime() + ".html");
		extReport=new ExtentReports();
		extReport.attachReporter(spark);
	}

	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}
		sdriver=driver;
		wUtility.maximzeWindow(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fUtil.getDataFromProperty("url"));

	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		wp=new WelcomePage(driver);
		wp.getLinkText().click();
		
		lp =new LoginPage(driver);
		lp.getEmailIdTextField().sendKeys(fUtil.getDataFromProperty("email"));
		lp.getPasswordTextfield().sendKeys(fUtil.getDataFromProperty("password"));
		lp.getLoginButton().click();
		
	}
	@AfterMethod
	public void logout() {
		hp=new HomePage(driver);
		hp.getLogoutButton().click();
		
	}
	
	@AfterClass
	public void closeBrower() {
		driver.quit();
	}
	

	@AfterSuite
	public void reportBackup() {
		extReport.flush();
	}
}
