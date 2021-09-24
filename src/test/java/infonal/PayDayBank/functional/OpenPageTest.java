package infonal.PayDayBank.functional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPageTest {
	 public WebDriver driver;
	    protected static String url = "http://localhost:8080/swagger-ui.html/";

	    @Before
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\infonal\\Yeni klasör\\PayDayBank\\PayDayBank\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void correctOpen() {
	        driver.get(url);
	        Assert.assertEquals(driver.getTitle(), "localhost:8080");
	    }

	    @After
	    public void tearDown() {
	        driver.quit();
	    }

}
