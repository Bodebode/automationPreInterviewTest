package newregtest;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FirstNewUser {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void newUserSignUp() {
    // Test name: NewUserSignUp
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://moneygaming.qa.gameaccount.com/");
    // 2 | setWindowSize | 1440x900 | 
    driver.manage().window().setSize(new Dimension(1440, 900));
    // 3 | click | css=.newUser | 
    driver.findElement(By.cssSelector(".newUser")).click();
    // 4 | select | id=title | label=Mr
    {
      WebElement dropdown = driver.findElement(By.id("title"));
      dropdown.findElement(By.xpath("//option[. = 'Mr']")).click();
    }
    // 5 | click | css=#title > option:nth-child(2) | 
    driver.findElement(By.cssSelector("#title > option:nth-child(2)")).click();
    // 6 | click | id=forename | 
    driver.findElement(By.id("forename")).click();
    // 7 | type | id=forename | Nathan
    driver.findElement(By.id("forename")).sendKeys("Nathan");
    // 8 | type | name=map(lastName) | Ojuolape
    driver.findElement(By.name("map(lastName)")).sendKeys("Ojuolape");
    // 9 | click | id=dobDay | 
    driver.findElement(By.id("dobDay")).click();
    // 10 | select | id=dobDay | label=14
    {
      WebElement dropdown = driver.findElement(By.id("dobDay"));
      dropdown.findElement(By.xpath("//option[. = '14']")).click();
    }
    // 11 | click | css=#dobDay > option:nth-child(15) | 
    driver.findElement(By.cssSelector("#dobDay > option:nth-child(15)")).click();
    // 12 | select | id=dobMonth | label=October
    {
      WebElement dropdown = driver.findElement(By.id("dobMonth"));
      dropdown.findElement(By.xpath("//option[. = 'October']")).click();
    }
    // 13 | click | css=#dobMonth > option:nth-child(11) | 
    driver.findElement(By.cssSelector("#dobMonth > option:nth-child(11)")).click();
    // 14 | click | id=dobYear | 
    driver.findElement(By.id("dobYear")).click();
    // 15 | select | id=dobYear | label=1986
    {
      WebElement dropdown = driver.findElement(By.id("dobYear"));
      dropdown.findElement(By.xpath("//option[. = '1986']")).click();
    }
    // 16 | click | css=#dobYear > option:nth-child(13) | 
    driver.findElement(By.cssSelector("#dobYear > option:nth-child(13)")).click();
    // 17 | click | name=map(email) | 
    driver.findElement(By.name("map(email)")).click();
    // 18 | type | name=map(email) | bodebode@hotmail.co.uk
    driver.findElement(By.name("map(email)")).sendKeys("bodebode@hotmail.co.uk");
    // 19 | click | name=map(phone) | 
    driver.findElement(By.name("map(phone)")).click();
    // 20 | type | name=map(phone) | 07747365470
    driver.findElement(By.name("map(phone)")).sendKeys("07747365470");
    // 21 | click | name=map(mobile) | 
    driver.findElement(By.name("map(mobile)")).click();
    // 22 | type | name=map(mobile) | 07747347474
    driver.findElement(By.name("map(mobile)")).sendKeys("07747347474");
    // 23 | click | name=map(address1) | 
    driver.findElement(By.name("map(address1)")).click();
    // 24 | type | name=map(address1) | 12 matthews avenue
    driver.findElement(By.name("map(address1)")).sendKeys("12 matthews avenue");
    // 25 | click | name=map(addressCity) | 
    driver.findElement(By.name("map(addressCity)")).click();
    // 26 | type | name=map(addressCity) | London
    driver.findElement(By.name("map(addressCity)")).sendKeys("London");
    // 27 | type | name=map(stateProv) | Nigeria
    driver.findElement(By.name("map(stateProv)")).sendKeys("Nigeria");
    // 28 | click | name=map(postCode) | 
    driver.findElement(By.name("map(postCode)")).click();
    // 29 | type | name=map(postCode) | rm3 0dn
    driver.findElement(By.name("map(postCode)")).sendKeys("rm3 0dn");
    // 30 | click | id=countryList | 
    driver.findElement(By.id("countryList")).click();
    // 31 | select | id=countryList | label=UNITED KINGDOM
    {
      WebElement dropdown = driver.findElement(By.id("countryList"));
      dropdown.findElement(By.xpath("//option[. = 'UNITED KINGDOM']")).click();
    }
    // 32 | click | css=#countryList > option:nth-child(2) | 
    driver.findElement(By.cssSelector("#countryList > option:nth-child(2)")).click();
    // 33 | click | name=map(userName) | 
    driver.findElement(By.name("map(userName)")).click();
    // 34 | type | name=map(userName) | Nathannn
    driver.findElement(By.name("map(userName)")).sendKeys("Nathannn");
    // 35 | click | css=fieldset:nth-child(3) | 
    driver.findElement(By.cssSelector("fieldset:nth-child(3)")).click();
    // 36 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 37 | type | id=password | Abcd1234
    driver.findElement(By.id("password")).sendKeys("Abcd1234");
    // 38 | click | name=map(passwordConfirm) | 
    driver.findElement(By.name("map(passwordConfirm)")).click();
    // 39 | type | name=map(passwordConfirm) | Abcd1234
    driver.findElement(By.name("map(passwordConfirm)")).sendKeys("Abcd1234");
    // 40 | select | id=securityQuestionOne | label=What was your childhood nickname?
    {
      WebElement dropdown = driver.findElement(By.id("securityQuestionOne"));
      dropdown.findElement(By.xpath("//option[. = 'What was your childhood nickname?']")).click();
    }
    // 41 | click | css=#securityQuestionOne > option:nth-child(2) | 
    driver.findElement(By.cssSelector("#securityQuestionOne > option:nth-child(2)")).click();
    // 42 | click | css=fieldset:nth-child(3) > label:nth-child(15) | 
    driver.findElement(By.cssSelector("fieldset:nth-child(3) > label:nth-child(15)")).click();
    // 43 | click | name=map(securityAnswerOne) | 
    driver.findElement(By.name("map(securityAnswerOne)")).click();
    // 44 | type | name=map(securityAnswerOne) | my Dog
    driver.findElement(By.name("map(securityAnswerOne)")).sendKeys("my Dog");
    // 45 | select | id=securityQuestionTwo | label=What is your favorite color?
    {
      WebElement dropdown = driver.findElement(By.id("securityQuestionTwo"));
      dropdown.findElement(By.xpath("//option[. = 'What is your favorite color?']")).click();
    }
    // 46 | click | css=#securityQuestionTwo > option:nth-child(2) | 
    driver.findElement(By.cssSelector("#securityQuestionTwo > option:nth-child(2)")).click();
    // 47 | click | name=map(securityAnswerTwo) | 
    driver.findElement(By.name("map(securityAnswerTwo)")).click();
    // 48 | type | name=map(securityAnswerTwo) | Black
    driver.findElement(By.name("map(securityAnswerTwo)")).sendKeys("Black");
    // 49 | select | name=map(currency) | label=Pounds Sterling
    {
      WebElement dropdown = driver.findElement(By.name("map(currency)"));
      dropdown.findElement(By.xpath("//option[. = 'Pounds Sterling']")).click();
    }
    // 50 | click | css=.required:nth-child(2) > option:nth-child(2) | 
    driver.findElement(By.cssSelector(".required:nth-child(2) > option:nth-child(2)")).click();
    // 51 | click | name=map(terms) | 
    driver.findElement(By.name("map(terms)")).click();
  }
  {	// 52 | click | JOIN
	  driver.findElement(By.id("form")).click();
	  }
  
}
