import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\smath\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        		
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://github.com/login");
		
		WebElement username = driver.findElement(By.id("login_field"));
		username.sendKeys("fortesting12345");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("githubtesting123");
		WebElement signIn = driver.findElement(By.xpath("//input[@value='Sign in']"));
		signIn.click();
				
		WebElement plusIcon = driver.findElement(By.className("dropdown-caret"));
		plusIcon.click();
		WebElement newRepo = driver.findElement(By.linkText("New repository"));
		newRepo.click();
		WebElement repoName = driver.findElement(By.id("repository_name"));
		repoName.sendKeys("rep56"); 
		repoName.clear();
		repoName.sendKeys("$$$"); 
		repoName.clear();
		repoName.sendKeys("6574"); 
		WebElement repoDesc = driver.findElement(By.id("repository_description"));
		repoDesc.sendKeys("New repository");
		js.executeScript("window.scrollBy(0,2000)");
		WebElement addmeFile = driver.findElement(By.id("repository_auto_init"));
		addmeFile.click();
		addmeFile.sendKeys(Keys.TAB);addmeFile.sendKeys(Keys.TAB);
		addmeFile.sendKeys(Keys.TAB);addmeFile.sendKeys(Keys.TAB);
		addmeFile.sendKeys(Keys.TAB);addmeFile.sendKeys(Keys.ENTER);
	
		driver.quit();
	}

}
